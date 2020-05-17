import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in = new Scanner(System.in);
    int n=in.nextInt(),temp=0;
    int a[]=new int[n+1];
    int odd[]=new int[n+1],o=0;
    int even[]=new int[n+1],e=0;
    for(int i=0;i<n;i++){
      a[i]=in.nextInt();
      if(i%2==0){odd[o++]=a[i];}
      if(i%2!=0){even[e++]=a[i];}
    }int rot=in.nextInt();
    for(int i=1;i<=rot;i++){
      temp=odd[o-1];
      for(int j=o-1;j>0;j--){
        odd[j]=odd[j-1];
      }odd[0]=temp;
      temp=even[0];
      for(int j=0;j<e-1;j++){
        even[j]=even[j+1];
      }even[e-1]=temp;
    }e=0;o=0;
    for(int i=0;i<n;i++){
      if(i%2==0){System.out.print(odd[o++]+" ");}
      if(i%2!=0){System.out.print(even[e++]+" ");}
    }
    
  	}
}