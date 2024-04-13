class A
{
int a=9;
String s="hii";
}
class B extends A
{
String n="vaish";
char c='h';
}
class c extends B
{
String name="vaishnavi";
String email="chatla";
public static void main(String[] args)
{
c obj=new c();
System.out.println(obj.a);
System.out.println(obj.s);
System.out.println(obj.n);
System.out.println(obj.c);
System.out.println(obj.name);
System.out.println(obj.email);
}
}
