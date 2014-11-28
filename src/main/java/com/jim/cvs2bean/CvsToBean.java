package com.jim.cvs2bean;

import java.io.File;
import java.util.List;

/**
 * JimQiao
 * 2014-11-27 15:54
 */
public interface CvsToBean {
    <T> List<T> parse(File inFile, Class<T> clazz) throws Exception;
}
