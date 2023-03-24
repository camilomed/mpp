package labJavaSwing4_5;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyFrame2 extends JFrame implements ActionListener {

	 private JComboBox<String> sportsComboBox;
	    private JButton okayButton;

	    private final String[] sportsList = {"Baseball", "Soccer", "Basketball", "Track Running"};

	public MyFrame2() {
		   setTitle("Sports ComboBox Demo");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        sportsComboBox = new JComboBox<>(sportsList);

	        JPanel centerPanel = new JPanel(new BorderLayout());
	        centerPanel.add(sportsComboBox, BorderLayout.CENTER);

	        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	        okayButton = new JButton("Okay");
	        okayButton.addActionListener(this);
	        bottomPanel.add(okayButton);

	        add(centerPanel, BorderLayout.CENTER);
	        add(bottomPanel, BorderLayout.SOUTH);

	        pack();
	        setLocationRelativeTo(null);
//	        setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == okayButton) {
            String selectedSport = (String) sportsComboBox.getSelectedItem();
            JOptionPane.showMessageDialog(this, "Selected sport: " + selectedSport);
        }		
	}

}
