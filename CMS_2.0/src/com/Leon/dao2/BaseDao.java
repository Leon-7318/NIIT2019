package com.Leon.dao2;

import java.util.List;
import java.util.Map;

public interface BaseDao<T> {

	public int save(String mapper, Map<String, Object> parameter) throws Exception;

	public int update(String mapper, Map<String, Object> parameter) throws Exception;

	public int delete(String mapper, Map<String, Object> parameter) throws Exception;

	public T find(String mapper, Map<String, Object> parameter) throws Exception;

	public List<T> findList(String mapper, Map<String, Object> parameter) throws Exception;

}
