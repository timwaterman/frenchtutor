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
	private JPanel MainMenu = new JPanel();;
	private final JPanel QuizPanel = new JPanel();
	private JPanel AnswerPanel = new JPanel();
	private JPanel AddPanel = new JPanel();
	private JTextField wordField;
	private JTextField definitionField;
	private final String word = "Hello";
	private JTextField txtDefinition;

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
	
	public void MainMenuSetup() {

		contentPane.add(MainMenu, "MainMenu");
		MainMenu.setLayout(null);
		MainMenu.setVisible(true);
		
		JButton btnBegin = new JButton("BEGIN");
		btnBegin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.setVisible(false);
				QuizPanel.setVisible(true);
			}
		});
		btnBegin.setBounds(179, 116, 81, 29);
		MainMenu.add(btnBegin);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the French Tutor!");
		lblWelcomeToThe.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblWelcomeToThe.setBounds(111, 39, 245, 42);
		MainMenu.add(lblWelcomeToThe);
		
		JButton btnAddData = new JButton("Add to Database");
		btnAddData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.setVisible(false);
				AddPanel.setVisible(true);
			}
		});
		btnAddData.setBounds(6, 233, 154, 29);
		MainMenu.add(btnAddData);
		
		
	}
	
	public void DefQSetup() {
		
		contentPane.add(QuizPanel, "name_1403661321578987000");
		QuizPanel.setLayout(null);
		
		JLabel lblPleaseDefine = new JLabel("Please Define the following: ");
		lblPleaseDefine.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblPleaseDefine.setBounds(67, 76, 212, 24);
		QuizPanel.add(lblPleaseDefine);
		
		JLabel lblWord = new JLabel(word);
		lblWord.setBounds(17, 138, 136, 33);
		QuizPanel.add(lblWord);
		
		txtDefinition = new JTextField();
		txtDefinition.setText("Definition in here");
		txtDefinition.setBounds(165, 140, 269, 28);
		QuizPanel.add(txtDefinition);
		txtDefinition.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuizPanel.setVisible(false);
				AnswerPanel.setVisible(true);
			}
		});
		btnEnter.setBounds(142, 183, 117, 29);
		QuizPanel.add(btnEnter);
		QuizPanel.setVisible(false);
		
	}
	
	public void ResultPanelSetup() {
		
		contentPane.add(AnswerPanel, "name_1403661831076091000");
		AnswerPanel.setLayout(null);
		
		JLabel lblYouMayOr = new JLabel("You may or may not be correct!");
		lblYouMayOr.setBounds(94, 32, 227, 68);
		AnswerPanel.add(lblYouMayOr);
		
		JButton btnNextQuestion = new JButton("Next Question");
		btnNextQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AnswerPanel.setVisible(false);
				QuizPanel.removeAll();
				DefQSetup();
				QuizPanel.setVisible(true);
			}
		});
		btnNextQuestion.setBounds(141, 154, 129, 29);
		AnswerPanel.add(btnNextQuestion);
		AnswerPanel.setVisible(false);
		
	}
	
	public void AddPanelSetup() {
		

		contentPane.add(AddPanel, "name_1403662925553163000");
		AddPanel.setLayout(null);
		AddPanel.setVisible(false);
		
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
				
				String dataEntry = "";
				dataEntry += wordField.getText() + "," + definitionField.getText() + "\n";
				System.out.println(dataEntry);
				wordField.setText("WORD");
				definitionField.setText("DEF1, DEF2, DEF...");
			}
		});
		btnAdd.setBounds(143, 176, 117, 29);
		AddPanel.add(btnAdd);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddPanel.setVisible(false);
				MainMenu.setVisible(true);
			}
		});
		btnGoBack.setBounds(317, 233, 117, 29);
		AddPanel.add(btnGoBack);
		
	}
	
	public void initialize() {
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		MainMenuSetup();
		DefQSetup();
		ResultPanelSetup();
		AddPanelSetup();
	
		
	}
}
