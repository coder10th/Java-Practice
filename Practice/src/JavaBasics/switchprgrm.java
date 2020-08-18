package JavaBasics;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class switchprgrm {
	
	public static void main(String args[])
	{
		System.out.println("Enter Month");
		Scanner name= new Scanner(System.in);
		String month=name.nextLine();
			switch(month)
		{
		case "Jan":
			System.out.println("Month name is Jan"); 
		   break;
		case "Feb":
			System.out.println("Month name is Feb");
			break;
			default:
				System.out.println("enter either Jan or Feb");
				break;
		
	}
	}
}
