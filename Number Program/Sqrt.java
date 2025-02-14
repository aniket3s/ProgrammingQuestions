import java.util.Scanner;
class Sqrt 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();


		for(int i = 1 ; i< num ;i++)
		{
			if(num%i == 0)
			{
				if(i*i == num)
				{
					System.out.println("Square root is : "+i);
					break;
				}
			}
		}
	}
}
