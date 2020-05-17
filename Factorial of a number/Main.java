import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt(),fact=1;
      for(int i=n;i>0;i--)
      {
        fact=fact*i;
      }
      System.out.print(fact);
	}
}