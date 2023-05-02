package java_homework;

public class P20 {
    /*Write a Java Program using below steps.
20.1 Declare Spain as static variable.
20.2 Declare United Kingdom as instance variable.
20.3 Declare instance method name homeCountry()and call static variable.
20.4 Declare static method name holidays() and call instance variable
20.5 Call both methods in main method.*/
    static String country = "Spain"; //Declare Spain as static variable.
    String country2 = "United Kingdom"; //Declare United Kingdom as instance variable.
    public void homeCountry(){  //Declare instance method name homeCountry()and call static variable.
        System.out.println(country);}
        public static void holidays(){ //Declare static method name holidays() and call instance variable
        P20 t=new P20();
            System.out.println(t.country2);}

    public static void main(String[] args) {  //Call both methods in main method.
    P20 y=new P20();
    y.homeCountry();
    holidays();
    }
}
