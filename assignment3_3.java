import java.util.Scanner;
public class assignment3_3
{
  public static void main(String[] args){
      int b=0;
    Scanner sc=new Scanner(System.in);
 System.out.println("let's add some number!");
 int a=sc.nextInt();
 b=b+a;
   while(a>=0){
     System.out.println("let's add some number!");
    a=sc.nextInt();
    b=b+a;
   } b=b-a;
     System.out.println("the sum is"+b);
  
    } 
}
