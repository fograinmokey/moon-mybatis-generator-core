package com.moon.mybatis.base;

import java.util.List;
import java.util.Map;

import com.moon.mybatis.core.Page;
import com.moon.mybatis.core.Tuple;

public interface BaseDao2 {

	<T> int save(T t, Class<T> clazz);

	<T> int save(T t, boolean duplicate);

	<T> int saveOrUpdate(T t);

	<T> int[] batchInsert(T[] a);

	<T> int delete(long id);

	<T> int remove(long id);

	<T> int update(T t);

	<T> int[] batchUpdate(T[] a);

	<T> T queryForObject(long id);

	<T> T queryForObject(long id, Tuple tuple);

	<T> T queryForObject(T t);

	<T> T queryForObject(T t, Tuple tuple);

	<T> T queryForUpdate(long id);

	<T> T queryForUpdate(long id, Tuple tuple);

	<T> T queryForUpdate(T t);

	<T> T queryForUpdate(T t, Tuple tuple);

	<T> List<T> queryForList(T t);

	<T> List<T> queryForList(T t, Tuple tuple);

	<T> void queryForPage(Page<T> page, Map<String, Object> params);

	<T> void queryForPage(Page<T> page, Map<String, Object> params, Tuple tuple);

	int queryForCount(Map<String, Object> params);

	<T> boolean exists(T t);

}
