import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int ind=0;
      int a[]=new int[n];
      int b[]=new int[n];
      for(int i=0;i<n;i++){
        a[i]=in.nextInt();
      }
      for(int i=0;i<n;i++){
        //System.out.print(a[i]+' ');
        if(a[i]!=0){b[ind]=a[i];ind++;}
      }
      for(int i=0;i<n;i++){
        a[i]=b[i];
        System.out.print(b[i]+" ");
      }
        
    }
}