package com.summer.spring;

import com.summer.spring.bean.MyTestBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 类描述
 *
 * @author wenjunpu
 * @Date 2022/04/15/13:01
 * @Description
 */
public class Test {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("beanFactoryTest.xml");
		BeanFactory factory=new DefaultListableBeanFactory();
		BeanDefinitionReader bdr=new XmlBeanDefinitionReader((BeanDefinitionRegistry) factory);
		bdr.loadBeanDefinitions(resource);
		//BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean myTestBean = (MyTestBean)factory.getBean("myTestBean");
		System.out.println(myTestBean.getTestStr());
	}
}
