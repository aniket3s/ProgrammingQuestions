import java.util.*;
class Stone 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rNum = 0;
		for( ; ;)
		{
			int num = (int)(Math.random()*10); // generating the random number 
			if(num>=1&&num<=3) // getting the number which is in the range of 1 to 3 
			{
				rNum = num;
				break;
			}
		}
		String codeOpt = null;
		if(rNum ==1)
		{
			codeOpt = "1.STONE";
		}
		else if(rNum==2)
        {
			codeOpt = "2.PAPER";
        }
		else if(rNum==3)
		{
			codeOpt = "3.SCISSOR";
		}
		System.out.println();
		System.out.println("   WELCOME			");
		System.out.println(" 1.Stone \n 2.Paper \n 3.Scissor  ");
		System.out.println("Enter the option : ");
		int opt = sc.nextInt();
		String userOpt = null;
		if(opt==1)
		{
			userOpt = "1.STONE";
		}
		else if(opt==2)
		{
			userOpt = "2.PAPER";
		}
		else if(opt==3)
		{
			userOpt = "3.Scissor";
		}
		else
		{
			System.out.println("Inavalid Input ");
			return ;
		}
		System.out.println("User : "+userOpt+"\n"+"Bot : "+codeOpt);
		if((opt ==1 && rNum ==3)||(opt==2&&rNum==1)||(opt==3&&rNum==1))
		{
			System.out.println("USER WINS ");
		}
		else if ((opt==1&&rNum==2)||(opt==2&&rNum==3)||(opt==3&&rNum==1))
		{
			System.out.println("BOT WINS");
		}
		else
		{
			System.out.println("DRAW");
		}
	}
}
