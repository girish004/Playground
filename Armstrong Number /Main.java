import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a,b=0,c,sum=0;
      a=n;
      while(a!=0)
      {
        a=a/10;
        b++;
      }a=n;
      while(n!=0)
      {
        c=n%10;n=n/10;
        int d=c;
        for(int i=1;i<b;i++){c=c*d;}
        sum=sum+c;
      }
      if(sum==a){System.out.print("Armstrong Number");}
      else{System.out.print("Not a Armstrong Number");}
      
	}
}