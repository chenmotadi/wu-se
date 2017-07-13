package com.kongzhu.wupeiyang.DAO;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDAOImpl {
	
	static SqlSessionFactory sqlSessionFactory;
	public void init(){
		String resources = "mybatis-config.xml";
		InputStream inputStream =null;
		
		try {
			inputStream = Resources.getResourceAsStream(resources);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(inputStream !=null){
				
			} try {
				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public SqlSession getsqlSession(){
		if(sqlSessionFactory == null){
			init();
		}
		return sqlSessionFactory.openSession();
	}

	
	

}
