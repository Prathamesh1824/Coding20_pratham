import java.util.*;

class Anagram
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        
      
        System.out.print("Enter the first string: ");
        String str1 = s.nextLine();
        
      
        System.out.print("Enter the second string: ");
        String str2 = s.nextLine();
        boolean isAnagram = checkAnagram(str1, str2);
        
        
        if (isAnagram) 
        {
            System.out.println("The strings are anagrams.");
        } 
        else 
        {
            System.out.println("The strings are not anagrams.");
        }
    }
    
  
    public static boolean checkAnagram(String str1, String str2) 
    {
      
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
       
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}