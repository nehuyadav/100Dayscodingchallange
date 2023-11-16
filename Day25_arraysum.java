import java.util.Scanner;
class arraysum{
public static void main(String[]args){
int sum=0,i;
int []arr=new int[5];
arr[0]=2,arr[1]=3,arr[2]=4,arr[3]=5,arr[4]=6;
for(i=0;i<arr.length;i++)
{
    sum+=arr[i];
}
    System.out.println("sum:"+sum);
}}