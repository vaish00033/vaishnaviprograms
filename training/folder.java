
import java.util.Scanner;

class folder
{
static int studentRollNo;
static String nameOfTheStudent;
static char initial;
static int mathsMarks;
static int englishMarks;
static int scienceMarks;
public static void main(String[] args)
{
Scanner sc =new  Scanner(System.in);
nameOfTheStudent = sc.nextLine();
initial = sc.next().charAt(0);
studentRollNo = sc.nextInt();
mathsMarks = sc.nextInt();
englishMarks = sc.nextInt();
scienceMarks = sc.nextInt();
System.out.println(studentRollNo+""+nameOfTheStudent + " "+initial+" "+mathsMarks+" "+englishMarks+" "+scienceMarks);
}
}
