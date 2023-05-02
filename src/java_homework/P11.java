package java_homework;

public class P11 {
    /*11. Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output: 2.138888888888889*/
    public double eqation(double a, double b, double c, double d){
        System.out.println((a*b-b*b)/(c-d));
        return 0;
    }

    public static void main(String[] args) {
        P11 t = new P11();
        t.eqation(25.5,3.5,40.5,4.5);
    }


}
