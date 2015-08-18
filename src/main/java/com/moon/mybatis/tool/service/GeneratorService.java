package com.moon.mybatis.tool.service;

import com.moon.mybatis.tool.dao.GeneratorDao;
import com.moon.mybatis.tool.entity.Column;
import com.moon.mybatis.tool.entity.Table;
import com.moon.mybatis.tool.velocity.VelocityFactory;
import org.apache.velocity.VelocityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author quzile
 * @version 1.0
 * @since 2015/8/17
 */
@Service
public class GeneratorService {

    @Autowired
    private GeneratorDao generatorDao;

    public List<Table> findTables(String schema) {
        List<Table> tables = new ArrayList<Table>();
        Map<String, Table> map = new HashMap<String, Table>();
        for (Column column : generatorDao.queryForList(schema)) {
            String name = column.getTableName();
            if (!map.containsKey(name)) {
                Table table = new Table(name);
                map.put(name, table);
                tables.add(table);
            }
            map.get(name).add(column);
        }
        return tables;
    }

    public void process(List<Table> list, String path, String packageName) {
        for (Table table : list)
            process(table, path, packageName);
    }

    public void process(Table table, String path, String packageName) {
        VelocityFactory factory = VelocityFactory.getInstance();
        VelocityContext context = new VelocityContext();

        // user and date
        context.put("user", System.getProperty("user.name"));
        context.put("date", dateFormat());

        // table details
        context.put("table", table);
        context.put("packageName", packageName);
        context.put("baseClassName", "Entity"); // 使用全限定名称

        //
        String filepath = filepath(path, packageName);
        File file = new File(new File(filepath), table.getClassName() + ".java");
        factory.generate(context, "/vm/entity.vm", file);
    }

    private String dateFormat() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }

    private String filepath(String path, String packageName) {
        return path + File.separator + packageName.replace(".", File.separator);
    }


}
