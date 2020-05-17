import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String s1=in.nextLine();
    String s2=in.nextLine();
    int len1=s1.length();
    int len2=s2.length(),count=0;
    for(int i=0;i<s1.length()-len2+1;i++){
      for(int j=0;j<len2;j++)
      {
        if(s1.charAt(i+j)!=s2.charAt(j)){
          break;}
        if(j==len2-1){count++;}
      }
    }
    System.out.print(count);
    //System.out.print(s1.substring(0,len2+1)+s2);
      
  } 
}