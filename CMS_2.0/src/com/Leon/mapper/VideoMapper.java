package com.Leon.mapper;

import static com.Leon.mapper.VideoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.Leon.entity.Video;
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
public interface VideoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    BasicColumn[] selectList = BasicColumn.columnList(id, title, url, date, sketch, image, state, author);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.259+08:00", comments="Source Table: video")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.259+08:00", comments="Source Table: video")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.259+08:00", comments="Source Table: video")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Video> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Video> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("VideoResult")
    Optional<Video> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="VideoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.DATE),
        @Result(column="sketch", property="sketch", jdbcType=JdbcType.VARCHAR),
        @Result(column="image", property="image", jdbcType=JdbcType.VARCHAR),
        @Result(column="state", property="state", jdbcType=JdbcType.INTEGER),
        @Result(column="author", property="author", jdbcType=JdbcType.VARCHAR)
    })
    List<Video> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, video, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, video, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    default int insert(Video record) {
        return MyBatis3Utils.insert(this::insert, record, video, c ->
            c.map(id).toProperty("id")
            .map(title).toProperty("title")
            .map(url).toProperty("url")
            .map(date).toProperty("date")
            .map(sketch).toProperty("sketch")
            .map(image).toProperty("image")
            .map(state).toProperty("state")
            .map(author).toProperty("author")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    default int insertMultiple(Collection<Video> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, video, c ->
            c.map(id).toProperty("id")
            .map(title).toProperty("title")
            .map(url).toProperty("url")
            .map(date).toProperty("date")
            .map(sketch).toProperty("sketch")
            .map(image).toProperty("image")
            .map(state).toProperty("state")
            .map(author).toProperty("author")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    default int insertSelective(Video record) {
        return MyBatis3Utils.insert(this::insert, record, video, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(title).toPropertyWhenPresent("title", record::getTitle)
            .map(url).toPropertyWhenPresent("url", record::getUrl)
            .map(date).toPropertyWhenPresent("date", record::getDate)
            .map(sketch).toPropertyWhenPresent("sketch", record::getSketch)
            .map(image).toPropertyWhenPresent("image", record::getImage)
            .map(state).toPropertyWhenPresent("state", record::getState)
            .map(author).toPropertyWhenPresent("author", record::getAuthor)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    default Optional<Video> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, video, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    default List<Video> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, video, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    default List<Video> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, video, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    default Optional<Video> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, video, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    static UpdateDSL<UpdateModel> updateAllColumns(Video record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(title).equalTo(record::getTitle)
                .set(url).equalTo(record::getUrl)
                .set(date).equalTo(record::getDate)
                .set(sketch).equalTo(record::getSketch)
                .set(image).equalTo(record::getImage)
                .set(state).equalTo(record::getState)
                .set(author).equalTo(record::getAuthor);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Video record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(title).equalToWhenPresent(record::getTitle)
                .set(url).equalToWhenPresent(record::getUrl)
                .set(date).equalToWhenPresent(record::getDate)
                .set(sketch).equalToWhenPresent(record::getSketch)
                .set(image).equalToWhenPresent(record::getImage)
                .set(state).equalToWhenPresent(record::getState)
                .set(author).equalToWhenPresent(record::getAuthor);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    default int updateByPrimaryKey(Video record) {
        return update(c ->
            c.set(title).equalTo(record::getTitle)
            .set(url).equalTo(record::getUrl)
            .set(date).equalTo(record::getDate)
            .set(sketch).equalTo(record::getSketch)
            .set(image).equalTo(record::getImage)
            .set(state).equalTo(record::getState)
            .set(author).equalTo(record::getAuthor)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.26+08:00", comments="Source Table: video")
    default int updateByPrimaryKeySelective(Video record) {
        return update(c ->
            c.set(title).equalToWhenPresent(record::getTitle)
            .set(url).equalToWhenPresent(record::getUrl)
            .set(date).equalToWhenPresent(record::getDate)
            .set(sketch).equalToWhenPresent(record::getSketch)
            .set(image).equalToWhenPresent(record::getImage)
            .set(state).equalToWhenPresent(record::getState)
            .set(author).equalToWhenPresent(record::getAuthor)
            .where(id, isEqualTo(record::getId))
        );
    }
}