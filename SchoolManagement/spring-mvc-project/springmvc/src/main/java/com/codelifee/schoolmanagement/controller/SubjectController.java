package com.codelifee.schoolmanagement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codelifee.schoolmanagement.model.SubjectDAO;
import com.codelifee.schoolmanagement.model.SubjectDTO;

@Controller
public class SubjectController {

	@Autowired
	public SubjectDAO service;
	
	@Autowired
	public SubjectDTO subject;
	
	@RequestMapping(value="/subjects", method = RequestMethod.GET)
	public String goSubjects() {
		
		return "subjects";
	}
	
	@RequestMapping(value="/subjectSearch", method = RequestMethod.GET)
	public String showSubject(ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		
		model.addAttribute("subjects", service.getList(name));
		
		
		return "subjects";
	}
	
	@RequestMapping(value="/subjectAdd", method = RequestMethod.GET)
	public String addSubject(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		
		String name= request.getParameter("name");
		String sub = request.getParameter("password");
		
		subject.setName(name);
		subject.setSubject(sub);
		
		model.addAttribute("welcome", "added");
		
		return "subjects";
	}
	
}
