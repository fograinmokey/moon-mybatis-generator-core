package com.moon.mybatis.base.entity;

import java.io.Serializable;

/**
 * 
 * @author quzile
 *
 */
public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3952215901418575573L;

	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
