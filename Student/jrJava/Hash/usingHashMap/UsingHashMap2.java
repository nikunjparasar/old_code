package jrJava.usingHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UsingHashMap2 {

	public static void main(String[] args) {
		
		Map<String, Integer> grades = new HashMap<String, Integer>();
		grades.put("English", 89);
		grades.put("Math", 97);
		grades.put("Biology", 88);
		grades.put("History", 91);
		grades.put("Java", 99);
		grades.put("PE", 100);
		
		double gpa = getGPA(grades);
		System.out.println(gpa);
	}

	
	private static double getGPA(Map<String, Integer> map) {
		
		Iterator<String> iter = map.keySet().iterator();
		
		int count = 0;
		double sum = 0;
		while(iter.hasNext()) {
			count++;
			sum += map.get(iter.next());
		}
		return sum/count;
	}
	
}







