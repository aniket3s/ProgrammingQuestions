import java.util.Scanner;
class LoanCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("									");

		System.out.println("		LOAN CALCULATOR				");
		System.out.println("Enter the amount : ");
		float amount = sc.nextFloat();
		System.out.println("Enter the Rate Of Interest :  ");
		int rateInterest = sc.nextInt();
		System.out.println("Enter the Tenure (months): ");
		int month = sc.nextInt();
		int years = month/12;
		float rmonths = ((month - (years*12f))>9) ?((month - (years*12))/100f):((month - (years*12))/10f);
		float finalMonth = years + rmonths;
		

		System.out.println();
		System.out.println("LOAN CALCUALTOR");
		System.out.println("														");
		System.out.println("	Principle amount : "+amount);
		System.out.println("	Rate Of Interest : "+rateInterest+"%");
		System.out.println("	Tenure           : "+finalMonth+"year");

		float interest = (amount*rateInterest*finalMonth)/100;
		float intYear = (amount*rateInterest)/100;
		float totalInter = intYear*rmonths;
		System.out.println("      Interest		 : "+interest);
		float outstanding = amount+interest;
		System.out.println("Total Oustanding Amount : "+(outstanding));
		System.out.println("                  Emi   :"+(outstanding/month)+"rs");
	}
}
