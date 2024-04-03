import java.util.Scanner;

class Remove 
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        
      
        System.out.print("Enter a string: ");
        String input = s.nextLine();
        
     
        String result = removeNonAlphabets(input);
        
     
        System.out.println("String after removing non-alphabetic characters: " + result);
    }
    public static String removeNonAlphabets(String input) 
    {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) 
        {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) 
            {
                result.append(ch);
            }
        }
        return result.toString();
    }
}