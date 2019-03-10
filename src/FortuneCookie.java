import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	
public void showButton() {
    JFrame bruhFrame = new JFrame();
    bruhFrame.setVisible(true);
    JButton bruhButton = new JButton();
    bruhFrame.add(bruhButton);
    bruhFrame.pack();
    bruhButton.addActionListener(this);
    System.out.println("Button clicked");
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("Woohoo!");
	int rand = new Random().nextInt(5);
	if (rand == 1) {
		JOptionPane.showMessageDialog(null, "Today it's up to you to create the peacefulness you long for.");
	}
	else if (rand == 2) {
		JOptionPane.showMessageDialog(null, "A friend asks only for your time not your money.");
	}
	else if (rand == 3) {
		JOptionPane.showMessageDialog(null, "If you refuse to accept anything but the best, you very often get it.");
	}
	else if (rand == 4) {
		JOptionPane.showMessageDialog(null, "A smile is your passport into the hearts of others.");
	}
	else {
		JOptionPane.showMessageDialog(null, "You will game today.");
	}
}
}
