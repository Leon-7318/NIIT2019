package com.Leon.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ManagerDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    public static final Manager manager = new Manager();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source field: manager.name")
    public static final SqlColumn<String> name = manager.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source field: manager.password")
    public static final SqlColumn<String> password = manager.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source field: manager.mail")
    public static final SqlColumn<String> mail = manager.mail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source field: manager.phone")
    public static final SqlColumn<String> phone = manager.phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source field: manager.image")
    public static final SqlColumn<String> image = manager.image;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    public static final class Manager extends SqlTable {
        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> mail = column("mail", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<String> image = column("image", JDBCType.VARCHAR);

        public Manager() {
            super("manager");
        }
    }
}