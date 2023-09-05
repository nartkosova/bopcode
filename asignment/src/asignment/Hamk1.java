package asignment;

import java.util.Scanner;

public class Hamk1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Please give me a number:");
		String answer = in.nextLine();
		int answer1 = Integer.parseInt(answer);
		
		System.out.println("Please give me another number:");
		String answr = in.nextLine();
		int answer2 = Integer.parseInt(answr);
		
		System.out.println("Would you like to calculate the sum or the subtraction? Write sum or sub.");
		int sum = answer1 + answer2;
		int sub = answer1 - answer2;
		

	}

}
