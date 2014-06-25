package frenchtutor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FrenchTutor extends JFrame {

	private JPanel contentPane;
	private JPanel QuizPanel;
	private JPanel AnswerPanel;
	private JPanel AddPanel;
	private JTextField wordField;
	private JTextField definitionField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrenchTutor frame = new FrenchTutor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrenchTutor() {

		initialize();
	}
	
	public void initialize() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		final JPanel MainMenu = new JPanel();
		contentPane.add(MainMenu, "MainMenu");
		MainMenu.setLayout(null);
		MainMenu.setVisible(true);
		
		final JPanel QuizPanel = new JPanel();
		contentPane.add(QuizPanel, "name_1403661321578987000");
		QuizPanel.setLayout(null);
		QuizPanel.setVisible(false);
		
		final JPanel AnswerPanel = new JPanel();
		contentPane.add(AnswerPanel, "name_1403661831076091000");
		AnswerPanel.setVisible(false);
		
		final JPanel AddPanel = new JPanel();
		contentPane.add(AddPanel, "name_1403662925553163000");
		AddPanel.setLayout(null);
		AddPanel.setVisible(false);
		
		JButton btnBegin = new JButton("BEGIN");
		btnBegin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.setVisible(false);
				QuizPanel.setVisible(true);
			}
		});
		btnBegin.setBounds(179, 116, 81, 29);
		MainMenu.add(btnBegin);
		
		JButton btnAddData = new JButton("Add to Database");
		btnAddData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.setVisible(false);
				AddPanel.setVisible(true);
			}
		});
		btnAddData.setBounds(6, 233, 154, 29);
		MainMenu.add(btnAddData);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the French Tutor!");
		lblWelcomeToThe.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblWelcomeToThe.setBounds(111, 39, 245, 42);
		MainMenu.add(lblWelcomeToThe);
		
		JRadioButton rdbtnButton = new JRadioButton("Button");
		rdbtnButton.setBounds(116, 72, 141, 23);
		QuizPanel.add(rdbtnButton);
		
		JRadioButton rdbtnButton_1 = new JRadioButton("Button");
		AnswerPanel.add(rdbtnButton_1);
		
		wordField = new JTextField();
		wordField.setText("WORD");
		wordField.setBounds(28, 117, 134, 28);
		AddPanel.add(wordField);
		wordField.setColumns(10);
		
		definitionField = new JTextField();
		definitionField.setText("DEF1, DEF2, DEF...");
		definitionField.setBounds(226, 117, 134, 28);
		AddPanel.add(definitionField);
		definitionField.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(wordField.getText());
				System.out.println(definitionField.getText());
				wordField.setText("WORD");
				definitionField.setText("DEF1, DEF2, DEF...");
			}
		});
		btnAdd.setBounds(143, 176, 117, 29);
		AddPanel.add(btnAdd);
		
	}
}
