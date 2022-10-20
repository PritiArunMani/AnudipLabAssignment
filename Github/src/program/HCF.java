package program;

public class HCF {

	public static void main(String[] args)
	{
		int a = 60;
		int b = 36;
		int h = 0;
		
		for (int i=1;i<=a;i++) 
		{
			if (a%i==0&&b%i==0) 
			
				h=i;
			
		}
		System.out.println("HCF = "+h);


	}

}
