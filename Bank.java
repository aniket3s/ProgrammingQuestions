import java.util.Scanner;
class Bank 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String username1 = null;
		String password1 = null;
		double balance = 0.0;
		for( ; ;)
		{
			System.out.println();
			System.out.println();
			System.out.println("-------------WELCOME TO BANK -----------");
			System.out.println("1. login        : (Already registered user) ");
			System.out.println("2. Registration :(new user ) ");
			System.out.println("Enter the option : ");
			int opt = sc.nextInt();

			if(opt == 1)
			{
				if(username1 == null)
				{
					System.out.println("create account first : ");
					continue;
				}
				for(;;)
				{
				System.out.println("   LOGIN PAGE  ");
				 for(int i=3; i>=1;i--)
					{
					System.out.println("Enter the username : ");
					String username2 = sc.next();
					System.out.println("Enter the password : ");
					String password2 = sc.next();
					if(username2.equals(username1) && password2.equals(password1))
					 {
						System.out.println(" *you are logged in successfully * \n");
						System.out.println();
						System.out.println("1. Deposit Money ");
						System.out.println("2. Check Balance ");
						System.out.println("3. Withdraw money ");
						System.out.println("Enter the option : ");
						int option2 = sc.nextInt();
						switch(option2)
						{
						    case 1:
							{
								System.out.println("Enter the amount : ");
								double amount = sc.nextDouble();
								balance += amount;
								System.out.println("Available balance is : "+balance);
								continue;
							}
							case 2:
							{
								sc.nextLine();
								System.out.println("Enter the password : ");
								String password3 = sc.next();
								if(password3.equals(password1))
								{
									System.out.println("your account balance is "+balance);
								}
								else
								{
									System.out.println("Wrong Password : ");
								}
								continue;
							}
							case 3:
							{
								System.out.println("Enter the password : ");
								sc.nextLine();
								String password3 = sc.nextLine();
								if(password3.equals(password1))
								{
									System.out.println("Enter the amount : ");
									double amount = sc.nextDouble();
									balance -= amount ;
									System.out.println("Balance : "+balance);
								}
								continue;
							}
						}
						System.out.println("Thank You Visit Again " );
						// System.exit(0);
						}
					
						System.out.println("Wrong Credntials try again "+(i-1)+"times ");
					}
					System.out.println("Thank You visit again !!");
				}
					
			}

		}
	}
}
