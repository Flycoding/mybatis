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
			System.out.println(session.getMapper(StudentMapper.class).insert(student));
			session.commit();
		}
	}

	public void update(Student student) {
		try (SqlSession session = MyBatisSqlSessionFactory.openSession()) {
			System.out.println(session.getMapper(StudentMapper.class).update(student));
			session.commit();
		}
	}

	public int delete(int id) {
		try (SqlSession session = MyBatisSqlSessionFactory.openSession()) {
			final int result = session.getMapper(StudentMapper.class).delete(id);
			session.commit();
			return result;
		}
	}

	public Student findStudentWithAddress(int id) {
		try (SqlSession session = MyBatisSqlSessionFactory.openSession()) {
			return session.getMapper(StudentMapper.class).findStudentWithAddress(id);
		}
	}

	public List<Student> findAllWithAddress() {
		try (SqlSession session = MyBatisSqlSessionFactory.openSession()) {
			return session.getMapper(StudentMapper.class).findAllWithAddress();
		}
	}

	public List<Student> anotherFindAllWithAddress() {
		try (SqlSession session = MyBatisSqlSessionFactory.openSession()) {
			return session.getMapper(StudentMapper.class).anotherFindAllWithAddress();
		}
	}

	public Student findWithAddressAndBooks(int id) {
		try (SqlSession session = MyBatisSqlSessionFactory.openSession()) {
			return session.getMapper(StudentMapper.class).findWithAddressAndBooks(id);
		}
	}

	public List<Student> anotherFindAllWithAddressAndBooks() {
		try (SqlSession session = MyBatisSqlSessionFactory.openSession()) {
			return session.getMapper(StudentMapper.class).anotherFindAllWithAddressAndBooks();
		}
	}
}
