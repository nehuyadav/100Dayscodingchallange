import java.util.Scanner;
class swap{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter two values");
int a=sc.nextInt();
int b=sc.nextInt();
int c=0;
System.out.println("before swapping the values of first & second are:");
System.out.println(""+a);
System.out.println(""+b);
a=b;
c=a;
b=c;
System.out.println("after swapping the values of first & second are:");
System.out.println(""+a);
System.out.println(""+b);
}}