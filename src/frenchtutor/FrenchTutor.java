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
import javax.swing.JList;
import javax.swing.JComboBox;

public class FrenchTutor extends JFrame {

	//EDIT
	private JPanel contentPane;
	private JPanel MainMenu = new JPanel();;
	private final JPanel DefPanel = new JPanel();
	private JPanel AnswerPanel = new JPanel();
	private JPanel AddDefPanel = new JPanel();
	private JPanel AddVerbPanel = new JPanel();
	private JTextField wordField;
	private JTextField definitionField;
	private final String word = "Term goes here:";
	private JTextField txtDefinition;
	private JTextField verbText;
	private JTextField jeText;
	private JTextField tuText;
	private JTextField ilText;
	private JTextField nousText;
	private JTextField vousText;
	private JTextField ilsText;

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
				DefPanel.setVisible(true);
			}
		});
		btnBegin.setBounds(179, 116, 81, 29);
		MainMenu.add(btnBegin);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the French Tutor!");
		lblWelcomeToThe.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblWelcomeToThe.setBounds(111, 39, 245, 42);
		MainMenu.add(lblWelcomeToThe);
		
		JButton btnAddData = new JButton("Add Definition");
		btnAddData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu.setVisible(false);
				AddDefPanel.setVisible(true);
			}
		});
		btnAddData.setBounds(6, 233, 154, 29);
		MainMenu.add(btnAddData);
		
		JButton verbButton = new JButton("Add Verb");
		verbButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu.setVisible(false);
				AddVerbPanel.setVisible(true);
			}
		});
		verbButton.setBounds(172, 233, 126, 29);
		MainMenu.add(verbButton);
		
		
	}
	
	public void DefQSetup() {
		
		contentPane.add(DefPanel, "name_1403661321578987000");
		DefPanel.setLayout(null);
		
		JLabel lblPleaseDefine = new JLabel("Please Define the following: ");
		lblPleaseDefine.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblPleaseDefine.setBounds(67, 76, 212, 24);
		DefPanel.add(lblPleaseDefine);
		
		JLabel lblWord = new JLabel(word);
		lblWord.setBounds(17, 138, 136, 33);
		DefPanel.add(lblWord);
		
		txtDefinition = new JTextField();
		txtDefinition.setText("Definition in here");
		txtDefinition.setBounds(165, 140, 269, 28);
		DefPanel.add(txtDefinition);
		txtDefinition.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefPanel.setVisible(false);
				AnswerPanel.setVisible(true);
			}
		});
		btnEnter.setBounds(142, 183, 117, 29);
		DefPanel.add(btnEnter);
		DefPanel.setVisible(false);
		
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
				DefPanel.removeAll();
				DefQSetup();
				DefPanel.setVisible(true);
			}
		});
		btnNextQuestion.setBounds(141, 154, 129, 29);
		AnswerPanel.add(btnNextQuestion);
		AnswerPanel.setVisible(false);
		
	}
	
	public void AddPanelSetup() {
		

		contentPane.add(AddDefPanel, "name_1403662925553163000");
		AddDefPanel.setLayout(null);
		AddDefPanel.setVisible(false);
		
		wordField = new JTextField();
		wordField.setText("WORD");
		wordField.setBounds(28, 117, 134, 28);
		AddDefPanel.add(wordField);
		wordField.setColumns(10);
		
		definitionField = new JTextField();
		definitionField.setText("DEF1, DEF2, DEF...");
		definitionField.setBounds(226, 117, 134, 28);
		AddDefPanel.add(definitionField);
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
		AddDefPanel.add(btnAdd);
		
		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddDefPanel.setVisible(false);
				MainMenu.setVisible(true);
			}
		});
		btnGoBack.setBounds(317, 233, 117, 29);
		AddDefPanel.add(btnGoBack);
		
		//EVERYTHING UNDER HERE MUST GO INTO ITS OWN INIT FUNCTIONS
		JPanel VerbPanel = new JPanel();
		contentPane.add(VerbPanel, "name_1404780582824207000");
		VerbPanel.setLayout(null);
	}
	
	public void AddVerbSetup() {
		

		contentPane.add(AddVerbPanel, "name_1404780705383609000");
		AddVerbPanel.setLayout(null);
		
		verbText = new JTextField();
		verbText.setBounds(67, 30, 134, 28);
		AddVerbPanel.add(verbText);
		verbText.setColumns(10);
		
		JLabel infinitive = new JLabel("Verb");
		infinitive.setBounds(30, 33, 40, 22);
		AddVerbPanel.add(infinitive);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddVerbPanel.setVisible(false);
				MainMenu.setVisible(true);
			}
		});
		btnBack.setBounds(317, 233, 117, 29);
		AddVerbPanel.add(btnBack);
		
		jeText = new JTextField();
		jeText.setBounds(67, 88, 134, 28);
		AddVerbPanel.add(jeText);
		jeText.setColumns(10);
		
		tuText = new JTextField();
		tuText.setBounds(67, 139, 134, 28);
		AddVerbPanel.add(tuText);
		tuText.setColumns(10);
		
		ilText = new JTextField();
		ilText.setBounds(67, 191, 134, 28);
		AddVerbPanel.add(ilText);
		ilText.setColumns(10);
		
		nousText = new JTextField();
		nousText.setBounds(300, 88, 134, 28);
		AddVerbPanel.add(nousText);
		nousText.setColumns(10);
		
		vousText = new JTextField();
		vousText.setBounds(300, 139, 134, 28);
		AddVerbPanel.add(vousText);
		vousText.setColumns(10);
		
		ilsText = new JTextField();
		ilsText.setBounds(300, 191, 134, 28);
		AddVerbPanel.add(ilsText);
		ilsText.setColumns(10);
		
		JComboBox tenseBox = new JComboBox();
		tenseBox.setBounds(300, 32, 134, 27);
		tenseBox.addItem("Present");
		tenseBox.addItem("Passe Compose");
		AddVerbPanel.add(tenseBox);
		
		JLabel lblTense = new JLabel("Tense");
		lblTense.setBounds(248, 36, 40, 16);
		AddVerbPanel.add(lblTense);
		
		
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
		AddVerbSetup();
	
		
	}
}
