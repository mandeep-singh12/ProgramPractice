//WAP to print addition of 2 matrix


public class program15 {

	public static void main(String[] args) {

		int arr[][] = new int[3][3]; 
		int i,j;

		System.out.println("Matrix A");

		for (i=0;i<=2;i++)
		{
			for (j=0;j<=2;j++)
			{
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
			
		System.out.println("Matrix B");

		for (i=0;i<=2;i++)
		{
			for (j=0;j<=2;j++)
			{
				System.out.print(arr[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}

	
	}

}
