class output
{
public static void main(String[] args)
{
String s="aaabbbbcd";
int[] count=new int[(int) Character.MAX_VALUE];
String m;
for(int i=1;i<s.length();i++);
{
if(s[i].equals(s[i-1]))
{
count=count++;
}
else
{
m=count+s[i-1];
}
}System.out.println(m);
}
}