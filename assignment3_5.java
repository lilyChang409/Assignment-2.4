import java.util.Scanner;
public class assignment3_5
{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("what character do you want your triangle made of?");
      String a=sc.next();
      System.out.println("how tall do you want your triangle?");
      int b=sc.nextInt();
      for (int i=0; i<b;i++){
          for (int j=0;j<=i;j++){
              System.out.print(a);
            }
        System.out.println("");}
    }
}
