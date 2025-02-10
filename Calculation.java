import java.util.*;
class Calculation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number:");
int num1=sc.nextInt();
System.out.println("Enter second number:");
int num2=sc.nextInt();
int add=num1+num2;
System.out.println("Addition of two number is:" + add);
int multiplication=num1*num2;
System.out.println("Multiplication of two number is:"+ multiplication);
int division=num1/num2;
System.out.println("Division of two number is:" + division);

}
}