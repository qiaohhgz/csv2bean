package com.jim.cvs2bean.types;

/**
 * JimQiao
 * 2014-11-27 16:30
 */
public class LongType implements Type {
    @Override
    public Object parse(String value) {
        return Long.valueOf(value);
    }
}
