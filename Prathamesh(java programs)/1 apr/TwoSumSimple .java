import java.util.Scanner;

class TwoSumSimple 
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }
        System.out.print("Enter the target sum: ");
        int target = s.nextInt();
        int[] indices = findTwoSumIndices(array, target);
        
        if (indices != null) 
        {
            System.out.println("Indices of two elements whose sum is equal to " + target + ": " + indices[0] + ", " + indices[1]);
        } 
        else
        {
            System.out.println("No two elements in the array have a sum equal to " + target + ".");
        }
    }
   public static int[] findTwoSumIndices(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        
        while (left < right) 
        {
            int sum = array[left] + array[right];
            if (sum == target) 
            {
                return new int[] { left, right };
            } else if (sum < target) 
            {
                left++;
            } 
            else 
            {
                right--;
            }
        }
        
        return null;
    }
}