package com.Leon.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UsersDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.258+08:00", comments="Source Table: users")
    public static final Users users = new Users();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.258+08:00", comments="Source field: users.name")
    public static final SqlColumn<String> name = users.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.258+08:00", comments="Source field: users.password")
    public static final SqlColumn<String> password = users.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.258+08:00", comments="Source field: users.mail")
    public static final SqlColumn<String> mail = users.mail;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.258+08:00", comments="Source field: users.phone")
    public static final SqlColumn<String> phone = users.phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.258+08:00", comments="Source field: users.image")
    public static final SqlColumn<String> image = users.image;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.258+08:00", comments="Source Table: users")
    public static final class Users extends SqlTable {
        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<String> mail = column("mail", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<String> image = column("image", JDBCType.VARCHAR);

        public Users() {
            super("users");
        }
    }
}