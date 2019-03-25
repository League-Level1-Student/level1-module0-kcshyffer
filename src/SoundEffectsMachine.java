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
public void showButton() {
	JFrame bruhFrame = new JFrame();
    bruhFrame.setVisible(true);
    JPanel bruhPanel = new JPanel();
    bruhFrame.add(bruhPanel);
    JButton bruhButton = new JButton();
    JButton bruhButton2 = new JButton();
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
	
	
}
}
