package com.Leon.mapper;

import static com.Leon.mapper.ConferenceDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.Leon.entity.Conference;
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
public interface ConferenceMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.251+08:00", comments="Source Table: conference")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, date, address, poster, sketch, detail, images, state, author);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.25+08:00", comments="Source Table: conference")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.25+08:00", comments="Source Table: conference")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.25+08:00", comments="Source Table: conference")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Conference> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.25+08:00", comments="Source Table: conference")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Conference> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.25+08:00", comments="Source Table: conference")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ConferenceResult")
    Optional<Conference> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.25+08:00", comments="Source Table: conference")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ConferenceResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.DATE),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="poster", property="poster", jdbcType=JdbcType.VARCHAR),
        @Result(column="sketch", property="sketch", jdbcType=JdbcType.VARCHAR),
        @Result(column="detail", property="detail", jdbcType=JdbcType.VARCHAR),
        @Result(column="images", property="images", jdbcType=JdbcType.VARCHAR),
        @Result(column="state", property="state", jdbcType=JdbcType.INTEGER),
        @Result(column="author", property="author", jdbcType=JdbcType.VARCHAR)
    })
    List<Conference> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.25+08:00", comments="Source Table: conference")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.25+08:00", comments="Source Table: conference")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, conference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.25+08:00", comments="Source Table: conference")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, conference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.25+08:00", comments="Source Table: conference")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.25+08:00", comments="Source Table: conference")
    default int insert(Conference record) {
        return MyBatis3Utils.insert(this::insert, record, conference, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(date).toProperty("date")
            .map(address).toProperty("address")
            .map(poster).toProperty("poster")
            .map(sketch).toProperty("sketch")
            .map(detail).toProperty("detail")
            .map(images).toProperty("images")
            .map(state).toProperty("state")
            .map(author).toProperty("author")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.25+08:00", comments="Source Table: conference")
    default int insertMultiple(Collection<Conference> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, conference, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(date).toProperty("date")
            .map(address).toProperty("address")
            .map(poster).toProperty("poster")
            .map(sketch).toProperty("sketch")
            .map(detail).toProperty("detail")
            .map(images).toProperty("images")
            .map(state).toProperty("state")
            .map(author).toProperty("author")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.25+08:00", comments="Source Table: conference")
    default int insertSelective(Conference record) {
        return MyBatis3Utils.insert(this::insert, record, conference, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(date).toPropertyWhenPresent("date", record::getDate)
            .map(address).toPropertyWhenPresent("address", record::getAddress)
            .map(poster).toPropertyWhenPresent("poster", record::getPoster)
            .map(sketch).toPropertyWhenPresent("sketch", record::getSketch)
            .map(detail).toPropertyWhenPresent("detail", record::getDetail)
            .map(images).toPropertyWhenPresent("images", record::getImages)
            .map(state).toPropertyWhenPresent("state", record::getState)
            .map(author).toPropertyWhenPresent("author", record::getAuthor)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.251+08:00", comments="Source Table: conference")
    default Optional<Conference> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, conference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.251+08:00", comments="Source Table: conference")
    default List<Conference> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, conference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.251+08:00", comments="Source Table: conference")
    default List<Conference> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, conference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.251+08:00", comments="Source Table: conference")
    default Optional<Conference> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.251+08:00", comments="Source Table: conference")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, conference, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.251+08:00", comments="Source Table: conference")
    static UpdateDSL<UpdateModel> updateAllColumns(Conference record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(date).equalTo(record::getDate)
                .set(address).equalTo(record::getAddress)
                .set(poster).equalTo(record::getPoster)
                .set(sketch).equalTo(record::getSketch)
                .set(detail).equalTo(record::getDetail)
                .set(images).equalTo(record::getImages)
                .set(state).equalTo(record::getState)
                .set(author).equalTo(record::getAuthor);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.251+08:00", comments="Source Table: conference")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Conference record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(date).equalToWhenPresent(record::getDate)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(poster).equalToWhenPresent(record::getPoster)
                .set(sketch).equalToWhenPresent(record::getSketch)
                .set(detail).equalToWhenPresent(record::getDetail)
                .set(images).equalToWhenPresent(record::getImages)
                .set(state).equalToWhenPresent(record::getState)
                .set(author).equalToWhenPresent(record::getAuthor);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.251+08:00", comments="Source Table: conference")
    default int updateByPrimaryKey(Conference record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(date).equalTo(record::getDate)
            .set(address).equalTo(record::getAddress)
            .set(poster).equalTo(record::getPoster)
            .set(sketch).equalTo(record::getSketch)
            .set(detail).equalTo(record::getDetail)
            .set(images).equalTo(record::getImages)
            .set(state).equalTo(record::getState)
            .set(author).equalTo(record::getAuthor)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.251+08:00", comments="Source Table: conference")
    default int updateByPrimaryKeySelective(Conference record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(date).equalToWhenPresent(record::getDate)
            .set(address).equalToWhenPresent(record::getAddress)
            .set(poster).equalToWhenPresent(record::getPoster)
            .set(sketch).equalToWhenPresent(record::getSketch)
            .set(detail).equalToWhenPresent(record::getDetail)
            .set(images).equalToWhenPresent(record::getImages)
            .set(state).equalToWhenPresent(record::getState)
            .set(author).equalToWhenPresent(record::getAuthor)
            .where(id, isEqualTo(record::getId))
        );
    }
}