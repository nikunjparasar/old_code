package jrJava.abstractType_6_generics;

import java.util.StringTokenizer;

public class Employee implements Comparable<Employee> {

	private String firstName;
	private String lastName;
	private int id;
	private String title;
	private int hiredYear;
	private int salary;
	private int dobYY;
	private int dobMM;
	private int dobDD;
	private char gender;
	private int height;
	private int weight;
	
	public Employee(String line) {
		StringTokenizer st = new StringTokenizer(line, " ");
		firstName = st.nextToken();
		lastName = st.nextToken();
		id = Integer.parseInt(st.nextToken());
		title = st.nextToken();
		hiredYear = Integer.parseInt(st.nextToken());
		salary = Integer.parseInt(st.nextToken());
		dobYY = Integer.parseInt(st.nextToken());
		dobMM = Integer.parseInt(st.nextToken());
		dobDD = Integer.parseInt(st.nextToken());
		gender = st.nextToken().charAt(0);
		height = Integer.parseInt(st.nextToken());
		weight = Integer.parseInt(st.nextToken());	
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		sb.append(firstName);
		sb.append(", ");
		sb.append(lastName);
		sb.append("  ");
		sb.append(dobYY);
		sb.append('/');
		sb.append(dobMM);
		sb.append('/');
		sb.append(dobDD);
		sb.append(']');
		
		return sb.toString();
		
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Employee)) return false;
		Employee e = (Employee) o;
		
		return firstName.equals(e.firstName) &&
		lastName.equals(e.lastName) &&
		dobYY == e.dobYY && dobMM == e.dobMM &&
		dobDD == e.dobDD;
		
		
		
	}
	
	public int hashCode() {
		return firstName.hashCode() + lastName.hashCode()*100 +
				dobYY*10000 +dobMM*100000 +dobDD*1000000;
	}



	
	public int compareTo(Employee o) {
		Employee e = (Employee) o;
		if(lastName.compareTo(e.lastName) > 0) return 1;
		else if(lastName.compareTo(e.lastName) < 0) return -1;
		else {
			if(firstName.compareTo(e.firstName) > 0) return 1;
			else if(firstName.compareTo(e.firstName) < 0) return -1;
			else {
				if(dobYY>e.dobYY) return 1;
				else if(dobYY<dobYY) return -1;
				else {
					if(dobMM>e.dobMM) return 1;
					else if(dobMM<dobMM) return -1;
					else {
						if(dobDD>e.dobDD) return 1;
						else if(dobDD<dobDD) return -1;
						else return 0;
					}
				}
			}
		}
		
	}

	
	
}
