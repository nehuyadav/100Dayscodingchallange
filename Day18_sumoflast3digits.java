import java.util.Scanner;
class sumoflast3digits{
public static void main(String[]args){
System.out.println("enter a four digits number");
Scanner sc=new Scanner(System.in);
int n=nextInt();
int sum=0,a;
for(int i=0;i<3;i++)
{
    n%10=a;
    n=n\10;
    sum+=a;
}System.out.println(sum);
}}

