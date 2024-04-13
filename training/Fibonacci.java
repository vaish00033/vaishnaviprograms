class Fibonacci{
public static void main(String[] args)
{
int i,first=0,second=1;
for(i=1;i<=24;++i){
System.out.println(first+" ");
int nextterm=first+second;
first=second;
second=nextterm;
}}
}
