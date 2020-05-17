import java.util.Scanner;
class Main{
   public static int num(int base,int exp){
     int ans=1;
      for(int i=1;i<=exp;i++){
         ans=ans*base;
         }
         return ans;
      }
   public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      int base=in.nextInt();
      int exp=in.nextInt();
      int ans;
      ans=num(base,exp);
      System.out.print(ans);
      }
 }