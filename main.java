import java.util.Scanner;
import java.applet.*;
//To predict The Number of subscribers of Youtube 
public class main{
public static void main(String args[]){ 
//a=current subs
//r=rate of growth 
//x=time duration 
//y=a(1+r)^x
System.out.println("Enter current no. of subs:"); 
Scanner scan=new Scanner(System.in); 
int a=scan.nextInt();
System.out.println("Enter rate of growth"); 
double r=scan.nextDouble();
System.out.println("Time interval:"); 
int x=scan.nextInt();
System.out.println("Expected Subs after time duration:"); 
System.out.println(calculateSubs(a,r,x));
}
public static int calculateSubs(int a,double r,int x){ 
return (int) (a*Math.pow((1+r),x));
} 
}