import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String s=in.nextLine(),temp="";int a=0;
      for(int i=s.length()-1;i>=0;i--){
        temp=temp+s.charAt(i);
      }
      if(s.equals(temp)){
        System.out.print("Yes");
      }
      else{System.out.print("No");}
    } 
}