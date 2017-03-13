package com.example.presentation;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.business.dto.StudentDto;
import com.example.business.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController
{
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = "/{ff}", method = RequestMethod.GET)
	public ModelAndView getStudentsByFirstName(@PathVariable("ff") String firstName, Principal principal)
	{
		List<StudentDto> studentDtoList = studentService.getStudentHavingFirstName(firstName);
		
		ModelAndView mav = new ModelAndView("student_list");
		mav.addObject("studentDtoList", studentDtoList);
		
		return mav;
		
	}

}
