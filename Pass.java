/*
100-75 A
60-65 B
35-60 c
<35 fail
*/
import java.util.Scanner;
class  Pass
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks ");
		int marks = sc.nextInt();

		double percentage = ((marks*100/600));
		String str = (percentage >=75) ? "Grade A":
			         (percentage >=60)? "Grade B":
					 (percentage >= 35)?"Grade C":
					 "Failed";
		System.out.println(str);
	}
}
