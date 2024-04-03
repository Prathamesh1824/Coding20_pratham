import java.util.Scanner;
class RotateArrayLeftK 
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
        System.out.print("Enter the value of K: ");
        int k = s.nextInt();
        rotateLeftK(array, k);
        System.out.println("Array after rotating left by " + k + " positions:");
        for (int num : array) 
        {
            System.out.print(num + " ");
        }
    }
    
   
    public static void rotateLeftK(int[] array, int k) 
    {
  
        k = k % array.length;
        reverseArray(array, 0, k - 1);
        
      
        reverseArray(array, k, array.length - 1);
        
        
        reverseArray(array, 0, array.length - 1);
    }
    
  
    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) 
        {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}