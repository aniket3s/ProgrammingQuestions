import java.util.Scanner;
class AllCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);

		String str = (ch>='a'&&ch<='z')?("Lowercase"):((ch>='A'&&ch<='Z')?("UpperCase"):((ch>='0'&&ch<='9')?("Digit"):("SpecialCharacter")));
		System.out.println(str);
	}
}
