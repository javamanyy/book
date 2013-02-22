package com.dou.book.data.services.impl;

import javax.servlet.ServletConfig;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import com.dou.book.data.mappers.SBookService;
import com.dou.book.data.pojo.SBook;

public class TestSBookServices {
	SBookService service = null;
	
	/**
	* A、@Before 注解：与junit3.x中的setUp()方法功能一样，在每个测试方法之前执行；
	* B、@After 注解：与junit3.x中的tearDown()方法功能一样，在每个测试方法之后执行；
	* C、@BeforeClass 注解：在所有方法执行之前执行；
	* D、@AfterClass 注解：在所有方法执行之后执行；
	* E、@Test(timeout = xxx) 注解：设置当前测试方法在一定时间内运行完，否则返回错误(毫秒)
	* F、@Test(expected = Exception.class) 注解：设置被测试的方法是否有异常抛出。抛出异常类型为：Exception.class；
	* G、@Ignore 注解：注释掉一个测试方法或一个类，被注释的方法或类，不会被执行。
	*/

	
	@Before
	public void init() {
		System.out.println("chushihua...");
	}
	@After
	public void destory() {
		System.out.println("destory...");
	}
	@Test(timeout = 3000)
	public void testSaveBook(){
		long t1 = System.currentTimeMillis();
//		ApplicationContext aCtx = new FileSystemXmlApplicationContext(
//		"classpath:applicationContext-common.xml");
		
//		ApplicationContext aCtx = new ClassPathXmlApplicationContext(   
//		"classpath:applicationContext-common.xml"); 
		
		ApplicationContext aCtx = MyApplicationContextUtil.getContext();
		
		long t2 = System.currentTimeMillis();
		SBookService sBookService = (SBookService) aCtx
				.getBean("sBookService");
		long t3 = System.currentTimeMillis();
		SBook sbook = new SBook();
		sbook.setTitle("tt3");
		long t4 = System.currentTimeMillis();
		sBookService.saveBook(sbook);
		long t5 = System.currentTimeMillis();
		System.out.println(t2 - t1);
		System.out.println(t3 - t2);
		System.out.println(t4 - t3);
		System.out.println(t5 - t4);
	}
	@Test(timeout = 3000)
	public void testSaveBook1(){
		long t1 = System.currentTimeMillis();
//		ApplicationContext aCtx = new FileSystemXmlApplicationContext(
//		"classpath:applicationContext-common.xml");
		
//		ApplicationContext aCtx = new ClassPathXmlApplicationContext(   
//		"classpath:applicationContext-common.xml"); 
		
		ApplicationContext aCtx = MyApplicationContextUtil.getContext();
		
		long t2 = System.currentTimeMillis();
		SBookService sBookService = (SBookService) aCtx
				.getBean("sBookService");
		long t3 = System.currentTimeMillis();
		SBook sbook = new SBook();
		sbook.setTitle("tt3");
		long t4 = System.currentTimeMillis();
		sBookService.saveBook(sbook);
		long t5 = System.currentTimeMillis();
		System.out.println(t2 - t1);
		System.out.println(t3 - t2);
		System.out.println(t4 - t3);
		System.out.println(t5 - t4);
	}
}
