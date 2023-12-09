import java.util.Scanner;
public class rotate_array_ntime{
public static void main(String[]args){
int i,j,k,n,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
int size=sc.nextInt();
int a[]=new int[size];
System.out.println("enter the element of array");
for(i=0;i<size;i++)
    a[i]=sc.nextInt();
System.out.println("enter the number t for array rotate in t times:");
int t=sc.nextInt();
for(n=0;n<t;n++)
{
   temp=a[size-1];
   for(j=size-1;j>0;j--)
   {
    a[j]=a[j-1];
   }
   a[0]=temp;
}
System.out.println("rotate array :");
for(k=0;k<size;k++)
    System.out.println(a[k]);  
}}
