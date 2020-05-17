import java.util.Scanner;
public class Main{
    public static int gcd(int n1,int n2){
      int min=0;
      if(n1>n2){min=n2;}
      else{min=n1;}
      while(true){
        if(n1%min==0 && n2%min==0){
          return min;
        }
        else{min--;}
      }
    }
 
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int ans=gcd(n1,n2);
      ans=gcd(ans,n3);
      System.out.print(ans);
	}
}