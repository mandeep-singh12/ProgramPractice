/*WAP to find leap year*/

import java.util.Scanner;

public class program10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter year :");
		int year=sc.nextInt();
	
		if(year%4==0 && year%100!=0 ||  year%400==0)
		{	 
			System.out.println("leap year :");
				
		}
		else {
			System.out.println("not leap year :");
			
		}
		
		sc.close();
	}

}
