class A
{
int a=9;
public static void main(String[] args)
{
A obj=new A();
obj.a=57;
new A().a=66;
System.out.println(obj.a);
System.out.println(new A().a);
}
}
                                           





