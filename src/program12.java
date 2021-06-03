
/*WAP to calculate area of Circle,Rectangle and Triangle based on user input*/

import java.util.Scanner;

public class program12 {

	public static void main(String[] args) {
		
		System.out.println("Please enter 1 to calculate area of circle.");
		System.out.println("Please enter 2 to calculate area of rectangle.");
		System.out.println("Please enter 3 to calculate area of triangle.");
		
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number :");
		int num=sc.nextInt();
		
		double   area;
		switch(num)
		{
			case 1:
				System.out.println("Please enter radius : ");
				int r=sc.nextInt();
				area=(3.14)*r*r;
				System.out.println("Area of circle : " + area);
				break;		
				
			case 2:
				System.out.println("Please enter length:");
				int l=sc.nextInt();
				
				System.out.println("Please enter width:");
				int w=sc.nextInt();
				
				area = l*w;
				System.out.println("Area of reactangle : " + area);
				break;		
			
			case 3:
				System.out.println("Please enter base value:");
				int b=sc.nextInt();
				
				System.out.println("Please enter height value:");
				int h=sc.nextInt();
				
				area = (b*h)/2;
				System.out.println("Area of triangle : " + area);
			
				break;		
			
			default:
				System.out.println("Invalid input");
				break;		
		}
		sc.close();
	
	}

}
