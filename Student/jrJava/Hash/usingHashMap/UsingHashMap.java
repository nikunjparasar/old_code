package jrJava.usingHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UsingHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> grades = new HashMap<String, Integer>();

		// value = map.put(..., ...);
		Integer value1 = grades.put("English", 89);
		System.out.println(value1);
		grades.put("Math", 97);
		grades.put("Biology", 88);
		grades.put("History", 91);
		grades.put("Java", 99);
		grades.put("PE", 100);
		
		Integer value2 = grades.put("Math", 85);
		System.out.println(value2); 
		
		grades.put(null, 95);
		grades.put(null, null);
		
		System.out.println(grades);
		
		// value = map.get(key);
		Integer v1 = grades.get("PE");
		System.out.println(v1);
		System.out.println(grades.get(null));
		System.out.println();
		
		// Set set = map.keySet();
		Set<String> set = grades.keySet();
		Iterator<String> iter = set.iterator();
		String key;
		Integer value;
		while(iter.hasNext()) {
			key = iter.next();
			value = grades.get(key);
			System.out.println(key + ", " + value);
		}
	}

}
 
 








