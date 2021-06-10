package com.bavithran.PackageAPI.ClassAPI.resfulwebservice;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderTest {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoded=new BCryptPasswordEncoder();
			String strencod = encoded.encode("12345");
			System.out.println("strencod: "+strencod);
	}

}
