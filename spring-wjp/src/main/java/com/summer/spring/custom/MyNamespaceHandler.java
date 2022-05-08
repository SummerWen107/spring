package com.summer.spring.custom;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 类描述
 *
 * @author wenjunpu
 * @Date 2022/04/18/11:44
 * @Description
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
}
