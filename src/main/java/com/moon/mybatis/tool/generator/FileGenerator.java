package com.moon.mybatis.tool.generator;

/**
 * @author quzile
 * @version 1.0
 * @since 2015/8/17
 */
public abstract class FileGenerator {

    protected abstract boolean process();



    public static void main(String[] args) {
        FileGenerator gen = new FileGenerator() {
            @Override
            protected boolean process() {
                return false;
            }
        };


//        String s = gen.getPropertyName("_table_jd_wallet_");
//        System.out.println(s);
//
//        s = gen.getPropertyName("_table_jd_wallet_");
//        System.out.println(s);
//
//        s = gen.getPropertyName("_table_jd_wallet");
//        System.out.println(s);
//
//        s = gen.getPropertyName("_t_g_s");
//        System.out.println(s);
//
//        s = gen.getPropertyName("table_jd_wallet_");
//        System.out.println(s);
//
//        s = gen.getPropertyName("_table___jd___wallet");
//        System.out.println(s);
    }

}
