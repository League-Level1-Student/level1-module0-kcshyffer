/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
                String image = ("https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Solid_blue.svg/225px-Solid_blue.svg.png");
		// 2. create a variable of type "Component" that will hold your image
                Component c;
		// 3. use the "createImage()" method below to initialize your Component
                c = createImage(image);
		// 4. add the image to the quiz window
                quizWindow.add(c);
		// 5. call the pack() method on the quiz window
                quizWindow.pack();
		// 6. ask a question that relates to the image
               String a = JOptionPane.showInputDialog("What color is the image?");
		// 7. print "CORRECT" if the user gave the right answer
                if (a.equalsIgnoreCase("blue")) {
					JOptionPane.showMessageDialog(null, "CORRECT!");
				}
		// 8. print "INCORRECT" if the answer is wrong
                else {
                		JOptionPane.showMessageDialog(null, "INCORRECT!");
                }
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
                quizWindow.remove(c);
		// 10. find another image and create it (might take more than one line of code)
                String Image = ("https://cdn11.bigcommerce.com/s-hfhomm5/images/stencil/1280x1280/products/180/451/Solid_Red_Sized__25214.1507754519.jpg?c=2&imbypass=on");
                Component e;
                e = createImage(Image);
		// 11. add the second image to the quiz window
                quizWindow.add(e);
		// 12. pack the quiz window
                quizWindow.pack();
		// 13. ask another question
                String b = JOptionPane.showInputDialog("What color is the image?");
		// 14+ check answer, say if correct or incorrect, etc.
                if (b.equalsIgnoreCase("red")) {
					JOptionPane.showMessageDialog(null, "CORRECT!");
				}
		// 8. print "INCORRECT" if the answer is wrong
                else {
                		JOptionPane.showMessageDialog(null, "INCORRECT!");
                }
	}

	
	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}
