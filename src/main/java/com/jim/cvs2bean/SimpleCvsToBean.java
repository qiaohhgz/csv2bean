package com.jim.cvs2bean;

import com.jim.cvs2bean.types.DefaultTypes;
import com.jim.cvs2bean.types.Type;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JimQiao
 * 2014-11-27 15:57
 */
public class SimpleCvsToBean extends AbstractCvsToBean {

    protected <T> T toBean(List<String> heads, String[] rowValues, Class<T> clazz) throws Exception {
        T instance = clazz.newInstance();
        Map<String, String> rowMap = new HashMap<String, String>();
        for (int i = 0; i < heads.size(); i++) {
            rowMap.put(heads.get(i), rowValues[i]);
        }

        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            Class<?> typeClass = field.getType();
            Method method = clazz.getMethod(getSetMethodName(field), typeClass);
            String key = typeClass.getName();
            Type type = types.get(key);
            if (type == null) {
                type = DefaultTypes.get(key);
            }
            method.invoke(instance, type.parse(rowMap.get(field.getName())));
        }
        return instance;
    }

    private String getSetMethodName(Field field) {
        return String.format("set%s%s", field.getName().substring(0, 1).toUpperCase(), field.getName().substring(1));
    }
}
