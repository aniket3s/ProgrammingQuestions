import java.util.Scanner;
class CountFreqDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		for (int i = 0; i<=9 ;i++ )
		{
			int cnt = 0;

			 for (int j = num;j>0 ;j/=10 )
			 {
				 int rem = j%10;
				 if (i==rem)
				 {
					 cnt++;
				 }
			 }
			 if (cnt != 0)
			 {
				 System.out.println(i+ " : "+cnt);
			 }
		}
	}
}
