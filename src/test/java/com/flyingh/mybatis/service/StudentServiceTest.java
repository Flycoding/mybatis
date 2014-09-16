package com.flyingh.mybatis.service;

import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.flyingh.mybatis.vo.Student;

public class StudentServiceTest {
	private StudentService studentService;

	@Before
	public void setUp() throws Exception {
		studentService = new StudentService();
	}

	@Test
	public void testFindAll() {
		final List<Student> students = studentService.findAll();
		for (final Student student : students) {
			System.out.println(student);
		}
	}

	@Test
	public void testFindById() {
		System.out.println(studentService.findById(1));
	}

	@Test
	public void testAdd() {
		studentService.add(new Student(5, "e", "e@e.com", new Date()));
	}

	@Test
	public void testUpdate() {
		studentService.update(new Student(5, "ee", "ee@ee.com", new Date()));
	}

	@Test
	public void testDelete() {
		System.out.println(studentService.delete(5));
	}

	@After
	public void tearDown() throws Exception {
		studentService = null;
	}
}
