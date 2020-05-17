import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt(),a=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n-i;j++)
        {
          System.out.print(" ");
        }
        for(int k=1;k<=a;k++)
        {
          System.out.print("*");
        }a=a+2;
        System.out.print("\n");
      }
        
	}
}