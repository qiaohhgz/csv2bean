package com.jim.cvs2bean;

import com.jim.cvs2bean.types.Type;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JimQiao
 * 2014-11-27 14:12
 */
public abstract class AbstractCvsToBean implements CvsToBean {

    protected String encoding = "UTF-8";
    protected String separator = ",";
    protected Map<String, Type> types;

    public AbstractCvsToBean() {
    }

    @Override
    public <T> List<T> parse(File inFile, Class<T> clazz) throws Exception {
        LineIterator lineIterator = FileUtils.lineIterator(inFile, encoding);
        List<String> heads = new ArrayList<String>();
        if (lineIterator.hasNext()) {
            String line = lineIterator.nextLine();
            String[] items = splitLine(line);
            heads = Arrays.asList(items);
        }
        List<T> beans = new ArrayList<T>();
        for (int rowNum = 0; lineIterator.hasNext(); rowNum++) {
            String line = lineIterator.nextLine();
            String[] items = splitLine(line);
            beans.add(toBean(heads, items, clazz));
        }
        return beans;
    }

    private String[] splitLine(String line) {
        return line.split(separator);
    }

    protected abstract <T> T toBean(List<String> heads, String[] rowValues, Class<T> clazz) throws Exception;

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public void setTypes(Map<String, Type> types) {
        this.types = types;
    }

    public void put(String key,Type type) {
        if (this.types == null) {
            this.types = new HashMap<String, Type>();
        }
        this.types.put(key, type);
    }
}
