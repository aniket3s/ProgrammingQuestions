import java.util.Scanner;
class Circle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		final float pi = 22/7f;
		final float radius = 5.5f;

		float area = pi*(radius * radius);
		float perimeter = 2*pi*radius;

		System.out.println("Area of Circle : "+ area +"Cm^2");
		System.out.println("Perimeter of circle is : "+perimeter + "Cm^2");
	}
}
