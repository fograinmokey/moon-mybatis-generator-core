package com.moon.mybatis.tool.type;

import java.util.HashMap;
import java.util.Map;

/**
 * @author quzile
 * @version 1.0
 * @since 2015/8/17
 */
public enum DataType {

    TINYINT(Category.NUMERIC, "tinyint", "Integer", "java.lang.Integer", false),

    SMALLINT(Category.NUMERIC, "smallint", "Integer", "java.lang.Integer", false),

    MEDIUMINT(Category.NUMERIC, "mediumint", "Integer", "java.lang.Integer", false),

    INT(Category.NUMERIC, "int", "Integer", "java.lang.Integer", false),

    BIGINT(Category.NUMERIC, "bigint", "Long", "java.lang.Long", false),

    FLOAT(Category.NUMERIC, "float", "Double", "java.lang.Double", false),

    DOUBLE(Category.NUMERIC, "double", "Double", "java.lang.Double", false),

    DECIMAL(Category.NUMERIC, "decimal", "BigDecimal", "java.math.BigDecimal", true),

    DATE(Category.DATETIME, "date", "Date", "java.util.Date", true),

    TIME(Category.DATETIME, "time", "Date", "java.util.Date", true),

    DATETIME(Category.DATETIME, "datetime", "Date", "java.util.Date", true),

    TIMESTAMP(Category.DATETIME, "timestamp", "Date", "java.util.Date", true),

    YEAR(Category.DATETIME, "year", "Integer", "java.lang.Integer", false),

    CHAR(Category.STRING, "char", "String", "java.lang.String", false),

    VARCHAR(Category.STRING, "varchar", "String", "java.lang.String", false),

    NVARCHAR(Category.STRING, "nvarchar", "String", "java.lang.String", false),

    TINYTEXT(Category.STRING, "tinytext", "String", "java.lang.String", false),

    TEXT(Category.STRING, "text", "String", "java.lang.String", false),

    MEDIUMTEXT(Category.STRING, "mediumtext", "String", "java.lang.String", false),

    LONGTEXT(Category.STRING, "longtext", "String", "java.lang.String", false);

    private final Category category;
    private final String name;
    private final String javaType;
    private final String qualifiedName;
    private final boolean imported;

    private static Map<String, DataType> map = new HashMap<String, DataType>();

    static {
        for (DataType o : DataType.values())
            map.put(o.getName(), o);
    }

    public static DataType from(String name) {
        return map.get(name);
    }

    DataType(Category category, String name, String javaType, String qualifiedName, boolean imported) {
        this.category = category;
        this.name = name;
        this.javaType = javaType;
        this.qualifiedName = qualifiedName;
        this.imported = imported;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public String getJavaType() {
        return javaType;
    }

    public String getQualifiedName() {
        return qualifiedName;
    }

    public boolean isImported() {
        return imported;
    }

    public enum Category {
        NUMERIC,

        DATETIME,

        STRING,

        GEO,
    }

}
