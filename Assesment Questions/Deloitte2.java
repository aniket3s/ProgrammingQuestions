import java.util.Scanner;
class Deloitte2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Students : ");
		int stu = sc.nextInt();
		System.out.println("Enter the count : ");
		int count = sc.nextInt();
		int countEnd = (count%stu)+1;
		System.out.println("Count End at : "+countEnd);
	}
}
