
public class stringLength {

	public static void main(String[] args) {
 
		String s="Automation";
	  
		
		int count=0;
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			count++ ;
		}
		//return count;
		System.out.println(count);
		
	}

}
