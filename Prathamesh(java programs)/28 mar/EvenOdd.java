class EvenOdd{
  public static void main (String[] args)
  {
     int arr[] = {10, 1, 20, 63, 51, 65, 40, 84};
     int n = arr.length;
     int countEven = 0, countOdd = 0;

     for(int i=0; i<n; i++){
         if((arr[i] % 2 )== 0)
           countEven += 1;

         else
           countOdd += 1;
     }
     System.out.println("Even Elements count : "+ countEven);
     System.out.println("Odd Elements count : "+ countOdd);
  }
}