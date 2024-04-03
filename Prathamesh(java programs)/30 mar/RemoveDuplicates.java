import java.util.*;

class RemoveDuplicates
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) 
        {
            array[i] = s.nextInt();
        }
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new LinkedHashSet<>(); 
        for (int num : array) {
            set.add(num);
        }
        int[] uniqueArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueArray[index++] = num;
        }
        return uniqueArray;
    }
}