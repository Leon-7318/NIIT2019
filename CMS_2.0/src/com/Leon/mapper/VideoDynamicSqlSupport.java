package com.Leon.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class VideoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.259+08:00", comments="Source Table: video")
    public static final Video video = new Video();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.259+08:00", comments="Source field: video.id")
    public static final SqlColumn<Integer> id = video.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.259+08:00", comments="Source field: video.title")
    public static final SqlColumn<String> title = video.title;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.259+08:00", comments="Source field: video.url")
    public static final SqlColumn<String> url = video.url;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.259+08:00", comments="Source field: video.date")
    public static final SqlColumn<Date> date = video.date;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.259+08:00", comments="Source field: video.sketch")
    public static final SqlColumn<String> sketch = video.sketch;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.259+08:00", comments="Source field: video.image")
    public static final SqlColumn<String> image = video.image;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.259+08:00", comments="Source field: video.state")
    public static final SqlColumn<Integer> state = video.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.259+08:00", comments="Source field: video.author")
    public static final SqlColumn<String> author = video.author;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.259+08:00", comments="Source Table: video")
    public static final class Video extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);

        public final SqlColumn<String> url = column("url", JDBCType.VARCHAR);

        public final SqlColumn<Date> date = column("date", JDBCType.DATE);

        public final SqlColumn<String> sketch = column("sketch", JDBCType.VARCHAR);

        public final SqlColumn<String> image = column("image", JDBCType.VARCHAR);

        public final SqlColumn<Integer> state = column("state", JDBCType.INTEGER);

        public final SqlColumn<String> author = column("author", JDBCType.VARCHAR);

        public Video() {
            super("video");
        }
    }
}