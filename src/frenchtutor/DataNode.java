package frenchtutor;

import java.util.*;

public class DataNode {
	
	private String questionWord;
	private LinkedList<String> answers = new LinkedList<String>();
	
	public String getQuestionWord() {
		
		return questionWord;
	}

	public void setQuestionWord(String s) {
		
		questionWord = s;
	}
	
	//adds the argument to the end of the list of possible answers
	public void addToAnswers(String s) {
		
		answers.add(s);
	}
	
	public void clearAnswers() {
		
		answers.clear();
	}
}
