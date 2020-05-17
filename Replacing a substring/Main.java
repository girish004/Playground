import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String rep = in.nextLine();
      String inc = in.nextLine();
      //str.replace(rep,inc);
      System.out.print(str.replace(rep,inc));
    }
}