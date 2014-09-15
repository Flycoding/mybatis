package com.flyingh.mybatis.util;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSqlSessionFactory {
	private static final SqlSessionFactory SQL_SESSION_FACTORY;
	static {
		try {
			SQL_SESSION_FACTORY = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
		} catch (final IOException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public static SqlSessionFactory getSessionFactory() {
		return SQL_SESSION_FACTORY;
	}

	public static SqlSession openSession() {
		return SQL_SESSION_FACTORY.openSession();
	}

}
