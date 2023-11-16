import java.util.Scanner;
class printrangeprime{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

for(int i=7;i<17;i++)
{
int flag=0;
for(int j=2;j<i/2;j++)
{

    if(j%i==0)
      flag++;
    
    if(flag==0)
    System.out.println(j);

}}} }