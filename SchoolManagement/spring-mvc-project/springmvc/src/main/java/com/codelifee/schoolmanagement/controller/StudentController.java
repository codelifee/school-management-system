package com.codelifee.schoolmanagement.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.codelifee.schoolmanagement.model.Student;
import com.codelifee.schoolmanagement.model.StudentService;

@Controller
@SessionAttributes("name")
public class StudentController {
	
	private Log logger = LogFactory.getLog(ExceptionController.class);
	
	@Autowired
	StudentService service;
	
	@RequestMapping(value="/list-todos", method= RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		model.addAttribute("todos", service.retrieveStudents(retrieveLoggedinUserName()));
		return "list-todos";
	}
	
	private String retrieveLoggedinUserName() {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		
		if(principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}
		
		return principal.toString();
	}
	
	@RequestMapping(value="/add-todo", method= RequestMethod.GET)
	public String showTodoPage(ModelMap model) {
		
		model.addAttribute("todo", new Student(0,retrieveLoggedinUserName(), "Default Description", false));
		return "todo";
	}
	
	@RequestMapping(value="/add-todo", method= RequestMethod.POST)
	public String addTodo(ModelMap model, @Valid Student todo, BindingResult result) {
		if(result.hasErrors()) {
			return "todo";
		}
		service.addStudent(retrieveLoggedinUserName(), todo.getDesc(), false);
		model.clear();
		return "redirect:list-todos";
	}
	
	@RequestMapping(value="/update-todo", method= RequestMethod.GET)
	public String updateTodo(ModelMap model, @RequestParam int id) {
		Student todo = service.retrieveStudent(id);
		model.addAttribute("todo", todo);
		
		return "todo";
	}
	
	@RequestMapping(value="/update-todo", method= RequestMethod.POST)
	public String updateTodo(@Valid Student todo, BindingResult result) {
		if(result.hasErrors()) {
			return "todo";
		}
		todo.setUser(retrieveLoggedinUserName());
		
		service.updateStudent(todo);
		 
		return "redirect:list-todos";
	}
	
	@RequestMapping(value="/delete-todo", method= RequestMethod.GET)
	public String deleteTodo(ModelMap model, @RequestParam int id) {
		service.deleteStudent(id);
		model.clear();
		return "redirect:list-todos";
	}
	
	@ExceptionHandler(value = Exception.class)
	public String handleException(HttpServletRequest request, Exception ex) {
		logger.error("Request " + request.getRequestURI()
					+ " threw an Exception", ex);
		return "error-specific";
	}
}
