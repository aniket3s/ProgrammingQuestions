import java.util.Scanner;
class HappyNumber 
{
	public static int sumOfSqOfDigit(int num)
	{
		int sum = 0;
		while (num!=0)
		{
			int rem = num%10;
			int square = (rem*rem);
			sum += square;
			num/=10;
		}
		return sum;
	}
	public static boolean isHappy(int num)
	{
		int sum = sumOfSqOfDigit(num);
		while (sum !=4 && sum !=1)
		{
			sum = sumOfSqOfDigit(sum);
		}
		return sum==1?true:false;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(isHappy(num));
	}
}
