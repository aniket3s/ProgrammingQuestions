import java.util.Scanner;
class Season
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String  op = sc.nextLine();

		 String season = 
			   (op.equals("FEB"))||(op.equals("MAR"))
			 ||(op.equals("APR"))||(op.equals("MAY")) ? "Summer":
			   (op.equals("SEP"))||(op.equals("JUNE"))
			 ||(op.equals("JUL"))||(op.equals("AUG"))? "Monsoon":
			   (op.equals("OCT"))||(op.equals("NOV"))
			 ||(op.equals("DEC"))||(op.equals("JAN")) ? "Winter":
						"Not a month";
		System.out.println(season);
	}
}
