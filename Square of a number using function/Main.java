import java.util.Scanner;
class Main
{
  public static int sqr(int a)
  {
    a=a*a;
    return a;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int b=sqr(n);
      System.out.print(b);
    } 
}