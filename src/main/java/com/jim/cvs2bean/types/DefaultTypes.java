package com.jim.cvs2bean.types;

import java.util.HashMap;
import java.util.Map;

/**
 * JimQiao
 * 2014-11-27 16:26
 */
public class DefaultTypes {
    private static Map<String, Type> map;

    static {
        map = new HashMap<String, Type>();
        map.put("int", new IntegerType());
        map.put("double", new DoubleType());
        map.put("long", new LongType());
        map.put("boolean", new BoolType());
        map.put("java.lang.String", new StringType());
        map.put("java.lang.Double", new DoubleType());
        map.put("java.lang.Integer", new IntegerType());
        map.put("java.lang.Long", new LongType());
        map.put("java.lang.Boolean", new BoolType());
    }

    public static Type get(String key) {
        Type type = map.get(key);
        if (type == null) {
            System.err.println("Not found type " + key);
        }
        return type;
    }
}
