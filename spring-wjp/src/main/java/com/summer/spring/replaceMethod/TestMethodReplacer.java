package com.summer.spring.replaceMethod;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * 类描述
 *
 * @author wenjunpu
 * @Date 2022/04/16/19:18
 * @Description
 */
public class TestMethodReplacer implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		//可以替换，也可增强
		//System.out.println("我替换了原有的方法");
		System.err.println("对原有方法前置处理");
		//Object invoke = method.invoke(obj);
		System.err.println("对原有方法后置处理");
		return null;
	}
}
