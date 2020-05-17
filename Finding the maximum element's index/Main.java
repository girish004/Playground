import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n=in.nextInt(),max=-1,maxind=-1;
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=in.nextInt();
    }
    for(int i=0;i<n;i++){
      if(a[i]>max){max=a[i];maxind=i;}
    }
    System.out.print(maxind);
      
  }
}