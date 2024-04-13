

class Demo extends Thread
{
public void run()
{
System.out.println("welcome");
}
public static void main(String[] args){
Demo obj=new Demo();
obj.start();
}
}