import java.util.Scanner;
class PrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;

		for(int i =2; i< num;i++)
		{
			if(num%i == 0)
			{
				System.out.println(num +" is not prime Number");
				cnt++;
				break;
			}
		}
		System.out.println((cnt == 0)?(num+" is a primeNumber. "):(""));

	}
}
