package com.jim.cvs2bean;

import com.jim.cvs2bean.types.Type;
import org.junit.Test;

import java.io.File;
import java.util.List;

public class CvsToBeanTest {

    @Test
    public void testParse() throws Exception {
        File file = new File("D:\\Users\\goodbaby\\Documents\\开发测试文档\\T12218双十一批量创建赠品单工具\\zp_kdc.csv");
        CvsToBean toBean = new AnnotationCvsToBean();
        List<Bean> beans = toBean.parse(file, Bean.class);
        for (Bean bean : beans) {
            System.out.println(bean);
        }
    }

    @Test
    public void testType() throws Exception {
        File file = new File("D:\\Users\\goodbaby\\Documents\\开发测试文档\\T12218双十一批量创建赠品单工具\\zp_bbxz_VerifyAddressTest_2014_11_27_14_35_03_138.csv");
        SimpleCvsToBean toBean = new SimpleCvsToBean();
        toBean.setEncoding("gbk");
        toBean.put("boolean", new Type() {
            @Override
            public Object parse(String value) {
                return value != null && value.equals("OK");
            }
        });
        List<TypeBean> beans = toBean.parse(file, TypeBean.class);
        for (TypeBean bean : beans) {
            System.out.println(bean);
        }
    }


}