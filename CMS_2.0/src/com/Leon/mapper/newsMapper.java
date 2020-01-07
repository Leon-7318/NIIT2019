package com.Leon.mapper;

import static com.Leon.mapper.newsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.Leon.entity.news;
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
public interface newsMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    BasicColumn[] selectList = BasicColumn.columnList(id, title, date, sketch, detail, image, images, state, author);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<news> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<news> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("newsResult")
    Optional<news> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="newsResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.DATE),
        @Result(column="sketch", property="sketch", jdbcType=JdbcType.VARCHAR),
        @Result(column="detail", property="detail", jdbcType=JdbcType.VARCHAR),
        @Result(column="image", property="image", jdbcType=JdbcType.VARCHAR),
        @Result(column="images", property="images", jdbcType=JdbcType.VARCHAR),
        @Result(column="state", property="state", jdbcType=JdbcType.INTEGER),
        @Result(column="author", property="author", jdbcType=JdbcType.VARCHAR)
    })
    List<news> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, news, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, news, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    default int insert(news record) {
        return MyBatis3Utils.insert(this::insert, record, news, c ->
            c.map(id).toProperty("id")
            .map(title).toProperty("title")
            .map(date).toProperty("date")
            .map(sketch).toProperty("sketch")
            .map(detail).toProperty("detail")
            .map(image).toProperty("image")
            .map(images).toProperty("images")
            .map(state).toProperty("state")
            .map(author).toProperty("author")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    default int insertMultiple(Collection<news> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, news, c ->
            c.map(id).toProperty("id")
            .map(title).toProperty("title")
            .map(date).toProperty("date")
            .map(sketch).toProperty("sketch")
            .map(detail).toProperty("detail")
            .map(image).toProperty("image")
            .map(images).toProperty("images")
            .map(state).toProperty("state")
            .map(author).toProperty("author")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    default int insertSelective(news record) {
        return MyBatis3Utils.insert(this::insert, record, news, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(title).toPropertyWhenPresent("title", record::getTitle)
            .map(date).toPropertyWhenPresent("date", record::getDate)
            .map(sketch).toPropertyWhenPresent("sketch", record::getSketch)
            .map(detail).toPropertyWhenPresent("detail", record::getDetail)
            .map(image).toPropertyWhenPresent("image", record::getImage)
            .map(images).toPropertyWhenPresent("images", record::getImages)
            .map(state).toPropertyWhenPresent("state", record::getState)
            .map(author).toPropertyWhenPresent("author", record::getAuthor)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    default Optional<news> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, news, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    default List<news> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, news, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    default List<news> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, news, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    default Optional<news> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, news, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    static UpdateDSL<UpdateModel> updateAllColumns(news record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(title).equalTo(record::getTitle)
                .set(date).equalTo(record::getDate)
                .set(sketch).equalTo(record::getSketch)
                .set(detail).equalTo(record::getDetail)
                .set(image).equalTo(record::getImage)
                .set(images).equalTo(record::getImages)
                .set(state).equalTo(record::getState)
                .set(author).equalTo(record::getAuthor);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(news record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(title).equalToWhenPresent(record::getTitle)
                .set(date).equalToWhenPresent(record::getDate)
                .set(sketch).equalToWhenPresent(record::getSketch)
                .set(detail).equalToWhenPresent(record::getDetail)
                .set(image).equalToWhenPresent(record::getImage)
                .set(images).equalToWhenPresent(record::getImages)
                .set(state).equalToWhenPresent(record::getState)
                .set(author).equalToWhenPresent(record::getAuthor);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.254+08:00", comments="Source Table: new")
    default int updateByPrimaryKey(news record) {
        return update(c ->
            c.set(title).equalTo(record::getTitle)
            .set(date).equalTo(record::getDate)
            .set(sketch).equalTo(record::getSketch)
            .set(detail).equalTo(record::getDetail)
            .set(image).equalTo(record::getImage)
            .set(images).equalTo(record::getImages)
            .set(state).equalTo(record::getState)
            .set(author).equalTo(record::getAuthor)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.255+08:00", comments="Source Table: new")
    default int updateByPrimaryKeySelective(news record) {
        return update(c ->
            c.set(title).equalToWhenPresent(record::getTitle)
            .set(date).equalToWhenPresent(record::getDate)
            .set(sketch).equalToWhenPresent(record::getSketch)
            .set(detail).equalToWhenPresent(record::getDetail)
            .set(image).equalToWhenPresent(record::getImage)
            .set(images).equalToWhenPresent(record::getImages)
            .set(state).equalToWhenPresent(record::getState)
            .set(author).equalToWhenPresent(record::getAuthor)
            .where(id, isEqualTo(record::getId))
        );
    }
}