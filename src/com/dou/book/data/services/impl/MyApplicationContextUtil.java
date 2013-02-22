package com.dou.book.data.services.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplicationContextUtil implements ApplicationContextAware {

	private static ApplicationContext applicationContext;// 声明一个静态变量保存

	@Override
	public void setApplicationContext(ApplicationContext contex)
			throws BeansException {
		applicationContext = contex;
	}

	public static ApplicationContext getContext() {
		System.out.println("applicationContext:"+applicationContext);
		if(applicationContext==null){
			applicationContext = new ClassPathXmlApplicationContext(   
					"classpath:applicationContext-common.xml");
		}
		return applicationContext;
	}

}
