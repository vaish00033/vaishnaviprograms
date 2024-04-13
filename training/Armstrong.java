class Armstrong
{
public static void main(String[] args)
{
int a,b,c,d;
a=153;
b=a;
d=0;
while(b!=0)
{
c=b%10;
d+=Math.pow(c,3);
b=b/10;
}
if(d==a)
System.out.println("a is arm strong");
else
System.out.println("a is not");
}
}
