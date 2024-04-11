package jrJava.GUI_actonListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PQR implements ActionListener {

	// field1
	// field2;
	// ...
	
	// method1(){ }
	// method2(){ }
	// ....
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("myButton1")) {
			System.out.println("I am buying 5000 Google.");
		}
		else if(e.getActionCommand().equals("myButton2")) {
			System.out.println("I am selling 5000 Google.");
		}
		
	}

}






