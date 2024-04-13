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
public static void main(String[] args)
{
B obj=new B();
System.out.println(obj.phoneno);
System.out.println(obj.name);
System.out.println(obj.rollno);
System.out.println(obj.addr);
System.out.println(obj.email);
}
}