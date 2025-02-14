import java.util.Scanner;
class Ey1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		if (str.contains("0000000")||str.contains("1111111"))
		{
			System.out.println("Dangerous");
		}
		else
		{
			System.out.println("not");
		}
	}
}
