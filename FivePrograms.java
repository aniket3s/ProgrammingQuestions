class FivePrograms 
{
	public static void main(String[] args) 
	{
		// 0-9 
		    System.out.println("0-9");
		for(int i = 1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		//A-Z
		   System.out.println("A-Z");
		for(char ch = 'A';ch<='Z';ch++)
		{
			System.out.print(ch+" ");
		}
		//z-a
			System.out.println("z-a");
		for(char ch = 'z';ch>='a';ch--)
		{
			System.out.print(ch+" ");
		}
		//0-9
		   System.out.println("0-9");
		for(char ch='0';ch<='9';ch++)
		{	
			System.out.print(ch+" ");
		}
		//Ascii
		for(int i = 0 ; i<=127;i++)
		{
			System.out.print(((char)i)+" ");
		}
		
	}
}
