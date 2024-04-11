package jrJava.practice7;

import javafx.scene.effect.Light.Spot;

public class UsingForLoop1 {

	public static void main(String[] args) {
		
		int i;
		for(i=3; i<9; i=i+3) {
			System.out.println("current i=" + i);
		}
		System.out.println("I am outside the loop and i=" + i);
		
		
		for(i=-1; i<=6; i+=2) {
			System.out.println("current i=" + i);
		}
		System.out.println("I am outside the loop and i=" + i);
		
		
		int j;
		for(j=10; j>=5; j--) {
			System.out.println("current j=" + j);
		}
		System.out.println("I am outside the loop and i=" + j);
		
		
		double myMoney;
		
		for(myMoney=1.25; myMoney<2; myMoney += 0.1) {
			
			System.out.println("current myMoney=" + myMoney);
			
		}
		
		System.out.println("I am outside the loop and myMoney=" + myMoney);
		 
	} 

}
 
















