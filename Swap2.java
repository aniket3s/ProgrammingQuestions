import java.util.Scanner;
class Swap2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //4
		int b = sc.nextInt(); //2

		System.out.println("a : "+a);
		System.out.println("b : "+b);

			a = a+b; //a(6)b(2)
		    b = a-b; //a(4)(2)
			a = a-b; //a(2)(2)

		System.out.println("--- After Swapping ---");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}
