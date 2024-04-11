package jrJava.recursion_4_morePractices;

public class HanoiTower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		moveDisks(4, 'A', 'C', 'B');
	}

	//Method to solve the Hanoi tower puzzle given number of disks and three towers.~~~~~~~~~~~~~~
	public static void moveDisks(int N, char from, char to, char stage) {
	
		//terminal condition
		if(N==1) {
			System.out.println("Move disk " + N +" from " + from + " to " +to +".");
			return;
		}
		
		//Need to move(N-1) number of disks from 'from' tower to 'stage' tower.
		moveDisks(N-1, from, stage, to);
		//Need to move the Nth disk from 'from' to 'to'.
		System.out.println("Move disk " + N +" from " + from + " to " +to +".");
		//Need to move (N-1) disks from 'stage to 'to'
		moveDisks(N-1, stage, to, from);
		
		
	}
}
	

