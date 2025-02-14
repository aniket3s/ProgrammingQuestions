import java.util.Scanner;
class Sqrt3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;

		for(int i= 1; i< num;i++)
		{
			if(i*i == num)
			{
				System.out.println(+num +" is perfect square number of "+i);
				flag = true;
				break;
			}
			
		}
		if(!flag )
		{
			System.out.println("Number is not a perfect Square ");
		}
	}
}
