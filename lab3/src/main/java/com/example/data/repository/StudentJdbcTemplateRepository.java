package com.example.data.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.data.entity.Student;

@Repository
public class StudentJdbcTemplateRepository
{
//	@Autowired
//	private DataSource dataSource;
//
//	private String selectAllQuery = "SELECT * from students ";
//	private String byFirstNameQuery = "SELECT * from students WHERE first_name=?";
//
//	public List<Student> getStudentsByFirstName(String firstName)
//	{
//		List<Student> students = new ArrayList<Student>();
//		List<Map<String, Object>> studentsLowLevelDbMapList = new ArrayList<Map<String, Object>>();
//		try
//		{
//			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//			studentsLowLevelDbMapList = jdbcTemplate.queryForList(byFirstNameQuery, new Object[] { firstName });
//
//			for (Map<String, Object> m : studentsLowLevelDbMapList)
//			{
//				Student s = new Student();
//				s.setId((int) m.get("id"));
//				s.setFirstName((String) m.get("first_name"));
//				s.setLastName((String) m.get("last_name"));
//
//				students.add(s);
//			}
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
//
//		return students;
//	}
//

}
