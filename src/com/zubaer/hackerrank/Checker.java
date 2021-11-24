package com.zubaer.hackerrank;

import java.util.Comparator;

public class Checker implements Comparator<Student> {

	//@Override
	public int compare(Student a, Student b) {

		// sort by cgpa
		int cgpaSort = Double.compare(b.getCgpa(), a.getCgpa());
		if(cgpaSort != 0) {
			return cgpaSort;
		}
		// sort by name if cgpa equal
		int nameSort = a.getName().compareTo(b.getName());
		if(nameSort != 0) {
			return cgpaSort;
		}
		//sort by id if both cgpa and name equal
		int idSort = Integer.compare(a.getId(), b.getId());
		return idSort;
		
		
		
		
//		if(a.getCgpa()==b.getCgpa()) {
//			// sort by name if cgpa equal
//			int result =  a.getName().compareTo(b.getName());
//			if(result != 0) {
//				return result;
//			}else {
//				//sort by id if both cgpa and name equal
//				if(a.getId() == b.getId()) {
//					return 0;
//				}else if(a.getId()>b.getId()) {
//					return 1;
//				}else {
//					return -1;
//				}
//			}
//		}else if(a.getCgpa() < b.getCgpa()){
//			return 1;
//		}else {
//			return -1;
//		}
	}
}
