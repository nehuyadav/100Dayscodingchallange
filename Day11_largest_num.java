impor java.util.Scanner;
class largest_num{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter any four numbers");
System.out.println("enter number first");
int num1=sc.nextint();
System.out.println("enter number second");
int num2=sc.nextint();
System.out.println("enter number third");
int num3=sc.nextint();
System.out.println("enter number four");
int num4=sc.nextint();
if(num1>num2&&num1>num3)
{
    if(num1>num4)
     {
        System.out.println("largest number :"+num1);
     }
     else
     {
         System.out.println("largest number :"+num4);
     }
}
else if(num2>num3&&num2>num4)
     {
         System.out.println("largest number :"+num2); 
     }
     else if(num3>num4)
     {
        System.out.println("largest number :"+num3); 
     }
     else 
     {
        System.out.println("largest number :"+num4); 
     }
  }
}



