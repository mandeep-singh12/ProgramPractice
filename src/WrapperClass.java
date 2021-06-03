
public class WrapperClass {

	public static void main(String[] args)
	{
		Integer number = new Integer(55);//int
		Integer number2 = new Integer("55");//String
		Float number3 = new Float(55.0);//double argument
		Float number4 = new Float(55.0f);//float argument
		Float number5 = new Float("55.0f");//String
		
		System.out.println(number);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		
		
		//Auto boxing 
		Integer nineC = 9;
		System.out.println(nineC);
	}

}
