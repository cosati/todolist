package com.cosati.springboot.todolist.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private static List<Todo> todos = new ArrayList<>();
	static {
		todos.add(new Todo(0, "cosati", "Learn Spring", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(1, "cosati", "Learn Microservices", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(2, "cosati", "Learn Angular", LocalDate.now().plusYears(3), false));
	}
	
	public List<Todo> findByUsername(String username) {
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean isDone) {
		todos.add(new Todo(
				todos.stream().mapToLong(Todo::getId).max().orElse(0l) + 1, 
				username, 
				description, 
				targetDate, 
				isDone));
	}
	
}
