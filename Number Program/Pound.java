import java.util.Scanner;
class Pound 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight in pound : ");
		double pound = sc.nextDouble();
		double kg = pound * 0.454;
		System.out.println("weigth = "+kg + "kg");
	}
}
