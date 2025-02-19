import java.util.Scanner;
class FascinatingNumber2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int temp = num;
		for (int i=2;i<=3 ;i++ )
		{
			num = (num*1000)+(temp*i) ;
		}
		System.out.println(num);
		System.out.println(temp);
	}
}
