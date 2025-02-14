import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter number 1 : ");
		float num1 = sc.nextInt();
		System.out.println("Enter Number 2 : ");
		float num2 = sc.nextInt();
		
		System.out.println("enter the operator : ");
		char op = sc.next().charAt(0);

		float opt = 
			(op=='+') ? num1+num2:
			(op=='-') ? num1-num2:
			(op=='*') ? num1*num2:
			(op=='/') ? num1/num2:
			(op=='%') ? num1%num2:0.000001f;
		 
/* if(opt == 0.000001f)
		{
			System.out.println("INVALID OPRATOR");
		}
		else
		{
			System.out.println(opt);
		}
	*/	
	if(!(opt == 0.000001f))
		{
			System.out.println(num1+" "+"num2"+op+" = "+opt);
		}
	}
}
