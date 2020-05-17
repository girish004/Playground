import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int a=n-2;
      for(int i=1;i<=n/2;i++)
      {
        for(int j=1;j<=i-1;j++)
          System.out.print(" ");
        System.out.print("*");
        for(int j=1;j<=a;j++)
          System.out.print(" ");
        a=a-2;
        System.out.print("*"+"\n");
      }
      for(int i=1;i<=n/2;i++)
        System.out.print(" ");
      System.out.print("*"+"\n");
      a=1;
      for(int i=1;i<=n/2;i++)
      {
        for(int j=n/2;j>i;j--)
          System.out.print(" ");
        System.out.print("*");
        for(int j=1;j<=a;j++)
          System.out.print(" ");
        System.out.print("*"+"\n");
        a=a+2;
        
      }
      
        
	}
}