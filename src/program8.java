/*WAP to find swap 2 numbers without using 3rd variable*/

import java.util.Scanner;

public class program8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter first number : ");
		int num1=sc.nextInt();
	
		System.out.println("Please enter second number : ");
		int num2=sc.nextInt();

		System.out.println("Numbers before swapping : ");
		System.out.println("First number : " + num1);
		System.out.println("Second number : " + num2);

		num2=num2-num1;
		num1=num1+num2;
		num2=num1-num2;
		System.out.println();
		
		System.out.println("Numbers after swapping : ");
		System.out.println("First number : " + num1);
		System.out.println("Second number : " + num2);
		
		sc.close();
	}

}
