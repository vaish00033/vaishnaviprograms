class Prog
{
public static void main(String[] args)
{
int arr[]={1,2,4,-7,9,5,-3,-9};
int n=arr.length;
for(int i=0;i<n;i++)
{
if(arr[i]>0)
{
System.out.println(arr[i]);
}
}
for(int j=0;j<n;j++)
{
if(arr[j]<0)
{
System.out.println(arr[j]);
}
}
}
}

