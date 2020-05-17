import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in= new Scanner(System.in);
      int a=in.nextInt();
      for(int i=1,j=1;j<=a;i=i+2,j=j+1)
      {
        System.out.println(i);
      }
	}
}