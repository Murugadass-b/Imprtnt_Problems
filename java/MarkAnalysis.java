import java.util.Scanner;

public class MarkAnalysis {
    int m1,m2,m3,m4,m5,avg;
    public float average(int m1,int m2,int m3,int m4,int m5){
        float avg = (m1+m2+m3+m4+m5)/5;
        return avg;
    }
    public void grade(int avg){
        if(m1>34 && m2 >34 && m3>34 && m4>34 && m5>34){
            if(avg>79){
                System.out.println("You get first class.");
            }
            else if(avg>59){
                System.out.println("You get second class.");
            }
            else if(avg>49){
                System.out.println("You got third class.");
            }
            else if(avg>=35){
                System.out.println("You got fourth class.");
            }
        }
        else{
            System.out.println("You got fail mark");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of five subjects");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        int tot = m1+m2+m3+m4+m5;
        System.out.println("The total mark is "+tot);
        MarkAnalysis obj = new MarkAnalysis();
        System.out.println("The average mark is "+ obj.average(m1,m2,m3,m4,m5));
        obj.grade(obj.avg);
        sc.close();
    }
}
