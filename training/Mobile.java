class Mobile
{
String brand;
int price;
String network;
public void show()
{
System.out.println(brand + ":" +price + ":" +network);
}
public class Demo
{
public static void main(String[] args)
{
Moblie obj=new Mobile();
obj.price=999;
obj.network="apple";
obj.brand="smartphoe";
Moblie obj1=new Mobile();
obj1.price=9999;
obj1.network="applegfjy";
obj1.brand="smartphoe";
obj.show();
obj1.show();
}
}
}

