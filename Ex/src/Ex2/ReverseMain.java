package Ex2;

import java.util.Scanner;

public class ReverseMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		
		Reverse rv = new Reverse(input);
		rv.reverse(input);
	}

}
