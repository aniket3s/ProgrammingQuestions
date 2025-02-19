import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sumOfDigit = 0;
		int sumOfSquareOfDigit = 0; 
		int dup = num;

		while (dup >0)
		{
			int rem = dup%10;
			sumOfDigit += rem;
			sumOfSquareOfDigit += (rem*rem);
			dup/=10;
		}
		int sum2 = 0;
		while (sumOfSquareOfDigit>0)
		{
			int rem = sumOfSquareOfDigit%10;
			sum2+=rem;
			sumOfSquareOfDigit/=10;
		}
		if (sumOfDigit==sum2)
			System.out.println(num+" is Sunny Number.");
		else
		System.out.println(num +" is not a Sunny Number.");
	}
}
