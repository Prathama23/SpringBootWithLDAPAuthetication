package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;

@Controller
public class DemoController {
	
	@Autowired
    private TodoRepository todoRepository;

	@GetMapping("/")
	public String getIndex() {
		return "index";
	}
	
	@GetMapping("/view")
	public String getAll(Model model) {
		List<Todo> todos = todoRepository.findAll();
        model.addAttribute("todos", todos);
        return "view";
    }
	
	@GetMapping("/registration")
	public String getRegistrationForm(Model model) {
		Todo todo = new Todo();
		model.addAttribute("todo",todo);
		return "registration";
	}
	
	@PostMapping("/view")
	public String save(@ModelAttribute Todo todo) {
		todoRepository.save(todo);
		return "redirect:/view";
	}
	
	
}
