import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      StringBuilder s1=new StringBuilder("");
      s1.append(in.nextLine());
      for(int i=65;i<65+26;i++)
        for(int j=0;j<s1.length();j++){
          if(s1.charAt(j)==i || s1.charAt(j)==i+32){
            break;
          }
          if(s1.charAt(j)!=i && s1.charAt(j)!=i+32 && j==s1.length()-1){
            System.out.print((char)(i+32)+" ");
          }
        }
      
    }
}