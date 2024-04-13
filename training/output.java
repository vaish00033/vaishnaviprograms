class output
{
public static void main(String[] args)
{
int[] count=new int[(int) Character.MAX_VALUE];
String s="aaabbbbcd";
String m;
for(int i=1;i<s.length();i++);
{
if(s(i)==(s(i-1)))
{
count=count+1;
}
else
{
m=count+s(i-1);
}
}System.out.println(m);
}
}