import java.util.Scanner;
public class assignment3_6
{
     public static void main (String[] args){
         String y="yes";
         String x="yes";
         int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("how many D6 do you want to roll?");
    int b=sc.nextInt();
    while((y.equals("yes"))&&b<11){
    for( i=0;i<b;i++){
    int a=(int)((Math.random()*6)+1);
    System.out.print(+a+" ");
    } y="no";
    System.out.println("");
System.out.println("how many D6 do you want to roll?");
     b=sc.nextInt();
    y="yes";
}
 System.out.println("Try again? [yes, no]");
String c=sc.next();
while(c.equals("yes")&&x.equals("yes")){
       System.out.println("how many D6 do you want to roll?");
    b=sc.nextInt();
      while((y.equals("yes"))&&b<11){
    for( i=0;i<b;i++){
    int a=(int)((Math.random()*6)+1);
    System.out.print(+a+" ");
    
    } y="no";
    System.out.println("");
System.out.println("how many D6 do you want to roll?");
     b=sc.nextInt();
    y="yes";
}c="no";
System.out.println("Try again? [yes, no]");
 c=sc.next();
     }
System.out.println("ByeBye");
    

    

}}


    

