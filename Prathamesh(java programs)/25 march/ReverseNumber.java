import java.util.*;
 class ReverseNumber   
{  
public static void main(String[] args)   
{  
int number,reverse = 0;  
System.out.println("Enter a number:");
Scanner sc=new Scanner(System.in);
number=sc.nextInt();

while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  