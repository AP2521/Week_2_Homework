package java_homework;

public class P19 {
    /*Write a Java Program using below steps.
19.1 Declare one of your group member names as instance variable.
19.2 Declare one of your group member names as static variable.
19.3 Declare one instance method name with group name (e.g. selenium())and call both global
variables.
19.4 Declare static method name agile() and call both variable
19.5 Call both user defined methods into main method.
Note: Declare 1 local variables in all user defined method and main method and print in to statement*/
    String member = "Nimit";  //Declare one of your group member names as instance variable.
    static String member2 = "Umang";  //Declare one of your group member names as static variable.
public void Java(){ /*Declare one instance method name with group name (e.g. selenium())and call both global
                       variables.*/
    int age= 25;
    System.out.println(member);
    System.out.println(member2);
    System.out.println("Age = "+age);}

    public static void agile(){  //Declare static method name agile() and call both variable
    int c = 2023;
    P19 y= new P19();
        System.out.println(y.member);
        System.out.println(member2);
        System.out.println("Year of join = "+2023);}

    public static void main(String[] args) { //Call both user defined methods into main method
    P19 z =new P19();
    z.Java();
    agile();

    }
}
