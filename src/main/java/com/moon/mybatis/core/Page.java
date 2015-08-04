package com.moon.mybatis.core;

import java.util.List;

public interface Page<T> {

	int getOffset();

	int getRowCount();

	int getPageSize();

	int getTotalPage();

	List<T> result();

}
