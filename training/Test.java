class TrainingClass{
private int i;
TrainingClass(){}
TrainingClass(int i){
this.i=i;
}
public int getvalue(){
return i;
}
public void setValue(int i){
this.i=i;
}
@Override
public String toString(){
return Integer.toString(i);
}
}
public class Test{
public static void main(String[] args){
TrainingClass j=new TrainingClass(10);
System.out.println(j.toString());
}
}