class vaishu
{
int a[]=new int[6];
public void method()
{
try
{
a[7]=1/0;
}
catch(ArithmeticException ae)
{
System.out.println("hello");
}
catch(ArrayIndexOutOfBoundsException ae)
{
System.out.println("hiiii");
}
}
}
class main
{
public static void main(String[] args)
{
vaishu obj=new vaishu();
obj.method();
}
}
