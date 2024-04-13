class Std{
int id;
String name;
Std(int id,String name){
this.id=id;
this.name=name;
}
void display(){
System.out.println(id+" "+name);
}
public static void main(String[] args)
{
Std s1=new Std(123,"me");
Std s2= new Std(459,"kgf");
s1.display();
s2.display();

}}


