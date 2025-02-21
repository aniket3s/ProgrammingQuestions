import java.util.Scanner;
class isDecreasing 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int dup = num;
		int max = Integer.MIN_VALUE;
		boolean flag = true;
		
		while (num>0)
		{
			int rem = num%10;
			if (rem>max){
				max = rem;
			}else{
				flag = false;
			}
			num/=10;
		}
		if(flag) System.out.println(dup+" is a decreasing number");
		else System.out.println(dup + " is not a decreasing number.");
	}
}
