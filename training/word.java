import java.util.Scanner;
class word
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int num[]=new int[n];
for(int i=0;i<n;i++)
{
num[i]=sc.nextInt();
for(int j=0;j<n;j++)
{
System.out.println(num[i]);
}
}
}
}
