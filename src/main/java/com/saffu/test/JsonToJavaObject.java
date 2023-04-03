package com.saffu.test;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.saffu.entity.Student;

public class JsonToJavaObject {
	
	public static void main(String[] args) throws JsonProcessingException {
		
		ObjectMapper mapper= new ObjectMapper();
		
		Student s1= new Student(101, "Abhi", "BTECH");
		Student s2= new Student(102, "sarfraz", "BCA");
		
		
		List<Student> list = Arrays.asList(s1,s2);
		
		
	     // here i add to obj into json
		
		//String json = mapper.writeValueAsString(list);	
		
		//System.out.println(json);
		
		
		
	
        String st="{\"id\":101,\"name\":\"Abhi\",\"depart\":\"BTECH\"}{\"id\":102,\"name\":\"sarfraz\",\"depart\":\"BCA\"}";
        
        list.forEach(e->System.out.println(e));
        
        
        

		
		
		

		
		
	}

}
