package com.summer.spring.lookup;

/**
 * 类描述
 *
 * @author wenjunpu
 * @Date 2022/04/16/19:03
 * @Description
 */
public abstract class GetBeanTest {

	public void showMe(){
		this.getBean().showMe();
	}
	public abstract User getBean();
}
