package frenchtutor;

import java.util.*;

public class DataNode {
	
	private String questionWord;
	private LinkedList<String> answers = new LinkedList<String>();
	
	public DataNode(String s, String a) {
		
		questionWord = s;
		addToAnswers(a);
	}
	
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

	public String getAnswers() {
		
		String s = "";
		
		for(int i = 0; i < answers.size(); i++) {
			
			s += answers.get(i);
			
			if (i + 1 < answers.size()) //only want commas until the last answer
				s += ",";
		}
		
		s += '\n';
		return s;
	}
}
