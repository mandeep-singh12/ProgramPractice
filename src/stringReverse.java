
public class stringReverse {

	public static void main(String[] args) {
		 
		String str1="Hello";
		String str2="World";
		
		System.out.println(str1.charAt(2));
		System.out.println(str1.concat(str2));
		
		System.out.println(str1.length());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(1, 4));
		
		System.out.println("------------");
		
		String str = "Testing";
		System.out.println(str.toString());
		System.out.println(str.hashCode());
	//	System.out.println(str.clone());
		if(str instanceof Object)
		{
			System.out.println("I extend Object");//Will be printed
		}
		 
		
		/*Reverse
 * 		String s="Hello";
	  
		String rev  = "";
  		for(int j=s.length()-1 ;j>=0;j--)
		{
  			rev =rev + s.charAt(j);
		}
  		System.out.println(rev);
		
	
*/
	}
}
