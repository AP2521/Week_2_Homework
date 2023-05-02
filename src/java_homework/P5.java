package java_homework;

public class P5 {
    /*
    Write a program for a calculator with addition, subtraction, multiplication, and division
methods all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.)
     */
    public void addition(int a,int b){
        System.out.println("Addition = "+ (a+b));
    }
    public void subtraction(int a,int b){
        System.out.println("Subtraction = "+(a-b));
    }
    public static void multiplication(int a, int b){
        System.out.println("Multiplication = "+ (a*b));
    }
    public static void division(int a, int b){
        System.out.println("Multiplication = "+ (a/b));
    }

    public static void main(String[] args) {
        P5 t = new P5();
        t.addition(5,5);
        t.subtraction(5,5);
        multiplication(5,5);
        division(5,5);
    }
}
