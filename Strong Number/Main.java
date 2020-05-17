import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt(),sum=0,s1=1;
      int a=n,b=0,c=1;
      while(a!=0)
      {
        a=a/10;
        b++;
      }a=n;
      while(n!=0)
      {
        c=n%10;
        s1=1;
		for(int j=c;j>0;j--)
        {
          s1=s1*j;
        }
        sum=sum+s1;
        n=n/10;
      }
      if(sum==a){System.out.print("Yes");}
      else{System.out.print("No");}
	}
}