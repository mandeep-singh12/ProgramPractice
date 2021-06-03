import java.util.Scanner;

public class program16 {

	public static void main(String[] args) {
		
		 
		
		System.out.print("Please enter state : ");
		Scanner sc = new Scanner(System.in);
		String state= sc.next();
		
		System.out.print("Please enter type: ");
 		String type= sc.next();
		
 		System.out.print("Please enter consumed units : ");
		Scanner un = new Scanner(System.in);
		int unit= un.nextInt() ;
 		
 		
 		String state1="Punjab";
		String state2="Delhi";
		String state3="J&K";
	 	
		double charge;
		double rate;
	   		
		if(state1.equalsIgnoreCase(state))
 		{
 					if(type.equalsIgnoreCase("Residential"))
 					{
 						if(unit > 0 && unit <=200)
 						{						
 							charge=(4.5) * (unit);
 						}
 						else if(unit > 201  && unit <=400)
 						{ 						
 							charge=(6) * (unit);
 						 }	
 						else
 						{
 							charge=(7.5) * (unit);
 						 }
 					
 						System.out.println();
 						System.out.print("State");
 						System.out.print("\t\t\t");
 						
 						System.out.println("Type");
 				 						
 						System.out.print(state);
 						System.out.print("\t\t\t");
 						System.out.println(type);
 						System.out.println("");

 						System.out.print("Consumed Units");
 						System.out.print("\t \t");
 						System.out.println("Rate per unit");

 						System.out.print(unit);
 						if(unit > 0 && unit <=200)
 						{
 							rate=4.5;
 						}
 						else if(unit > 201  && unit <=400)
 						{
 							rate=6;
 						 }	
 						else
 						{
 							rate=7.5;
 						 }
 						System.out.print("\t\t\t");
 						System.out.print(rate);
 						System.out.println("\n");
 						System.out.println("Total Charge");
 						System.out.println(charge);
 					}
 					else if(type.equalsIgnoreCase("Commercial"))
 					{
 						if(unit > 0 && unit <=200)
 						{
 							charge=(5.5) * (unit);
 						}
 						else if(unit > 201  && unit <=400)
 						{
 							charge=(7) * (unit);
 						}	
 						else
 						{
 							charge=(8.5) * (unit);
 						}	
 						System.out.println();
 						System.out.print("State");
 						System.out.print("\t\t\t");
 						
 						System.out.println("Type");
 				 						
 						System.out.print(state);
 						System.out.print("\t\t\t");
 						System.out.println(type);
 						System.out.println("");

 						System.out.print("Consumed Units");
 						System.out.print("\t \t");
 						System.out.println("Rate per unit");

 						System.out.print(unit);
 						if(unit > 0 && unit <=200)
 						{
 							rate=5.5;
 						}
 						else if(unit > 201  && unit <=400)
 						{
 							rate=7;
 						 }	
 						else
 						{
 							rate=8.5;
 						 }
 						System.out.print("\t\t\t");
 						System.out.print(rate);
 						System.out.println("\n");
 						System.out.println("Total Charge");
 						System.out.println(charge);
 					}
 					else 
 					{
 			 			System.out.println("Invalid input");
 						 
 					}
 						

 		}
 		else if(state2.equalsIgnoreCase(state)) 
 		{
 					System.out.println("Delhi");
 		}
 
 		else if(state3.equalsIgnoreCase(state)) 
 		{
 					System.out.println("J&K");
 		}
 		else 
 		{
 			System.out.println("Invalid state");
 	 			
 		}
		sc.close();
		un.close();
		
	}

	 

}
