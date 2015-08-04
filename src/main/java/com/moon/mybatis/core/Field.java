package com.moon.mybatis.core;

/**
 * 
 * @author quzile
 *
 */
public class Field implements Cloneable{

	private String fieldname;

	private String alias;

	public Field(String fieldname) {
		super();
		this.fieldname = fieldname;
	}

	public Field(String fieldname, String alias) {
		super();
		this.fieldname = fieldname;
		this.alias = alias;
	}

	public String getFieldname() {
		return fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	@Override
	protected Field clone() throws CloneNotSupportedException {
		return (Field) super.clone();
	}

}
