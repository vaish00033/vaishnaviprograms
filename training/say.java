class say
{
public static void main(String[] args){
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
{
System.out.println("is a armstrong number");
}
else
{
System.out.println("is not a armstrong number");
}
}
}


