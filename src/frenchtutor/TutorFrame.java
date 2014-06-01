package frenchtutor;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TutorFrame implements ActionListener{
	
	private JFrame frame;
	private JButton begin, add;
	
	
	//constructing the initial frame
	public TutorFrame() {
		frame = new JFrame();
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
		
		JPanel bottom = new JPanel(new BorderLayout());
		add = new JButton("Add");
		add.addActionListener(this);
		bottom.add(add, BorderLayout.WEST);
		
		frame.add(start, BorderLayout.CENTER);
		frame.add(welcome, BorderLayout.NORTH);
		frame.add(bottom, BorderLayout.SOUTH);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == begin) { //clicking the begin button
			setupFrame();
		}
		if (e.getSource() == add) {
			//do the setup
			//System.out.println("Oh so you want to add?");
		}
	}
	
	public void setupFrame() {
		
		frame.removeAll();
		frame.dispose();
		frame = new JFrame();
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Container with Button and textbar
		JButton submit = new JButton("Submit");
		JTextField answer = new JTextField("Definition Here");
		JPanel inputBar = new JPanel( new FlowLayout() );
		inputBar.add(answer);
		inputBar.add(submit);
		
		frame.add(inputBar, BorderLayout.CENTER);
		frame.setVisible(true);
		
	}

}
