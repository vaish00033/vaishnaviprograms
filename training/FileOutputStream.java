
public class FileOutputStream{
public static void main(String args[]){
try{
FileOutputStream fout=new FileOutputStream("c:\\testout.txt");
fout.write(65);
fout.flush();
fout.close();
System.out.println("success...");
}
catch(Exception e){
System.out.println(e);
}
}
}