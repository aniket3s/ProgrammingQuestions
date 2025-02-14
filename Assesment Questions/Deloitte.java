/*
we have given the no of students and count 
tell the student number where count is end 
*/
import java.util.Scanner;
class Deloitte 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No.of Students : ");
		int stu = sc.nextInt();
		System.out.println("Enter Count : ");
		int count = sc.nextInt();
		int countEnd = (count%stu==0)?(countEnd=stu%count):((count%stu!=0)?(countEnd=count%stu):(9));
		System.out.println(countEnd);
	}
}
