package LabJavaSwing_1;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	
	

	JTextField textField = new JTextField();
	JTextField textFieldStreet = new JTextField();
	JTextField textFieldCity = new JTextField();
	JTextField textFieldState  = new JTextField();
	JTextField textFieldZip = new JTextField();
	 MyFrame()  {
		 
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setLayout(null);
		 
		 JLabel label = new JLabel("name");
		 label.setBounds(50,10,80,25);
		 textField.setBounds(50, 30,150,20);

		 JLabel labelStreet = new JLabel("Street");
		 labelStreet .setBounds(220,10,80,25);
		 textFieldStreet.setBounds(220, 30,150,20);

		 JLabel labelCity = new JLabel("City");
		 labelCity.setBounds(390,10,80,25);
		 textFieldCity.setBounds(390, 30,150,20);
		 
		 
		 JLabel labelState = new JLabel("State ");
		 labelState .setBounds(130,60,80,25);
		 textFieldState .setBounds(130, 80,150,20);
		 textFieldState .setSize(150,20);
		 
		 JLabel labelZip = new JLabel("Zip");
		 labelZip.setBounds(300,60,80,25);
		 textFieldZip.setBounds(300, 80,150,20);
		 
		 JButton button = new JButton("Submit");
		 button.setBounds(240,120,80,30);
		 button.addActionListener(this);
		 this.add(button);

		 
		 this.add(textField);
		 this.add(label);
		 this.add(textFieldStreet);
		 this.add(labelStreet);
		 this.add(textFieldCity);
		 this.add(labelCity);
		 this.add(labelState);
		 this.add(textFieldState);
		 this.add(labelZip);
		 this.add(textFieldZip);
		 
		 this.setSize(600,300);
		 this.setVisible(true);
		 
	 }


	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(textField.getText());
		System.out.println(textFieldStreet.getText());
		System.out.println(textFieldCity.getText());
		System.out.println(textFieldState.getText());
		System.out.println(textFieldZip.getText());
		// TODO Auto-generated method stub
		
	}

}
