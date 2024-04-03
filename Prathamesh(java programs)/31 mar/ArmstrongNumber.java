import java.util.Scanner;

class ArmstrongNumber 
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        boolean isArmstrong = checkArmstrong(number);
        
        if (isArmstrong) 
        {
            System.out.println(number + " is an Armstrong number.");
        } 
        else 
        {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    public static boolean checkArmstrong(int number) 
    {
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();
        
        while (number != 0) 
        {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number /= 10;
        }
        
        return result == originalNumber;
    }
}