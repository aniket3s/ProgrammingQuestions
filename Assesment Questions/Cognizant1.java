import java.util.*;
class Cognizant1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String str = "B...BB..B.B..B";
		int op = solve(str);
		System.out.println(op);
	}

	public static int solve(String str)
	{
		String [] arr = str.split("\\.+");
		
		Set<String> set = new LinkedHashSet<String>();
		for (String ele : arr)
		{
			set.add(ele);
		}
		System.out.print(set);
		return (set.size());
	}
}
