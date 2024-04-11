package jrJava.usingHashCode2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101, "Bikung, Swimming");
		Student s2 = new Student(102, "Painting, playing drums");
		Student s3 = new Student(103, "Video game, Java");
		Student s4 = new Student(104, "Youtube, Netflix binge");
		Student s5 = new Student(105, "Math, English");

		Student[] students = new Student[5];
		
		students[s1.hashCode()] = s1;
		students[s2.hashCode()] = s2;
		students[s3.hashCode()] = s3;
		students[s4.hashCode()] = s4;
		students[s5.hashCode()] = s5;
		
		//Search:
		int id = 102;
		int hashCode = id-101;
		Student found = students[hashCode];
		System.out.println(found);
		
		Student probe = new Student(102, "");
		Student found2 = students[probe.hashCode()];
		System.out.println(found2);
		
		
	}

}
