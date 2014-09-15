package com.flyingh.mybatis.mappers;

import java.util.List;

import com.flyingh.mybatis.vo.Student;

public interface StudentMapper {
	List<Student> findAll();

	Student findById(int id);

	void insert(Student student);
}
