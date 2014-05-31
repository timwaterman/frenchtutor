/**
 * Tim Waterman
 * French Tutor Project - Tester File
 * May 2014
 * */

package frenchtutor;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TutorTester {

	public static void main(String[] args) {

		TutorFrame myframe = new TutorFrame();
		
		/*begin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//create the new window and close the old one
				frame.removeAll();
				frame.setVisible(false);
				frame.dispose();
				JFrame tutor = new JFrame();
				tutor.setSize(800, 800);
				tutor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//Container with Button and textbar
				JButton submit = new JButton("Submit");
				JTextField answer = new JTextField("Answer Here");
				JPanel inputBar = new JPanel( new FlowLayout() );
				inputBar.add(answer);
				inputBar.add(submit);
				
				tutor.add(inputBar, BorderLayout.NORTH);
				tutor.setVisible(true);
				
			}
		});*/
	}

}
