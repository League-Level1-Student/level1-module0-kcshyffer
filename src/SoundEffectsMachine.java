import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
public static void main(String[] args) {
	SoundEffectsMachine SFX = new SoundEffectsMachine();
	SFX.showButton();
}
JButton bruhButton = new JButton();
JButton bruhButton2 = new JButton();

public void showButton() {
	JFrame bruhFrame = new JFrame();
    bruhFrame.setVisible(true);
    JPanel bruhPanel = new JPanel();
    bruhFrame.add(bruhPanel);
    bruhFrame.add(bruhPanel);
    bruhPanel.add(bruhButton);
    bruhPanel.add(bruhButton2);
    bruhFrame.pack();
    bruhButton.addActionListener(this);
    bruhButton2.addActionListener(this);

}

	
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == bruhButton) {
			playSound("homer-woohoo.wav");}
	else {
		playSound("sawing-wood-daniel_simon.wav");
	}
	
}
}
