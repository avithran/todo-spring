package com.bavithran.PackageAPI.ClassAPI.resfulwebservice.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter=0;
	
	static{
		todos.add(new Todo(++idCounter,"bavi","Go for Cycling",new Date(),false));
		todos.add(new Todo(++idCounter,"bavi","Complete the Course",new Date(),false));
		todos.add(new Todo(++idCounter,"bavi","Get the Certificates",new Date(),false));
		
		todos.add(new Todo(++idCounter,"Bellc","Go for Cycling bellc",new Date(),false));
		todos.add(new Todo(++idCounter,"Bellc","Complete the Course bellc",new Date(),false));
		todos.add(new Todo(++idCounter,"hello","Get the Certificates hello",new Date(),false));
		todos.add(new Todo(++idCounter,"hello","Go for Cycling hello",new Date(),false));
		
	}
	
	public int ReturnId(){
		return idCounter+1;
	}
	
	public Todo save(Todo todo){
		if(todo.getId()==-1||todo.getId()==0){
			todo.setId(++idCounter);
			todos.add(todo);
		}
		else{
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
	public List<Todo> findAll(String username){
		List<Todo> testTodos = new ArrayList<Todo>();
		for(Todo t:todos){
			if(t.getUsername().equals(username)){
				testTodos.add(t);
			}
		}
		return testTodos;
	}
	
	
	public Todo deleteById(long id){
		
		Todo todo = findById(id);
		if(todo==null) 
			return null;
		
		if(todos.remove(todo))
			return todo;
		
	return null;
	
	}
	
	public Todo findById(long id){
		for(Todo todo:todos){
			if(todo.getId()==id){
				return todo;
			}
		}
		return null;
	}
}
