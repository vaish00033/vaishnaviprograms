class Armstrongnumber
{
public static void main(String[] args)
{
int n,m,o,p;
n=153;
m=n;
p=0;
while(m!=0)
{
o=m%10;
p+=Math.pow(o,3);
m=m/10;
}
if(p==n)
{
System.out.println(n+ "is a armstrong number");
}
else
{
System.out.println(n+ "is not a armstrong number");
}
}
}
