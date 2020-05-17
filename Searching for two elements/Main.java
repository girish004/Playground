import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt(),i1=n,i2=n;
      int a[]=new int[n+1];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int n1=in.nextInt();
      int n2=in.nextInt();
      for(int i=0;i<n;i++){
        if(a[i]==n1){i1=i;}
        if(a[i]==n2){i2=i;}
      }
      if(i1!=n){System.out.println(i1);}
      else{System.out.println(-1);}
      if(i2!=n){System.out.println(i2);}
      else{System.out.println(-1);}
                
        
    }
}