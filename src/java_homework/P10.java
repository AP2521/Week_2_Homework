package java_homework;

public class P10 {
    /*Write a Java program that takes a number as input and prints its multiplication
    table up to 10.*/
    public static void main(String[] args) {
        Table(8);
    }
    public static void Table(int a){

        System.out.println(a+" X 1 = "+a*1);
        System.out.println(a+" X 2 = "+a*2);
        System.out.println(a+" X 3 = "+a*3);
        System.out.println(a+" X 4 = "+a*4);
        System.out.println(a+" X 5 = "+a*5);
        System.out.println(a+" X 6 = "+a*6);
        System.out.println(a+" X 7 = "+a*7);
        System.out.println(a+" X 8 = "+a*8);
        System.out.println(a+" X 9 = "+a*9);
        System.out.println(a+" X 10 = "+a*10);
    }
}
