import java.util.*;
class Calculater{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the first num");
double num=sc.nextDouble();
System.out.println("enter the second num");
double num1=sc.nextDouble();
System.out.println("enter the operator(+,-,/,*):");
char operator=sc.next().charAt(0);
Double result;
switch(operator)
{
case '+':
result=num+num1;
System.out.println(result);
break;
case '-':

result=num-num1;
System.out.println(result);
break;
case '/':

result=num/num1;
System.out.println(result);
break;
case '*':

result=num*num1;
System.out.println(result);
break;
default:
System.out.println("cannot find operator");
}
}
}

