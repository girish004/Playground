import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      StringBuilder s1=new StringBuilder(in.nextLine());
      StringBuilder s2=new StringBuilder(in.nextLine());
      s1.append(s1);
      if(s1.toString().contains(s2)){System.out.print("Yes");}
      else{System.out.print("No");}
       
    }
}