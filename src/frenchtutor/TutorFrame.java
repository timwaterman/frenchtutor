package frenchtutor;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TutorFrame implements ActionListener{
	
	private JFrame frame = new JFrame();
	private JButton begin;
	
	
	//constructing the initial frame
	public TutorFrame() {
		
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		begin = new JButton("Begin");
		begin.addActionListener(this);
		JPanel start = new JPanel( new FlowLayout() );
		start.add(begin);
		
		JLabel welcome = new JLabel("Bonjour! Welcome to the French Tutor!");
		Font MyFont;
		MyFont = new Font("SansSerif",Font.BOLD,16);
		welcome.setFont(MyFont);
		welcome.setHorizontalTextPosition(JLabel.CENTER);
		
		frame.add(start, BorderLayout.CENTER);
		frame.add(welcome, BorderLayout.NORTH);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == begin) {
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
	}

}
