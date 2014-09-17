package com.flyingh.mybatis.mappers;

import java.util.List;

import com.flyingh.mybatis.vo.Student;

public interface StudentMapper {
	List<Student> findAll();

	Student findById(int id);

	int insert(Student student);

	int update(Student student);

	int delete(int id);

	Student findStudentWithAddress(int id);

	List<Student> findAllWithAddress();

	List<Student> anotherFindAllWithAddress();

	Student findWithAddressAndBooks(int id);

}
