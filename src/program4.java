
/*WAP to find factorial of given numbers*/

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number :");
		int num=sc.nextInt();

		int fact = 1,i = 1;
		
		while(i<=num)
		{
			fact=i*fact;
			i++;
			
		}
		
		System.out.print("Factorial of given number is : " + fact);
		sc.close();
	}

}
