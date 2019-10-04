import java.util.Scanner;
public class assignment3_4
{
 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     String a;
     System.out.println("what character do you want your bar made off?");
        a=sc.next();
     System.out.println("how long do you want your bar?");
    
        for(int b=sc.nextInt();b>0;b--){
         System.out.print(a);   
        }
    }
   
}
