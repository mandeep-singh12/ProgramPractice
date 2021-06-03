
public class loop {

	public static void main(String[] args) {
		outer:
		for (int j = 0; j < 2; j++) 
		{
			for (int k = 0; k < 10; k++) 
			{
				System.out.println(j + "" + k);
				if (k == 5)
				{
					break outer;//Takes out of loop using k
				}
			}
		}
	/*	
		for (int i = 0,j = 0; i < 10; i++,j--) {
			System.out.println(j);
			}
*/
	}

}
