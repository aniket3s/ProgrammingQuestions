import java.util.Scanner;
class If 
{
	public static void main(String[] args) 
	{
		Scanner sd = new Scanner(System.in);
		System.out.println("Are you a Incubation Student ? ");

		boolean ip = sd.nextBoolean();

		if(ip)
		{
			System.out.println("Pay the fees : ");
		}
		System.out.println("Attend the classes : ");
	}
}
