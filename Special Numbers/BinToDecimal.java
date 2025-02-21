import java.util.Scanner;
class BinToDecimal 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pow = 1;
		int sum = 0;

		while (num>0)
		{
			int rem = num%10;
			sum += (pow*rem);
			num/=10;
			pow*=2;
		}
		System.out.println(sum);
	}
}
