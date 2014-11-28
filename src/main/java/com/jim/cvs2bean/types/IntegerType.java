package com.jim.cvs2bean.types;

/**
 * JimQiao
 * 2014-11-27 16:30
 */
public class IntegerType implements Type {
    @Override
    public Object parse(String value) {
        return Integer.valueOf(value);
    }
}
