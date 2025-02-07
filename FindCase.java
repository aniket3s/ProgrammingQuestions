import java.util.Scanner;
class FindCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

		String s = (ch >= 65 && ch <= 90)?("Uppercase"):("LowerCase");
		System.out.println(s);
	}
}
