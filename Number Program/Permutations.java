// count the all permutations and write the all permutaions 
class Permutations 
{
	public static void main(String[] args) 
	{
		String str = "123";
		int len = str.length();
		System.out.println(permutations(len));
	}

	public static int permutations(int len)
	{
		int cnt = 1;
		for (int i=len;i>0 ;i-- )
		{
			cnt*=i;
		}
		return cnt;
	}
}
