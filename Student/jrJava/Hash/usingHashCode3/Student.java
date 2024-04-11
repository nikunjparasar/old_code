package jrJava.usingHashCode3;

public class Student {

	private char classID;
	private int inClassID;
	private String allOthers;
	
	public Student(char classID, int inClassID, String allOthers) {
		super();
		this.classID = classID;
		this.inClassID = inClassID;
		this.allOthers = allOthers;
	}
		
	public int hashCode(){
		return 3*(classID - 'A') + (inClassID-1);
	}
	

	
}
