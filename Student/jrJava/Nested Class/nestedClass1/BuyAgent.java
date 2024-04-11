package jrJava.nestedClass1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class BuyAgent implements ActionListener {

	// business fields;
	// business methods;
	
	private JButton button;
	private JTextField textField;
	
	
	public void setButton(JButton button){ this.button = button; }
	public void setTextField(JTextField textField){ this.textField = textField; }
	
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==button){
			processBuying("XYZ", 1000);
			textField.setText("Just purchased 1000 stocks of XYZ company.");
		}
	}
	
		
	private void processBuying(String name, int quantity){
		// business logic.
	}
	
	
}

















