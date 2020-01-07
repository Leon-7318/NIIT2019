package com.Leon.mapper;

import static com.Leon.mapper.ManagerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.Leon.entity.Manager;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface ManagerMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    BasicColumn[] selectList = BasicColumn.columnList(name, password, mail, phone, image);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Manager> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Manager> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ManagerResult")
    Optional<Manager> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ManagerResult", value = {
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="mail", property="mail", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="image", property="image", jdbcType=JdbcType.VARCHAR)
    })
    List<Manager> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, manager, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, manager, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    default int deleteByPrimaryKey(String name_) {
        return delete(c -> 
            c.where(name, isEqualTo(name_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    default int insert(Manager record) {
        return MyBatis3Utils.insert(this::insert, record, manager, c ->
            c.map(name).toProperty("name")
            .map(password).toProperty("password")
            .map(mail).toProperty("mail")
            .map(phone).toProperty("phone")
            .map(image).toProperty("image")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    default int insertMultiple(Collection<Manager> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, manager, c ->
            c.map(name).toProperty("name")
            .map(password).toProperty("password")
            .map(mail).toProperty("mail")
            .map(phone).toProperty("phone")
            .map(image).toProperty("image")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    default int insertSelective(Manager record) {
        return MyBatis3Utils.insert(this::insert, record, manager, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(mail).toPropertyWhenPresent("mail", record::getMail)
            .map(phone).toPropertyWhenPresent("phone", record::getPhone)
            .map(image).toPropertyWhenPresent("image", record::getImage)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    default Optional<Manager> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, manager, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    default List<Manager> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, manager, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    default List<Manager> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, manager, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    default Optional<Manager> selectByPrimaryKey(String name_) {
        return selectOne(c ->
            c.where(name, isEqualTo(name_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, manager, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    static UpdateDSL<UpdateModel> updateAllColumns(Manager record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(password).equalTo(record::getPassword)
                .set(mail).equalTo(record::getMail)
                .set(phone).equalTo(record::getPhone)
                .set(image).equalTo(record::getImage);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.252+08:00", comments="Source Table: manager")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Manager record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(mail).equalToWhenPresent(record::getMail)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(image).equalToWhenPresent(record::getImage);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.253+08:00", comments="Source Table: manager")
    default int updateByPrimaryKey(Manager record) {
        return update(c ->
            c.set(password).equalTo(record::getPassword)
            .set(mail).equalTo(record::getMail)
            .set(phone).equalTo(record::getPhone)
            .set(image).equalTo(record::getImage)
            .where(name, isEqualTo(record::getName))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.253+08:00", comments="Source Table: manager")
    default int updateByPrimaryKeySelective(Manager record) {
        return update(c ->
            c.set(password).equalToWhenPresent(record::getPassword)
            .set(mail).equalToWhenPresent(record::getMail)
            .set(phone).equalToWhenPresent(record::getPhone)
            .set(image).equalToWhenPresent(record::getImage)
            .where(name, isEqualTo(record::getName))
        );
    }
}