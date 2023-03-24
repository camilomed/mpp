package labJavaSwing4_5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	 private JCheckBox baseballCheckBox, soccerCheckBox, basketballCheckBox, trackRunningCheckBox;
	    private JButton okayButton;
public MyFrame() {
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        baseballCheckBox = new JCheckBox("Baseball");
        soccerCheckBox = new JCheckBox("Soccer");
        basketballCheckBox = new JCheckBox("Basketball");
        trackRunningCheckBox = new JCheckBox("Track Running");

        JPanel sportsPanel = new JPanel(new GridLayout(4, 1));
        sportsPanel.add(baseballCheckBox);
        sportsPanel.add(soccerCheckBox);
        sportsPanel.add(basketballCheckBox);
        sportsPanel.add(trackRunningCheckBox);

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(sportsPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        okayButton = new JButton("Okay");
        okayButton.addActionListener(this);
        bottomPanel.add(okayButton);

        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
//        setVisible(true);
		 
	 }


	@Override
	public void actionPerformed(ActionEvent e) {
		  if (e.getSource() == okayButton) {
	            String selectedSports = "";

	            if (baseballCheckBox.isSelected()) {
	                selectedSports += "Baseball ";
	            }

	            if (soccerCheckBox.isSelected()) {
	                selectedSports += "Soccer ";
	            }

	            if (basketballCheckBox.isSelected()) {
	                selectedSports += "Basketball ";
	            }

	            if (trackRunningCheckBox.isSelected()) {
	                selectedSports += "Track Running ";
	            }

	            JOptionPane.showMessageDialog(this, "Selected sports: " + selectedSports);
	        }
		
	}
 

}
