package com.flyingh.mybatis.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.flyingh.mybatis.mappers.StudentMapper;
import com.flyingh.mybatis.util.MyBatisSqlSessionFactory;
import com.flyingh.mybatis.vo.Student;

public class StudentService {
	public List<Student> findAll() {
		try (SqlSession session = MyBatisSqlSessionFactory.openSession()) {
			return session.getMapper(StudentMapper.class).findAll();
		}
	}

	public Student findById(int id) {
		try (SqlSession session = MyBatisSqlSessionFactory.openSession()) {
			return session.getMapper(StudentMapper.class).findById(id);
		}
	}

	public void add(Student student) {
		try (SqlSession session = MyBatisSqlSessionFactory.openSession()) {
			session.getMapper(StudentMapper.class).insert(student);
			session.commit();
		}
	}

	public void update(Student student) {
		try (SqlSession session = MyBatisSqlSessionFactory.openSession()) {
			session.getMapper(StudentMapper.class).update(student);
			session.commit();
		}
	}
}
