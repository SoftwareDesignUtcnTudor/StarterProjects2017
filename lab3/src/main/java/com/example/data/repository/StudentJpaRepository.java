package com.example.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.data.entity.Student;

//extends JpaRepository<Student, Integer>
public interface StudentJpaRepository extends JpaRepository<Student, Integer>
{
	public List<Student> findAllByFirstNameOrderByLastName(String firstName);
}
