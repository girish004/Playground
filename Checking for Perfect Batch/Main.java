import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n=in.nextInt(),it=0;
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=in.nextInt();
    }int sum=a[0]+a[1]+a[2],sum1=0,flag=0;
    for(int i=3;i<n;i++){
      it++;
      sum1=sum1+a[i];
      if(it==3){
        it=0;
        if(sum==sum1){
          flag=1;sum1=0;
        }
        else{flag=0;break;}
      }
    }
      if(flag==1){System.out.print("Perfect Batch");}
      else{System.out.print("Not a Perfect Batch");} 
  }
}