package com.moon.mybatis.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.moon.mybatis.core.Page;
import com.moon.mybatis.core.Tuple;

public class Abstract2 implements BaseDao2 {

	@Override
	public <T> int save(T t, Class<T> clazz) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> int save(T t, boolean duplicate) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> int saveOrUpdate(T t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> int[] batchInsert(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> int delete(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> int remove(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> int update(T t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> int[] batchUpdate(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T queryForObject(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T queryForObject(long id, Tuple tuple) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T queryForObject(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T queryForObject(T t, Tuple tuple) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T queryForUpdate(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T queryForUpdate(long id, Tuple tuple) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T queryForUpdate(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T queryForUpdate(T t, Tuple tuple) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> queryForList(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> queryForList(T t, Tuple tuple) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> void queryForPage(Page<T> page, Map<String, Object> params) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> void queryForPage(Page<T> page, Map<String, Object> params, Tuple tuple) {
		// TODO Auto-generated method stub

	}

	@Override
	public int queryForCount(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <T> boolean exists(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		Abstract2 a = new Abstract2();
		a.save("", false);
		a.save(new ArrayList(), true);
	}

}
