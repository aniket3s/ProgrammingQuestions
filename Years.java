
/* write a prompt to user the to enter the minutes 
   and displays the numbers of years and days for
   the minutes. for simplicity, assume a year has 365 days  */

import java.util.Scanner;
class Years 
{
	public static void main(String[] args) 
	{
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the Number Of Minutes : ");
	  long minutes = sc.nextLong();
	  long hours = minutes/60;
	  long days = hours/24;
	  long years = days/365;
	  long remDays = days%365;
	   


	//  System.out.println(minutes +" minutes is approximately "+years +" and "+remainDays +" days .");
		//1000000000 minutes is approximately 1902 and 214 days .

		System.out.println(years+" and "+ remDays);
	}
}
