import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        
                int ENG=86;
                int PHY=58;
                int M_1=62;
                int CME=36;
                double year1_percentage=(ENG+PHY+M_1+CME)/400d*100;
                int EWS=67;
                int AC=80;
                int DC=78;
                int JAVA=57;
                double year2_percentage=(EWS+AC+DC+JAVA)/400d*100;
                int BE=48;
                int LIC=60;
                int EDC=59;
                int ES=88;
                double  year3_percentage=(ES+EDC+LIC+BE)/400d*100;
                int M_2=40;
                int BS=78;
                int ADC=59;
                int CE=41;
                double  year4_percentage=(M_2+ADC+BS+CE)/400d*100;
                System.out.println("Enter the year");
        Scanner sc=new Scanner(System.in);
        int S=sc.nextInt();
        switch(S){
            case 1:
            System.out.println("1st year result:");
            int A =sc.nextInt();
            if(A==1){
               
                System.out.println("ENG: "+ENG);
                System.out.println("PHY: "+PHY);
                System.out.println("M_1: "+M_1);
                System.out.println("CME: "+CME);

System.out.println("1st year result:"+year1_percentage);

            }
            break;
            case 2 :
            System.out.println("2nd year result:");
            int B=sc.nextInt();
            if(B==2){
               
               System.out.println("EWS: "+EWS);
               System.out.println("AC: "+AC);
               System.out.println("DC:"+DC);
               System.out.println("JAVA:"+JAVA);
               System.out.println("2nd year result: "+ year2_percentage);
            }
            break;
            case 3:
            System.out.println("3rd year result:");
            int C=sc.nextInt();
            if (C==3) {
                
                System.out.println("BE: "+BE);
                System.out.println("LIC:"+LIC);
                System.out.println("EDC: "+EDC);
                System.out.println("ES:"+ES);
                System.out.println("3rd year result: "+year3_percentage);

                
            }
            break;
            case 4:
            System.out.println("4th year result:");
            int D=sc.nextInt();
            if (D==4) {
               
                System.out.println("M_2: "+M_2);
                System.out.println("BS: "+BS);
                System.out.println("ADC: "+ADC);
                System.out.println("CE:"+CE);
                System.out.println("4th year result: "+ year4_percentage);
                
            }
            break;
            case 5:
            System.out.println("overall grade");
            int E=sc.nextInt();
            if(E==5){
                double overall_grade=( year1_percentage+year2_percentage+year3_percentage + year4_percentage)/4;
                System.out.println("overall_grade: "+overall_grade);
            }
            break;
            default:
            System.out.println("details not found");
        }
        sc.close();
    }

}

