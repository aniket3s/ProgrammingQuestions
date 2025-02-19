import java.util.Scanner;
class Duck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//System.out.println(str.charAt(0)=='0'?(str+" not a duck number"):((str.contains("0"))?(str +" is a duck number"):(str +" is not a duck number")));
		if (str.charAt(0)=='0')
		{
			System.out.println(str + " is not a duck number.");
		}
		else 
		{
			if (!str.contains("0")){
			System.out.println(str +" is not a duck number");
			}
			else{
			System.out.println(str +" is a Duck number");
			}
		}
	}
}
