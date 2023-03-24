package labJavaSwing_2;

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
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	
	

	JButton button = new JButton("Count Letters");
	JButton button2 = new JButton("Reverse letters");
	JButton button3 = new JButton("Remove Duplicate");
	JTextField input = new JTextField();
	JTextField output = new JTextField();
	 MyFrame()  {
		 
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setLayout(null);
		 
		 JLabel label = new JLabel("input");
		 label.setBounds(50,10,80,25);
		 input.setBounds(50, 30,150,20);

		 JLabel labelOutput = new JLabel("Output");
		 labelOutput .setBounds(220,10,80,25);
		 output.setBounds(220, 30,150,20);

		 
		 button.setBounds(50,60,130,30);
		 button.addActionListener(this);
		 this.add(button);

		 button2.setBounds(200,60,130,30);
		 button2.addActionListener(this);
		 this.add(button2);
		 
		 button3.setBounds(350,60,130,30);
		 button3.addActionListener(this);
		 this.add(button3);

		 
		 this.add(input);
		 this.add(label);
		 this.add(output);
		 this.add(labelOutput);
		 
		 this.setSize(600,300);
		 this.setVisible(true);
		 
	 }


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			output.setText(""+input.getText().length());
			System.out.println(output.getText());
		}
		if(e.getSource()==button2) {
			StringBuilder sb=new StringBuilder(input.getText());
			sb.reverse();
			output.setText(""+sb);
		}
		if(e.getSource()==button3) {
			
			char str[] = input.getText().toCharArray();
			output.setText(""+
			removeDuplicate(str, str.length)) ;
		}
		
		
		// TODO Auto-generated method stub
		
	}
	
	static String removeDuplicate(char str[], int n)
    {
        int index = 0;
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
 

}
