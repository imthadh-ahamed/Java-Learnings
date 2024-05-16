package Ex2;

import Ex.StackClass;

public class Reverse {
	private String input;

	public Reverse(String input) {
		this.input = input;
	}
	
	public void reverse(String input) {
		int size = input.length();
		
		StackClass stk = new StackClass(size);
		
		for(int i = 0; i < size; i++) {
			char ch = input.charAt(i);
			
			stk.push(ch);
		}
		
		for(int i = 0; i < size; i++) {
			System.out.print(stk.pop());
		}
	}
	
	
}
