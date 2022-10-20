package program;

public class Transpose_Matrix {

	public static void main(String[] args) 
	{
		int a[][]= {{1,2},{4,5},{8,9}};
		
		int b[][]= new int[2][3];
		int mul=1;
		System.out.println("Matrix :");
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<2;j++) 
			{
				b[j][i]=a[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				mul=mul*b[i][j];
			}
		}
		System.out.println("Multiplication is "+mul);

	}

}
