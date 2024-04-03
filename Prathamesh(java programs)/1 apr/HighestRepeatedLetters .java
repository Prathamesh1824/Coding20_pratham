import java.util.*;

public class HighestRepeatedLetters 
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = s.nextLine();
        String result = findWordWithHighestRepeatedLetters(input);

        if (result.equals("")) 
        {
            System.out.println("No word with repeated letters found.");
        } 
        else 
        {
            System.out.println("Word with the highest number of repeated letters: " + result);
        }
    }
  public static String findWordWithHighestRepeatedLetters(String input) 
  {
        String[] words = input.split("\\s+");
        String result = "";
        int maxRepeatedLetters = 0;
        
        for (String word : words) {
            Map<Character, Integer> countMap = new HashMap<>();
            int maxCount = 0;
            
            for (char ch : word.toCharArray()) 
            {
                countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
                maxCount = Math.max(maxCount, countMap.get(ch));
            }
            
            if (maxCount > 1 && maxCount > maxRepeatedLetters) {
                result = word;
                maxRepeatedLetters = maxCount;
            }
        }
        
        return result;
    }
}