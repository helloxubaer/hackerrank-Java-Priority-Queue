package com.zubaer.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {

//	List<Student> makeStudentListFromStringArray(List<String> stringEvents){
//		List<Student> studentList = new ArrayList<Student>();
//		for (String i : stringEvents) {
//			String[] wordsArray = i.split(" ");
//			if(wordsArray.length > 1) {
//				String name = wordsArray[1];
//				double cgpa = Double.parseDouble(wordsArray[2]);
//				int id = Integer.parseInt(wordsArray[2]);
//				Student theStudent = new Student(id,name,cgpa);
//				studentList.add(theStudent);
//			}else {
//				studentList = null;
//			}
//		}
//		return studentList;		
//	}
	
	
	List<Student> getStudents(List<String> events){
		
		PriorityQueue<Student> studentPriority= new PriorityQueue(new Checker());
		
		for (String i : events) {
			String[] eventsArray = i.split(" ");
			System.out.println(eventsArray[0]);
			if(eventsArray.length > 1) {
				//System.out.println(studentPriority);
				String name = eventsArray[1];
				double cgpa = Double.parseDouble(eventsArray[2]);
				int id = Integer.parseInt(eventsArray[3]);
				Student theStudent = new Student(id,name,cgpa);
				studentPriority.add(theStudent);
				//System.out.println(studentPriority);
			}
			if("SERVED".equals(eventsArray[0])) {
				studentPriority.remove();
				//System.out.println(studentPriority);
			}
		}
		List<Student> studentList = new ArrayList<Student>(studentPriority);
		
		return studentList;
	}
	
}
