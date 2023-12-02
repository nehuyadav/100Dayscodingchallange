import java.util.Scanner;
class array{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
System.out.println("enter the size of array");
int numbers[]=new int[size];
System.out.println("enter the elements of array ");
for(int i=0;i<size;i++){
numbers[i]=sc.nextInt();
}
System.out.println("enter the element you want to find");
int x=sc.nextInt();
for(int i=0;i<numbers.length;i++){
if(x==numbers[i])
System.out.println("x found at index:"+i);
}
}}