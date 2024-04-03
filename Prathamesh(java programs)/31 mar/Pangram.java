import java.util.*;

class Pangram
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = s.nextLine();
        boolean isPangram = checkPangram(str);
        if (isPangram) 
        {
            System.out.println("The string is a pangram.");
        } 
        else 
        {
            System.out.println("The string is not a pangram.");
        }
    }
    
    public static boolean checkPangram(String str) 
    {
        Set<Character> set = new HashSet<>();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') 
            {
                set.add(ch);
            }
        }
        return set.size() == 26;
    }
}