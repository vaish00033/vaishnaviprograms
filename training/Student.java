import java.io.*;
import java.io.Serializable;
public class Student implements Serializable{
int id;
String name;
public Student(int id,String name){
this.id=id;
this.name=name;
}
}
class Persist{
public static void main(String args[]){
try{
Student s1=new Student(211,"ravi");
FileOutputStream fout=new FileOutputStream("f.txt");
ObjectOutputStream out=new ObjectOutputStream(fout);
out.writeObject(s1);
out.flush();
}
}
}