package com.moon.mybatis.core;

import java.util.ArrayList;
import java.util.List;

public class Tuple {

	private final List<Field> fields;

	public Tuple(List<Field> fields) {
		this.fields = fields;
	}

	public static class TupleBuilder implements Builder<Tuple> {

		private final List<Field> fields = new ArrayList<Field>();

		public TupleBuilder add(Field field) {
			fields.add(field);
			return this;
		}

		public TupleBuilder add(String fieldname) {
			fields.add(new Field(fieldname));
			return this;
		}

		public TupleBuilder add(String fieldname, String alias) {
			fields.add(new Field(fieldname, alias));
			return this;
		}

		@Override
		public Tuple build() {
			return new Tuple(fields);
		}

	}

	public List<Field> getFields() {
		return fields;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Tuple tuple = new TupleBuilder().add("name").add("age").build();
		System.out.println(tuple.getFields());
	}

}
