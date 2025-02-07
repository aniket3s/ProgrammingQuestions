import java.util.Scanner;
class Bmi 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float weight = sc.nextFloat();
		float weightPound = weight*0.45359237f;
		float height = sc.nextFloat();
		float heightInch = height*0.0254f;
		float bmi = weightPound/(heightInch*heightInch);
       
	   System.out.println(bmi);
	}
}
