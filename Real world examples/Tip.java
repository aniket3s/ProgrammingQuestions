import java.util.Scanner;
class  Tip
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int subTotal = sc.nextInt();
		float tipRate = sc.nextFloat();

		
		float total = subTotal + (subTotal*(tipRate/100));
		System.out.println(total);
	}
}
