import java.util.Scanner;
class Main{
  public static int sum(int a)
  {
    int sum=0;
    for(int i=a;i>0;i--)
    {
      sum=sum+i;
    }
    return sum;
  }
	public static void main (String[] args){
	   
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a=sum(n);
      System.out.print(a);
    }
}
