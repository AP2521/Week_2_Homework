package java_homework;

public class P7 {
    /*7. Write a program to insert any temperature value in degree Fahrenheit and convert
to degree Celsius ((F − 32) × 5/9 = 0°C).*/
    public static void temperature(int F){
        System.out.println("degree Fahrenheit = "+F);
        System.out.println("degree Celsius = "+ (F-32)*5/9+"°C");

    }

    public static void main(String[] args) {
        temperature(5);
    }
}
