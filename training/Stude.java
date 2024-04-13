class Stude
{
int rollno;
int marks;
String name;
String branch;
String email;
public static void main(String[] args)
{
Stude s1=new Stude();
s1.rollno=1; 
s1.name="lol";
s1.marks=90;
s1.branch="ece";
s1.email="ecee@1";
System.out.println(s1.rollno);
System.out.println(s1.name);
System.out.println(s1.marks);
System.out.println(s1.branch);
System.out.println(s1.email);
Stude s2=new Stude();
s2.rollno=2;
s2.name="yay";
s2.marks=78;
s2.branch="ece";
s1.email="ecee@2";
System.out.println(s2.rollno);
System.out.println(s2.name);
System.out.println(s2.marks);
System.out.println(s2.branch);
System.out.println(s1.email);
Stude s3=new Stude();
s3.rollno=3;
s3.name="eyy";
s3.marks=99;
s3.branch="ece";
s1.email="ecee@3";
System.out.println(s3.rollno);
System.out.println(s3.name);
System.out.println(s3.marks);
System.out.println(s3.branch);
System.out.println(s1.email);
}
}
