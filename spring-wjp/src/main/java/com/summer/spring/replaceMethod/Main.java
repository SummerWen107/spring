package com.summer.spring.replaceMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 演示	使用replaced-method进行方法替换
 * 方法替换：可以在运行时用新的方法替换现有的方法
 *
 * @author wenjunpu
 * @Date 2022/04/16/19:21
 * @Description
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext bf =
				new ClassPathXmlApplicationContext("replaceMethod/replaceMethodTest.xml");
		TestChangeMethod test=(TestChangeMethod) bf.getBean("testChangeMethod");
		test.changeMe();
	}
}
