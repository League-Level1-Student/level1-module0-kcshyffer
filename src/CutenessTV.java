

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	public static void main(String[] args) {
		CutenessTV TV = new CutenessTV();
		TV.showButton();
	}
	
	JButton bruhButton = new JButton();
	JButton bruhButton2 = new JButton();
	JButton bruhButton3 = new JButton();

	
	
	public void showButton() {
		JFrame bruhFrame = new JFrame();
	    bruhFrame.setVisible(true);
	    JPanel bruhPanel = new JPanel();
	    bruhFrame.add(bruhPanel);
	    bruhPanel.add(bruhButton);
	    bruhPanel.add(bruhButton2);
	    bruhPanel.add(bruhButton3);
	    bruhFrame.pack();
	    bruhButton.addActionListener(this);
	    bruhButton2.addActionListener(this);
	    bruhButton3.addActionListener(this);

	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == bruhButton) {
			showFrog();
		}
		else if(e.getSource() == bruhButton2) {
			showFluffyUnicorns();
		}
		else {
			showDucks();
		}
		
	}

}
