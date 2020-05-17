import java.util.Scanner;
class Main{
  public static void num(int a)
  {
    int flag=0;
    for(int i=3;i<=a;i++)
    {
      for(int j=i-1;j>1;j--)
      {
        if(i%j==0){flag=0;break;}
        else{flag=1;}
      }if(flag==1){System.out.println(i);}
    }
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a=2;
      System.out.println(a);
      num(n);
      
	}
}