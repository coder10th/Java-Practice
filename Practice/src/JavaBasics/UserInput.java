package JavaBasics;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		//System.out.println("Hai what is your name?");
		String s="hi";
		System.out.println("enter");
		Scanner scan= new Scanner(System.in);
		String name=scan.nextLine();
				System.out.println(s==name);

	}

}
