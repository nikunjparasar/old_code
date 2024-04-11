package jrJava.sorting_objects;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee[] employees = Utility.loadEmployeesFromFile("jrJava/sorting_objects/employee.txt");
		
		Utility.print(employees);
		MergeSorting.sort(employees);
		Utility.print(employees);
	}

}
