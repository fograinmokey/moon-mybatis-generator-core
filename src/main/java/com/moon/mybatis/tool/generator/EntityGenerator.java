package com.moon.mybatis.tool.generator;

import com.moon.mybatis.tool.entity.Table;

import java.io.File;

/**
 * @author quzile
 * @version 1.0
 * @since 2015/8/17
 */
public class EntityGenerator extends FileGenerator {

    private Table table;
    private File file;
    private boolean inherit;
    private String packagename;

    public EntityGenerator(Table table, File file) {
        this.table = table;
        this.file = file;
    }


    @Override
    public boolean process() {


        return false;
    }



}
