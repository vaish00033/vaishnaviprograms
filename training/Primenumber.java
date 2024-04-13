class Primenumber
{
public static void main(String[] args)
{
int a=7;
boolean b=false;
for(int i=2;i<=a/2;i++)
{
if(a%i==0)
b=true;
break;
}
if(!b)
{
System.out.println(a+ "is aprime number");
}
else
{
System.out.println(a+ " is not a prime number");
}
}
}