package Lab01_b;

import java.util.Iterator;

import Lab01.Stack;

public class BracketCheck {
	private String inputStr;

	public BracketCheck(String inputStr) {
		this.inputStr = inputStr;
	}
	
	public void checkBracket() {
		int size = inputStr.length();
		Stack bStack = new Stack(size);
		
		for(int i = 0; i < size; i++) {
			if(inputStr.charAt(i) == '(') {
				bStack.push('(');
			} else if(inputStr.charAt(i) == ')') {
				bStack.pop();
			}
		}
		if(!bStack.isEmpty()) {
			System.out.println("Invalid String");
		} else {
			System.out.println("Valid String");
		}
	}
}
