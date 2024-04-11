package jrJava.usingHashCode2;

public class Student {

	private int id;
	private String allOtherDescriptions;
	
	public Student(int id, String allOtherDescriptions) {
		this.id = id;
		this.allOtherDescriptions = allOtherDescriptions;
	}
	
	
	public int hashCode() {
		return id- 101;
	}
	
	public String toString() {
		return id + " " + allOtherDescriptions;
	}
}
