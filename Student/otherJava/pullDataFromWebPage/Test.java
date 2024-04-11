package otherJava.pullDataFromWebPage;

public class Test {

	public static void main(String[] args) {

		
		for(int i = 2; i<=100;){
	         boolean prime = true;
	         for(int j = 2; j <=i; j++) {
	            if((i % j) == 0 && j!=i) {
	               prime = false;
	            }
	         }
	         if (prime){
	            System.out.println(i);
	            i++;
	         }
	         else i ++;
	      }
	}
	

}
