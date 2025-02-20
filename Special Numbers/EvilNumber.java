import java.util.Scanner;
class EvilNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int dup = num;
		String bin = "";

		for (int i=num;i>0 ;i/=2 )
		{
			int rem = i%2;
			bin = rem + bin;
		}
		int cnt = 0;
		int i =0;
		while (i<bin.length())
		{
			if (bin.charAt(i)=='1')
				cnt++;

			i++;
		}
		System.out.println(cnt%2==0 ? dup+" is a Evil Number.":dup +" is not a Evil Number.");
	}
}
