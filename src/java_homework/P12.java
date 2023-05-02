package java_homework;

public class P12 {
    /*Write a Java program that takes three numbers as input to calculate and print the
average of the numbers.*/

    static void average(int a,int b,int c){
        int d = (a+b+c)/3;
        System.out.println(d);
    }
    public static void main(String[] args) {
      average(50,30,10);
    }
}
