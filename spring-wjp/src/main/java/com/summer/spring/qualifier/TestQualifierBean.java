package com.summer.spring.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;

/**
 * 类描述
 *
 * @author wenjunpu
 * @Date 2022/04/17/22:31
 * @Description
 */
public class TestQualifierBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
