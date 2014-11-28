package com.jim.cvs2bean;

import com.jim.cvs2bean.annotation.Head;
import com.jim.cvs2bean.types.DefaultTypes;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JimQiao
 * 2014-11-27 15:57
 */
public class AnnotationCvsToBean extends AbstractCvsToBean {

    protected <T> T toBean(List<String> heads, String[] rowValues, Class<T> clazz) throws Exception {
        T instance = clazz.newInstance();
        Method[] methods = clazz.getDeclaredMethods();
        Map<String, String> rowMap = new HashMap<String, String>();
        for (int i = 0; i < heads.size(); i++) {
            rowMap.put(heads.get(i), rowValues[i]);
        }
        for (int i = 0; i < methods.length; i++) {
            Method method = methods[i];
            Head head = method.getAnnotation(Head.class);
            if (head == null) continue;
            String rowValue = rowMap.get(head.value());
            Class<?>[] parameterTypes = method.getParameterTypes();
            String simpleName = parameterTypes[0].getName();
            method.invoke(instance, DefaultTypes.get(simpleName).parse(rowValue));
        }
        return instance;
    }
}
