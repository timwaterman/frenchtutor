package frenchtutor;

import java.util.*;

public class Database {
	
	private ArrayList<DataNode> buffer = new ArrayList<DataNode>();

	public void clearBuffer() {
		
		buffer.clear();
	}
	
	public void addItem(DataNode d) {
		
		buffer.add(d);
	}
	
	public int writeBuffer() {
		
		int written = 0;
		//this code will write the ArrayList to the file in a specified format.
		//should return number of items written for error checking/condition handling
		
		for(int i = 0; i < buffer.size(); i++) { //for each cell in the database
		
			String input = "def:";
			input += buffer.get(i).getQuestionWord();
			input += ("," + buffer.get(i).getAnswers());
			//System.out.println(input);
			written++;
		}
		return written;
	}
}
