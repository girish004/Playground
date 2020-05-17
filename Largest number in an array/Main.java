import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt(),max=0;
      int a[]=new int[n];
      for(int i=0;i<n;i++){
      	a[i]=in.nextInt();
        if(a[i]>max){max=a[i];}
      }
      System.out.print(max);
      
    }
}