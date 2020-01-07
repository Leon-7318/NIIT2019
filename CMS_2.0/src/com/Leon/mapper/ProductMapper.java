package com.Leon.mapper;

import static com.Leon.mapper.ProductDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.Leon.entity.Product;
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
public interface ProductMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, type, date, sketch, details, image, images, state, author, brand, price, size, weight, cpu, ram, rom, battery);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source Table: product")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source Table: product")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.256+08:00", comments="Source Table: product")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Product> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Product> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ProductResult")
    Optional<Product> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ProductResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.DATE),
        @Result(column="sketch", property="sketch", jdbcType=JdbcType.VARCHAR),
        @Result(column="details", property="details", jdbcType=JdbcType.VARCHAR),
        @Result(column="image", property="image", jdbcType=JdbcType.VARCHAR),
        @Result(column="images", property="images", jdbcType=JdbcType.VARCHAR),
        @Result(column="state", property="state", jdbcType=JdbcType.INTEGER),
        @Result(column="author", property="author", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand", property="brand", jdbcType=JdbcType.VARCHAR),
        @Result(column="price", property="price", jdbcType=JdbcType.REAL),
        @Result(column="size", property="size", jdbcType=JdbcType.VARCHAR),
        @Result(column="weight", property="weight", jdbcType=JdbcType.VARCHAR),
        @Result(column="cpu", property="cpu", jdbcType=JdbcType.VARCHAR),
        @Result(column="ram", property="ram", jdbcType=JdbcType.VARCHAR),
        @Result(column="rom", property="rom", jdbcType=JdbcType.VARCHAR),
        @Result(column="battery", property="battery", jdbcType=JdbcType.VARCHAR)
    })
    List<Product> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, product, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, product, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    default int insert(Product record) {
        return MyBatis3Utils.insert(this::insert, record, product, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(type).toProperty("type")
            .map(date).toProperty("date")
            .map(sketch).toProperty("sketch")
            .map(details).toProperty("details")
            .map(image).toProperty("image")
            .map(images).toProperty("images")
            .map(state).toProperty("state")
            .map(author).toProperty("author")
            .map(brand).toProperty("brand")
            .map(price).toProperty("price")
            .map(size).toProperty("size")
            .map(weight).toProperty("weight")
            .map(cpu).toProperty("cpu")
            .map(ram).toProperty("ram")
            .map(rom).toProperty("rom")
            .map(battery).toProperty("battery")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    default int insertMultiple(Collection<Product> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, product, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(type).toProperty("type")
            .map(date).toProperty("date")
            .map(sketch).toProperty("sketch")
            .map(details).toProperty("details")
            .map(image).toProperty("image")
            .map(images).toProperty("images")
            .map(state).toProperty("state")
            .map(author).toProperty("author")
            .map(brand).toProperty("brand")
            .map(price).toProperty("price")
            .map(size).toProperty("size")
            .map(weight).toProperty("weight")
            .map(cpu).toProperty("cpu")
            .map(ram).toProperty("ram")
            .map(rom).toProperty("rom")
            .map(battery).toProperty("battery")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    default int insertSelective(Product record) {
        return MyBatis3Utils.insert(this::insert, record, product, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(date).toPropertyWhenPresent("date", record::getDate)
            .map(sketch).toPropertyWhenPresent("sketch", record::getSketch)
            .map(details).toPropertyWhenPresent("details", record::getDetails)
            .map(image).toPropertyWhenPresent("image", record::getImage)
            .map(images).toPropertyWhenPresent("images", record::getImages)
            .map(state).toPropertyWhenPresent("state", record::getState)
            .map(author).toPropertyWhenPresent("author", record::getAuthor)
            .map(brand).toPropertyWhenPresent("brand", record::getBrand)
            .map(price).toPropertyWhenPresent("price", record::getPrice)
            .map(size).toPropertyWhenPresent("size", record::getSize)
            .map(weight).toPropertyWhenPresent("weight", record::getWeight)
            .map(cpu).toPropertyWhenPresent("cpu", record::getCpu)
            .map(ram).toPropertyWhenPresent("ram", record::getRam)
            .map(rom).toPropertyWhenPresent("rom", record::getRom)
            .map(battery).toPropertyWhenPresent("battery", record::getBattery)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    default Optional<Product> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, product, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    default List<Product> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, product, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    default List<Product> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, product, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    default Optional<Product> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, product, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    static UpdateDSL<UpdateModel> updateAllColumns(Product record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(name).equalTo(record::getName)
                .set(type).equalTo(record::getType)
                .set(date).equalTo(record::getDate)
                .set(sketch).equalTo(record::getSketch)
                .set(details).equalTo(record::getDetails)
                .set(image).equalTo(record::getImage)
                .set(images).equalTo(record::getImages)
                .set(state).equalTo(record::getState)
                .set(author).equalTo(record::getAuthor)
                .set(brand).equalTo(record::getBrand)
                .set(price).equalTo(record::getPrice)
                .set(size).equalTo(record::getSize)
                .set(weight).equalTo(record::getWeight)
                .set(cpu).equalTo(record::getCpu)
                .set(ram).equalTo(record::getRam)
                .set(rom).equalTo(record::getRom)
                .set(battery).equalTo(record::getBattery);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Product record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(name).equalToWhenPresent(record::getName)
                .set(type).equalToWhenPresent(record::getType)
                .set(date).equalToWhenPresent(record::getDate)
                .set(sketch).equalToWhenPresent(record::getSketch)
                .set(details).equalToWhenPresent(record::getDetails)
                .set(image).equalToWhenPresent(record::getImage)
                .set(images).equalToWhenPresent(record::getImages)
                .set(state).equalToWhenPresent(record::getState)
                .set(author).equalToWhenPresent(record::getAuthor)
                .set(brand).equalToWhenPresent(record::getBrand)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(size).equalToWhenPresent(record::getSize)
                .set(weight).equalToWhenPresent(record::getWeight)
                .set(cpu).equalToWhenPresent(record::getCpu)
                .set(ram).equalToWhenPresent(record::getRam)
                .set(rom).equalToWhenPresent(record::getRom)
                .set(battery).equalToWhenPresent(record::getBattery);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    default int updateByPrimaryKey(Product record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(type).equalTo(record::getType)
            .set(date).equalTo(record::getDate)
            .set(sketch).equalTo(record::getSketch)
            .set(details).equalTo(record::getDetails)
            .set(image).equalTo(record::getImage)
            .set(images).equalTo(record::getImages)
            .set(state).equalTo(record::getState)
            .set(author).equalTo(record::getAuthor)
            .set(brand).equalTo(record::getBrand)
            .set(price).equalTo(record::getPrice)
            .set(size).equalTo(record::getSize)
            .set(weight).equalTo(record::getWeight)
            .set(cpu).equalTo(record::getCpu)
            .set(ram).equalTo(record::getRam)
            .set(rom).equalTo(record::getRom)
            .set(battery).equalTo(record::getBattery)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-01-07T22:47:48.257+08:00", comments="Source Table: product")
    default int updateByPrimaryKeySelective(Product record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(type).equalToWhenPresent(record::getType)
            .set(date).equalToWhenPresent(record::getDate)
            .set(sketch).equalToWhenPresent(record::getSketch)
            .set(details).equalToWhenPresent(record::getDetails)
            .set(image).equalToWhenPresent(record::getImage)
            .set(images).equalToWhenPresent(record::getImages)
            .set(state).equalToWhenPresent(record::getState)
            .set(author).equalToWhenPresent(record::getAuthor)
            .set(brand).equalToWhenPresent(record::getBrand)
            .set(price).equalToWhenPresent(record::getPrice)
            .set(size).equalToWhenPresent(record::getSize)
            .set(weight).equalToWhenPresent(record::getWeight)
            .set(cpu).equalToWhenPresent(record::getCpu)
            .set(ram).equalToWhenPresent(record::getRam)
            .set(rom).equalToWhenPresent(record::getRom)
            .set(battery).equalToWhenPresent(record::getBattery)
            .where(id, isEqualTo(record::getId))
        );
    }
}