/*write a program to display the population of each of the next five years ,
Assume the currrent population is 312032486 and one year has 365 days.

one birth every 7 seconds 
one death every 13 seconds 
one new immigrant every 45 seconds
*/

class  Census
{
	public static void main(String[] args) 
	{
		long curPopulation = 312032486;
	// finding the seconds in 5 years 
		long seconds = (365*24*60*60)*5;
		long birth = seconds/7;
		long death = seconds/13;
		long immigrant = seconds/45;

		long newPopulation = curPopulation + birth - death + immigrant ;

		System.out.println("Current population: "+curPopulation);
		System.out.println("New Population : "+newPopulation );
	}
}
