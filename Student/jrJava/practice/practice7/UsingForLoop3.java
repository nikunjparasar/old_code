package jrJava.practice7;

public class UsingForLoop3 {

	public static void main(String[] args) {


		int sum = 0;
		int i;

		// 1 + 2 + 3 + 4 + ... + 100
		for(i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("Sum=" + sum); 


		// 1 + 3 + 5 + ... + 1001
		for(i=1; i<=1001; i+=2) {
			sum += i;
		}
		System.out.println("Sum=" + sum); 


		// 100 + 105 + 110 + ... + 2500
		for(i=100; i<=2500; i+=5) {
			sum += i;
		}
		System.out.println("Sum=" + sum); 

		
		// 1*1 + 2*2 + 3*3 + 4*4 + ... + 100*100
		for(i=1; i<=100; i++) {
			sum += i*i;
		}
		System.out.println("Sum=" + sum); 

		
		// sqrt(5) + sqrt(10) + sqrt(15) + ... +sqrt(100)
		double sqrtSum = 0.0;
		for(i=5; i<=100; i+=5) {
			sqrtSum += Math.sqrt(i);
		}
		System.out.println("Sqrt Sum = " + sqrtSum); 
		
		
		// 1*2 + 2*3 + 3*4 + ... + 100*101
		for(i=1; i<=100; i++) {
			sum += i*(i+1);
		}
		System.out.println("Sum=" + sum); 
		
	}

}










