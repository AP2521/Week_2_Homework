package java_homework;

public class P14 {
    /*Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output:
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/
    public static void main(String[] args) {
        sum(125,24); //addition
        sub(125,24);//subtraction
        multiply(125,24);//multiplication
        divide(125,24);//divide
        remainder(125,24);//remainder
    }
    public static void sum(int a, int b){ int c = a+b;  //addition
        System.out.println(a+" + "+b+" = "+c); }
    public static void sub(int a, int b){ int c = a-b; //subtraction
        System.out.println(a+" - "+b+" = "+c); }
    public static void multiply(int a, int b){ int c = a*b; //multiplication
        System.out.println(a+" x "+b+" = "+c); }
    public static void divide(int a, int b){ int c = a/b; //divide
        System.out.println(a+" / "+b+" = "+c); }
    public static void remainder(int a, int b){ int c = a%b; //remainder
        System.out.println(a+" mod "+b+" = "+c); }
}
