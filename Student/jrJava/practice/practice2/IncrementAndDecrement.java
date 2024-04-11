package jrJava.practice2;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		/*
		int myMoney = 20;
		
		myMoney = myMoney + 1; // will make myMoney increase by 1
		myMoney = myMoney + 2; // will make myMoney increase by 2
		myMoney = myMoney + 3; // will make myMoney increase by 3

		System.out.println("myMoney = " + myMoney);
		
		myMoney = myMoney - 1;
		myMoney = myMoney - 2;
		myMoney = myMoney - 3;
		
		System.out.println("myMoney = " + myMoney);
		
		myMoney = myMoney*3;
		myMoney = myMoney*3;
		myMoney = myMoney*3;
		
		System.out.println("myMoney = " + myMoney);
		*/
		
		// We can also do the above, using "compounded assignment operators":
		int myMoney = 20;
		
		myMoney += 1;  //myMoney = myMoney + 1;
		myMoney += 2;  //myMoney = myMoney + 2;
		myMoney += 3;  //myMoney = myMoney + 3;

		System.out.println("myMoney = " + myMoney);
		
		myMoney -= 1; //myMoney = myMoney - 1;
		myMoney -= 2; //myMoney = myMoney - 2;
		myMoney -= 3; //myMoney = myMoney - 3;
		
		System.out.println("myMoney = " + myMoney);
		
		myMoney *= 3; //myMoney = myMoney*3;
		myMoney *= 3; //myMoney = myMoney*3;
		myMoney *= 3; //myMoney = myMoney*3;
		
		System.out.println("myMoney = " + myMoney);
		
		// when it needs to increase/decrease only by one, then we can use increment/decrement operators.
		myMoney++;  //myMoney += 1;  //myMoney = myMoney + 1;
		myMoney--;  //myMoney -= 1; //myMoney = myMoney - 1;
		
	}

}






