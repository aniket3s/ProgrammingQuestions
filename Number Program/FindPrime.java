import java.util.Scanner;
import java.util.ArrayList;
class FindPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		for(int i =1;i<number/2;i++)
		{
			if(number%i == 0)
			{
				count++;
			}
		}
		if(count<2)
		{
			list.add(number);
		}
		System.out.println(list);
	}
}
