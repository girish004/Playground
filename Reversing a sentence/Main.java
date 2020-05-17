import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String s1=in.nextLine();
      int len=s1.length(),counter=len;
      for(int i=len-1;i>=0;i--){
        if(s1.charAt(i)==' '){
          System.out.print(s1.substring(i+1,counter)+" ");
          counter=i;}
      }
      for(int i=0;i<len;i++){
        if(s1.charAt(i)==' '){
          System.out.print(s1.substring(0,i));break;}
      }
    }
    // Function to reverse a string
    //public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    // {
        // Type your code here
    // }
}