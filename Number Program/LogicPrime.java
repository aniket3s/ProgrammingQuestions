import java.util.Scanner;
class LogicPrime
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int den = 2;
    
        while(den <= num)
        {
            if(num%den == 0)
            {
                break;
            }
            den ++;
        }
        if (num == den ) System.out.println(num+" : is prime  number");
        else System.out.println(num+" : is not prime number ");
    }
}
