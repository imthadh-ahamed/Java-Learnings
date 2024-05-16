package Lab01_b;

import java.util.Scanner;

public class BracketCheckMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter an expression: ");
		String expression = scanner.nextLine();
		
		BracketCheck bracketcheck = new BracketCheck(expression);
		bracketcheck.checkBracket();
	}

}
