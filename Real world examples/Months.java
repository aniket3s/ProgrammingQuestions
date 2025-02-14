import java.util.Scanner;
class Months
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		int years = month/12;
		float rmonths = ((month - (years*12f))>9) ?((month - (years*12))/100f):((month - (years*12))/10f);
		System.out.println(years + rmonths);
	}
}
