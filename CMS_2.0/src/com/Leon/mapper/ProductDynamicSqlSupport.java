package com.Leon.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ProductDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source Table: product")
    public static final Product product = new Product();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.id")
    public static final SqlColumn<Integer> id = product.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.name")
    public static final SqlColumn<String> name = product.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.type")
    public static final SqlColumn<String> type = product.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.date")
    public static final SqlColumn<Date> date = product.date;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.sketch")
    public static final SqlColumn<String> sketch = product.sketch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.details")
    public static final SqlColumn<String> details = product.details;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.image")
    public static final SqlColumn<String> image = product.image;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.images")
    public static final SqlColumn<String> images = product.images;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.state")
    public static final SqlColumn<Integer> state = product.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.author")
    public static final SqlColumn<String> author = product.author;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.brand")
    public static final SqlColumn<String> brand = product.brand;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.price")
    public static final SqlColumn<Float> price = product.price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.size")
    public static final SqlColumn<String> size = product.size;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.weight")
    public static final SqlColumn<String> weight = product.weight;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.cpu")
    public static final SqlColumn<String> cpu = product.cpu;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.ram")
    public static final SqlColumn<String> ram = product.ram;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.rom")
    public static final SqlColumn<String> rom = product.rom;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source field: product.battery")
    public static final SqlColumn<String> battery = product.battery;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source Table: product")
    public static final class Product extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> type = column("type", JDBCType.VARCHAR);

        public final SqlColumn<Date> date = column("date", JDBCType.DATE);

        public final SqlColumn<String> sketch = column("sketch", JDBCType.VARCHAR);

        public final SqlColumn<String> details = column("details", JDBCType.VARCHAR);

        public final SqlColumn<String> image = column("image", JDBCType.VARCHAR);

        public final SqlColumn<String> images = column("images", JDBCType.VARCHAR);

        public final SqlColumn<Integer> state = column("state", JDBCType.INTEGER);

        public final SqlColumn<String> author = column("author", JDBCType.VARCHAR);

        public final SqlColumn<String> brand = column("brand", JDBCType.VARCHAR);

        public final SqlColumn<Float> price = column("price", JDBCType.REAL);

        public final SqlColumn<String> size = column("size", JDBCType.VARCHAR);

        public final SqlColumn<String> weight = column("weight", JDBCType.VARCHAR);

        public final SqlColumn<String> cpu = column("cpu", JDBCType.VARCHAR);

        public final SqlColumn<String> ram = column("ram", JDBCType.VARCHAR);

        public final SqlColumn<String> rom = column("rom", JDBCType.VARCHAR);

        public final SqlColumn<String> battery = column("battery", JDBCType.VARCHAR);

        public Product() {
            super("product");
        }
    }
}