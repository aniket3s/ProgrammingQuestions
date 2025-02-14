import java.util.Scanner;
class MultiTable
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		System.out.println("Enter the range : ");
		int range = sc.nextInt();

		for(int i=0;i<=range;i++)
		{
			System.out.println(n +" x "+i +" = "+(n*i));
		}
	}
}
