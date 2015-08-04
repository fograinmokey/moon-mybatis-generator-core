package com.moon.mybatis.base;

import java.util.List;
import java.util.Map;
import com.moon.mybatis.core.Tuple;
import com.moon.mybatis.core.Page;

/**
 * 
 * @author quzile
 *
 * @param <T>
 */
public interface BaseDao<T> {

	int save(T t);

	int save(T t, boolean duplicate);

	int saveOrUpdate(T t);

	int[] batchInsert(T[] a);

	int delete(long id);

	int remove(long id);

	int update(T t);

	int[] batchUpdate(T[] a);

	T queryForObject(long id);

	T queryForObject(long id, Tuple tuple);

	T queryForObject(T t);

	T queryForObject(T t, Tuple tuple);

	T queryForUpdate(long id);

	T queryForUpdate(long id, Tuple tuple);

	T queryForUpdate(T t);

	T queryForUpdate(T t, Tuple tuple);

	List<T> queryForList(T t);

	List<T> queryForList(T t, Tuple tuple);

	void queryForPage(Page<T> page, Map<String, Object> params);

	void queryForPage(Page<T> page, Map<String, Object> params, Tuple tuple);

	int queryForCount(Map<String, Object> params);

	boolean exists(T t);

}
