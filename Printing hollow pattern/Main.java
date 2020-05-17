import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
        int n=in.nextInt();
      for(int i=1;i<=n;i++)
        System.out.print("*");
      System.out.print("\n");
      for(int j=1;j<=n-2;j++){
      for(int i=1;i<=n;i++)
      { if(i==1 || i==n)
          System.out.print("*");
        else
          System.out.print(" ");
      }System.out.print("\n");}
      for(int i=1;i<=n;i++)
        System.out.print("*");
    }
}