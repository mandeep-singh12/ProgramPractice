import java.util.Scanner;

/*WAP to find even and odd input numbers*/

public class program1 {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number :");
		int num=sc.nextInt();
		
		if (num%2==0)
		{
			System.out.println("Number is even");			
		}	
		else
		{
			System.out.println("Number is odd");			
		}
		sc.close();
	}

}
