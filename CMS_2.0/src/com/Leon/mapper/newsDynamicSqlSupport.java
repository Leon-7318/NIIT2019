package com.Leon.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class newsDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.253+08:00", comments="Source Table: new")
    public static final news news = new news();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.253+08:00", comments="Source field: new.id")
    public static final SqlColumn<Integer> id = news.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.253+08:00", comments="Source field: new.title")
    public static final SqlColumn<String> title = news.title;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.253+08:00", comments="Source field: new.date")
    public static final SqlColumn<Date> date = news.date;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.253+08:00", comments="Source field: new.sketch")
    public static final SqlColumn<String> sketch = news.sketch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.253+08:00", comments="Source field: new.detail")
    public static final SqlColumn<String> detail = news.detail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.253+08:00", comments="Source field: new.image")
    public static final SqlColumn<String> image = news.image;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.253+08:00", comments="Source field: new.images")
    public static final SqlColumn<String> images = news.images;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source field: new.state")
    public static final SqlColumn<Integer> state = news.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source field: new.author")
    public static final SqlColumn<String> author = news.author;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.253+08:00", comments="Source Table: new")
    public static final class news extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);

        public final SqlColumn<Date> date = column("date", JDBCType.DATE);

        public final SqlColumn<String> sketch = column("sketch", JDBCType.VARCHAR);

        public final SqlColumn<String> detail = column("detail", JDBCType.VARCHAR);

        public final SqlColumn<String> image = column("image", JDBCType.VARCHAR);

        public final SqlColumn<String> images = column("images", JDBCType.VARCHAR);

        public final SqlColumn<Integer> state = column("state", JDBCType.INTEGER);

        public final SqlColumn<String> author = column("author", JDBCType.VARCHAR);

        public news() {
            super("new");
        }
    }
}