package com.Leon.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ConferenceDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.249+08:00", comments="Source Table: conference")
    public static final Conference conference = new Conference();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.249+08:00", comments="Source field: conference.id")
    public static final SqlColumn<Integer> id = conference.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.249+08:00", comments="Source field: conference.name")
    public static final SqlColumn<String> name = conference.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.249+08:00", comments="Source field: conference.date")
    public static final SqlColumn<Date> date = conference.date;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.249+08:00", comments="Source field: conference.address")
    public static final SqlColumn<String> address = conference.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.249+08:00", comments="Source field: conference.poster")
    public static final SqlColumn<String> poster = conference.poster;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.249+08:00", comments="Source field: conference.sketch")
    public static final SqlColumn<String> sketch = conference.sketch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.249+08:00", comments="Source field: conference.detail")
    public static final SqlColumn<String> detail = conference.detail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.25+08:00", comments="Source field: conference.images")
    public static final SqlColumn<String> images = conference.images;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.25+08:00", comments="Source field: conference.state")
    public static final SqlColumn<Integer> state = conference.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.25+08:00", comments="Source field: conference.author")
    public static final SqlColumn<String> author = conference.author;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.249+08:00", comments="Source Table: conference")
    public static final class Conference extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Date> date = column("date", JDBCType.DATE);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<String> poster = column("poster", JDBCType.VARCHAR);

        public final SqlColumn<String> sketch = column("sketch", JDBCType.VARCHAR);

        public final SqlColumn<String> detail = column("detail", JDBCType.VARCHAR);

        public final SqlColumn<String> images = column("images", JDBCType.VARCHAR);

        public final SqlColumn<Integer> state = column("state", JDBCType.INTEGER);

        public final SqlColumn<String> author = column("author", JDBCType.VARCHAR);

        public Conference() {
            super("conference");
        }
    }
}