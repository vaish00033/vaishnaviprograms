class A
{
int rollno=425;
String name="vaishnavi";
String addr="nirmal";
}
class B extends A
{
int phoneno=678;
String email="vaishnavichatla3@gamil.com";
public String toString()
{
return "welcome";
}
public static void main(String[] args)
{
B obj=new B();
System.out.println(obj);
System.out.println(obj.name);
System.out.println(obj);
System.out.println(obj.addr);
System.out.println(obj.email);

}}