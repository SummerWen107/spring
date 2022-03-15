package com.summer.spring.pojo;

/**
 * 类描述
 *
 * @author wenjunpu
 * @Date 2022/03/15/10:35
 * @Description
 */
public class A {
	private String id;
	private String name;
	private Integer age;

	@Override
	public String toString() {
		return "A{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
