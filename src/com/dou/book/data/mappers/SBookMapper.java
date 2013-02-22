package com.dou.book.data.mappers;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.dou.book.data.pojo.SBook;
//@Repository
public class SBookMapper {
	/*@Resource
	private SqlSessionFactory sessionFactory;
	public SBookMapper(){
	}
	public void saveBook(SBook sbook){
		SqlSession session = sessionFactory.openSession();  
		session.insert("saveBook", sbook);
	}*/
}
