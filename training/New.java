class New{
int x=5;
void show(Main d) {
System.out.println(this.x);
}
public static void main(String[] args)
{
Main d=new Main();
Main d1=new Main();
d.x = d1.x+3;
d.show(x);
d1.show(x);

}
}