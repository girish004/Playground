import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      StringBuilder s1=new StringBuilder("");
      String s2=in.nextLine();
      s1.append(s2.toLowerCase());
      int count=0;
      for(int i=0;i<s2.length();i++){
        int k=s2.charAt(i);
      //for(int i=65;i<65+26;i++){
        for(int j=0;j<s1.length();j++){
          if(s1.charAt(j)==k || s1.charAt(j)==k+32){
            s1.setCharAt(j,'0');
            count++;
          }
        }
        if(count!=0){
          if(k>=65 && k<=90){k=k+32;}
          System.out.print((char)(k));
          System.out.print(count+" ");
          count=0;}
      }
        
      
    }
}