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
		
		//this code will write the ArrayList to the file in a specified format.
		//should return number of items written for error checking/condition handling
		
		return 0;
	}
}
