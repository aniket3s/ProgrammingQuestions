import java.util.Scanner;
class Election 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int bjp = 0, cng = 0, ss = 0, aap = 0, mns = 0, nota = 0;
		System.out.println();
		System.out.println(            "WELCOME");
		System.out.println();
		System.out.println("Enter the population : ");
		int population = sc.nextInt();

		for(int i =0 ;i< population;i++)
		{
			System.out.println();
			System.out.println("**********List of parties ********");
			System.out.println("1. BJP");
			System.out.println("2. Congreess ");
			System.out.println("3. SHIVSENA");
			System.out.println("4. AAP");
			System.out.println("5. MNS");
			System.out.println("6. Nota");
			System.out.println();

			System.out.println("Enter the option : ");
			int opt = sc.nextInt();
				if(opt == 1)
				{
					bjp++;
			 	}
				if(opt==2)
				{
					cng++;
				}
				if(opt==3)
				{
					ss++;
				}
				if(opt==4)
				{
					aap++;
				}
				if(opt==5)
				{
					mns++;
				}
				if(opt==6)
				{
					nota++;
				}
				
			
			if(opt < 1 || opt > 6)
				{
					i--;
					System.out.println("Invalid vote/option");
				}
		}
			if( bjp>=cng && bjp >=ss&& bjp >= aap && bjp >= mns && bjp >= nota)
			{
				System.out.println("BJP WON THE ELECTION  : Acche Din Aayenge ");
				return;
			}
			if(cng >= bjp && cng>=ss && cng >= aap && cng >= mns && cng >= nota)
			{
				System.out.println("CNG WON THE ELECTION by "+population-x+" Mera Bharat Mahan");
				return;
			}
			if(ss >= bjp && ss>=cng && ss >= aap && ss >= mns && ss >= nota)
			{
				System.out.println("SS WON THE ELECTION : Shivsena Shivsensa");
				return;
			}
			if(aap >= bjp && aap>=cng && aap >=ss && aap >= mns && aap>= nota)
			{
				System.out.println("AAP WON THE ELECTION : Aam Asdami Party");
				return;
			}
			if(mns >= bjp && mns>=cng && mns >= aap && mns >= ss && mns >= nota)
			{
				System.out.println("MNS WON THE ELECTION : Marathi aani Maharashtra");
				return;
			}
			if(nota >= bjp && nota>=cng && nota >= aap && nota >= mns && nota >= ss)
			{
				System.out.println("NOTA WON THE ELECTION : find the APAKSHAS");
				return;
			}


		
	}
}