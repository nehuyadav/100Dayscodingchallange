import java.util.Scanner;
class factorial{
 public static void main(String[]args){
System.out.println("enter a number which factorial want"); 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
   fact*=i;
}
System.out.println(fact);
}}