class A
{
int a=12;
void abc()
{
System.out.println("abc");
}
}
class B
{
A a;
void show()
{
a.abc();
System.out.println("show");
}
public static void main(String[] args)
{
B obj=new B();
obj.a=new A();
obj.show();
}
}