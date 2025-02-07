/*write a program that that reads in the radius and length
of a cylinder and computes the area and volume using the 
following formnulas 

area = 3.14 *radius*radius
volume = area * height
*/

import java.util.Scanner;
class Cylinder	
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		final float pi = 22/7f;

		System.out.println("Enter the radius");
		float radius = sc.nextFloat();

		System.out.println("Enter the height");
		float height = sc.nextFloat();
		
		float area = pi*radius*radius;
		float volume = area*height;

		System.out.println("area of cylinder is : "+area);
		System.out.println("Volume of cylinder is : "+volume );
	}
}
