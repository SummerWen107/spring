package com.summer.spring;

import com.summer.spring.pojo.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 类描述
 *
 * @author wenjunpu
 * @Date 2022/03/15/10:34
 * @Description
 */
public class demo {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		A bean = ac.getBean(A.class);
		System.out.println(bean.toString());
	}
}
