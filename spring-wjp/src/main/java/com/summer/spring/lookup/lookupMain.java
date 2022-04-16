package com.summer.spring.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 类描述
 *
 * @author wenjunpu
 * @Date 2022/04/16/19:04
 * @Description
 */
public class lookupMain {
	public static void main(String[] args) {
		ApplicationContext bf =
				new ClassPathXmlApplicationContext("lookup/lookupTest.xml");
		GetBeanTest test=(GetBeanTest) bf.getBean("getBeanTest");
		test.showMe();
	}
}
