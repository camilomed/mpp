package labJavaSwing_3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	
	
	JMenu myMenu = new JMenu("myMenu");
	JMenuBar menuBar = new JMenuBar();
	
	JMenuItem item1 = new JMenuItem("Item 1");
	JMenuItem item2 = new JMenuItem("Item 2");
	JMenuItem item3 = new JMenuItem("Item 3");

	 MyFrame()  {
		 
	        setSize(400, 300);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);

	        setVisible(true);
	        myMenu.add(item1);
	        myMenu.add(item2);
	        myMenu.add(item3);
	        item1.addActionListener(this);
	        item2.addActionListener(this);
	        item3.addActionListener(this);

	        menuBar.add(myMenu);

	        setJMenuBar(menuBar);
		 
	 }


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==item1) {
			System.out.println(" 1  clicked.");
		}
		if(e.getSource()==item2) {
			System.out.println(" 2  clicked.");
		}
		if(e.getSource()==item3) {
			System.out.println(" 3  clicked.");
		}
		
	}
 

}
