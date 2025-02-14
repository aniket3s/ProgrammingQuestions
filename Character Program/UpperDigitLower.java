/* find the character is uppercase lowercase or Digit
0-9 
A-Z   
a-z   
*/
import java.util.Scanner;
class UpperDigitLower 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		char ch = sc.next().charAt(0);

		String str = (ch>='A'&&ch<='Z')?("UpperCase"):((ch>='a'&&ch<='z')?("LowerCase"):(ch>='0'&&ch<='9')?("Digit"):(""));
		System.out.println(str);
	}
}
