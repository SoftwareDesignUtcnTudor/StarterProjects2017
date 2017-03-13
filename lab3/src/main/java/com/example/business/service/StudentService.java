package com.example.business.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.business.dto.StudentDto;
import com.example.data.entity.Student;
import com.example.data.repository.StudentJdbcTemplateRepository;
import com.example.data.repository.StudentJpaRepository;

@Service
public class StudentService
{
	@Autowired
	StudentJpaRepository studentJpaRepository;
//	StudentJdbcTemplateRepository studentJdbcTemplateRepository;

	public List<StudentDto> getStudentHavingFirstName(String firstName)
	{
		List<StudentDto> studentDtoList = new ArrayList<>();
		
//		List<Student> studentEntityList = studentJdbcTemplateRepository.getStudentsByFirstName(firstName);
		List<Student> studentEntityList = studentJpaRepository.findAll(); // findAllByFirstName(firstName);
		
		for (Student s: studentEntityList)
		{
			StudentDto sDto= new StudentDto();
			sDto.setId(s.getId());
			sDto.setFirstName(s.getFirstName());
			sDto.setLastName(s.getLastName());
			
			studentDtoList.add(sDto);
		}
		
		return studentDtoList;
	}
}
