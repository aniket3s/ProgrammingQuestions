import java.util.Scanner;
class ArmStrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int len = 0;
		int sum = 0;
		int dup = num;

		for (int i= num;i>0 ;i/=10 )
		{
			len++;
		}
		while (num>0)
		{
			int rem = num%10;
			int pow = 1;
			for (int j =1;j<=len ;j++ )
			{
				pow *= rem;
			}
			sum += pow;
			num/=10;
		}
		System.out.println(dup==sum ? +dup +" is ArmStrong Number": dup +" is not ArmStrongNumber");
	}
}
