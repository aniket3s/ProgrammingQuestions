import java.util.Scanner;
class ConvEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;

		for(int i= num;i>0; i/= 10)
		{
			int rem = i%10;
			cnt++;
		}
//--------if length is even convert to even digits----------------

		if(cnt%2 == 0)
		{
			
			int rev = 0;
			while(num>0)
			{
				int rem = num%10;
				if(rem%2 !=0 && rem <9)
				{
					rem+=1;
				}
				if(rem == 9)
				{
					rem -= 1;
				}
				rev = rev*10+rem;
				num/=10;
			}
			int evenNum = 0;
			while(rev>0)
			{
				int rem = rev%10;
				evenNum = evenNum*10 + rem;
				rev /= 10;
			}
			System.out.print(evenNum);
		}

//-----------------if length is odd convert to odd digits----------------------

		if(cnt%2 != 0)
		{
			int revOdd = 0;
			while (num>0)
			{
				int rem = num%10;
				if(rem%2 == 0)
				{
					rem+=1;
				}
				revOdd = revOdd*10 + rem;
				num /= 10;
			}
			int OddNum = 0;
			while(revOdd>0)
			{
				int rem = revOdd%10;
				OddNum = OddNum*10 + rem;
				revOdd /= 10;
			}
			System.out.println(OddNum);
		}
	}
}
