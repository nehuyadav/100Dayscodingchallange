import java.util.Scanner;
public class left_rotate_array{
public static void main(String[]args){
int i,j,k,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
int size=sc.nextInt();
int a[]=new int[size];
System.out.println("enter the element of array");
for(i=0;i<size;i++)
    a[i]=sc.nextInt();
temp=a[0];
for(j=0;j<size-1;j++)
    a[j]=a[j+1];
a[size-1]=temp;
System.out.println(" rotate array in left :");
for(k=0;k<size;k++){
    System.out.println(a[k]);  
}
}}
