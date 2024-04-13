class vaishu
{
public static void main(String[] args)
{
try
{
int a[]=new int[6];
a[7]=1/0;
}
catch(ArithmeticException ae)
{
System.out.println("hello");
}
catch(ArrayOutOfBounds ae)
{
System.out.println("hiiii");
}
}
}
