import java.util.Scanner;
class isBouncy 
{
	public static void main(String[] args) // 123 // 321 // 213
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dup1 = num;
		int dup2 = num;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		boolean flag1 = true; // increasing
		boolean flag2 = true;//decreasing

		while (dup1>0)
		{
			int rem = dup1%10;
			if (rem<min)
			{
				min = rem;
			}else{
				flag1 = false;
			}
			dup1/=10;
		}
		while (dup2>0)
		{
			int rem = dup2%10;
			if (rem>max){
				max = rem;
			}else{
				flag2 = false;
			}
			dup2/=10;
		}
		if (!flag1 && !flag2)
			System.out.println(num+" is a bouncy number.");
		else
			System.out.println(num +" is not a Bouncy number");
	}
}
