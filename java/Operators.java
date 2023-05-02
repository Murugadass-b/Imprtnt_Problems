import java.util.Scanner;

public class Operators {

    Scanner sc = new Scanner(System.in);
    int a,b;
    public void getInput(){
        System.out.println("Enter value of a: ");
        a = sc.nextInt();
        System.out.println("Enter value of b: ");
        b = sc.nextInt();
    }
    
    public void add(){
        System.out.println("**Addition**");
        System.out.println(a+"+"+b+"= "+(a+b));
    }

    public void sub(){
        System.out.println("**Subtraction**");
        System.out.println(a+"-"+b+"= "+(a-b));
    }

    public void mul(){
        System.out.println("**Multiplication**");
        System.out.println(a+"*"+b+"= "+(a*b));
    }

    public void div(){
        System.out.println("**Division**");
        System.out.println(a+"/"+b+"= "+(a/b));
    }

    public void mod(){
        System.out.println("**Modulo**");
        System.out.println(a+"%"+b+"= "+(a%b));
    }
    public static void main(String args[]){
    Operators operator = new Operators();
    operator.getInput();   
    operator.add();
    operator.sub();
    operator.mul();
    operator.div();
    operator.mod();

    }
}
