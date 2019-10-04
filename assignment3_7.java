import java.util.Scanner;
public class assignment3_7
{
 public static void main (String[] args){
     String s="yes";
     int n=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("let's play a guessing game!");
      int a=(int)((Math.random()*100)+1);
        int v= sc.nextInt();
        while(v!=a&&s.equals("yes")){
            if(v>a){
                System.out.println("it's too high!");}
                if(v<a){
                 System.out.println("it's too low!");   
                }
            s="no";
            n=n+1;
            System.out.println("guess again");
            v=sc.nextInt();
            s="yes";
        }
        System.out.println("You are right! it only took you "+n+" tries");
    }
}
