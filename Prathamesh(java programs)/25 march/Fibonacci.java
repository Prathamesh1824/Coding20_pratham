import java.util.*;
class Fibonacci {
  public static void main(String[] args) {

    int n, firstTerm = 0, secondTerm = 1;
    System.out.println("Enter a value of n:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
  }
}