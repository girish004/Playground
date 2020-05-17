import java.util.Scanner;
class Main {
  public static int factorial(int n){
    if(n==0){return 0;}
    return n+factorial(n-1);
    //System.out.print(n*factorial(n-1));
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n=in.nextInt();
    System.out.print(factorial(n));
  }
}