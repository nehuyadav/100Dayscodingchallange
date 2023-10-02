import java.util.Scanner;
class age {
 public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
System.out.println("enter the age of any three people");
System.out.println("enter the age1");
int a=sc.nextInt();
System.out.println("enter the age2");
int b=sc.nextInt();
System.out.println("enter the age3");
int c=sc.nextInt();
System.out.println(+(a>b? a>c?a:c : b>c?b:c));
System.out.println(+(a<b? a<c?a:c : b<c?b:c));
} 
}

