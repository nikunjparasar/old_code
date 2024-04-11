package jrJava.abstractType_6_generics;

public class SorterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		SelectionSorter2<Employee> sorter = new SelectionSorter2<Employee>();
		
		Employee[] data = new Employee[3];
		
		data[0] =new Employee("John Wayne 15 Sr.Developer 1995 250000 1960 12 5 M 181 195");
		data[1] =new Employee("Emma Watson 12 Programmer2 2013 99500 1994 4 12 F 173 138");
		//data[1] = new Ball("100, 200, 150");
		data[2] =new Employee("Johnny Depp 49 Programmer2 2010 125000 1976 3 18 M 169 155");
		
		sorter.sort(data);
		
		
		//SelectionSorter1.sort(data);
		
		
		for(int i = 0; i<data.length; i++) {
			System.out.println(data[i]);
			
		}
		System.out.println();
	}

}
