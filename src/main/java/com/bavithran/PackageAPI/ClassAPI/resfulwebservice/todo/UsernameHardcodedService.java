package com.bavithran.PackageAPI.ClassAPI.resfulwebservice.todo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class UsernameHardcodedService {
	private static List<Username> userandPass = new ArrayList<Username>();
	
	static{
		userandPass.add(new Username("bavi","12345"));
		userandPass.add(new Username("Bellc","canada"));
		userandPass.add(new Username("hello","welcome"));
	}
	
	public List<Username> listofUsers(){
		return userandPass;
	}
}
