import java.util.Scanner;

class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int len = 0;
		int div = 1;
		int dup = num;
		
		for (int i=num;i>0 ;i/=10 )
		{
			len++;
		}
		for (int i=num; i<=len;i++ )
		{
			div*=10;
		}

		if ((num*num)==div)
		{
			System.out.println(dup+" is an Automorphic Number");
		}
		else{
			System.out.println(dup +" is not an Automorphic number");
		}
		
	}
}
