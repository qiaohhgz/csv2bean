package com.jim.cvs2bean.types;

/**
 * JimQiao
 * 2014-11-27 16:25
 */
public class StringType implements Type {
    @Override
    public Object parse(String value) {
        return value;
    }
}
