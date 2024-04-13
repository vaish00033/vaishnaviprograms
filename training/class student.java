class student
{
int rl;
String name;
String branch;
double per;
public class student
{
public static void main(String[] args)
{
student s1=new student();
s1.rl=1;
s1.name="lol";
s1.marks=35;
student s2=new student();
s2.rl=1;
s2.name="lol";
s2.marks=35;
student s3=new student();
s3.rl=1;
s3.name="lol";
s3.marks=35;
student student[]=new student[3];
student[0]=s1;
student[1]=s2;
student[2]=s3;
for(int i=0;i<student.length;i++)
{
System.out.println(student[i]+":"+student[i].marks);
}}
}
}