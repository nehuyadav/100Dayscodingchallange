import java.util.Scanner;
class calculator{
 public static void main(String args[]){
System.out.println("enter your choice");
 System.out.println("1. for +");
System.out.println("2. for -");
System.out.println("3. for /");
System.out.println("4. for *");
Scanner sc=new Scanner(System.in);
int ch=sc.nextInt();
int a=sc.nextInt();
int b=sc.nextInt();
switch(ch)
{
   case 1:System.out.println("the addition of a and b:"+(a+b));
    break;
case 2:System.out.println("the subtraction of a and b:"+(a-b));
    break;
case 3:System.out.println("the multiplication of a and b:"+(a*b));
    break;
case 4:System.out.println("the division of a and b:"+(a/b));
    break;
default:System.out.println("invalid input");
}
}
}
