import java.util.Scanner;
class FactorOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		for(int i = 1; i <= num ; i++)
		{
			if(num%i == 0)
			{
				System.out.print(i+" ");
				cnt++;
			}
		}
		System.out.println();
		System.out.print("No of factors is : "+cnt);
	}
}
