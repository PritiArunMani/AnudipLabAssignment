package program;

public class String_Ascending_Order {

	public static void main(String[] args) 
	{
		String s = " this is easiest example";
		String[] s1=s.split("\\s");
		
		for(int i=0;i<s1.length;i++)
		{
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].length()>s1[j].length())
				{
					String temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
				}		
			}
		}
		for(int i=0;i<s1.length;i++)
		{System.out.print(s1[i]+" ");
		}
			
	
	}

}
