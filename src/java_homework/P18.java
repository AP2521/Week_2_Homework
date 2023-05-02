package java_homework;

public class P18 {
    /*Write a Java Program using below steps.
18.1 Declare your council name as static variables.
18.2 Declare your house number as instance variables.
18.3 Declare one instance method name borough() and call Static variable
18.4 Declare static method name address() and call instance variable
18.5 Call both user defined methods into main method.*/
    static String counsil= "Maricopa";  //Declare your council name as static variables.
    String a="7770";  //Declare your house number as instance variables.
    public void borough(){  //Declare one instance method name borough() and call Static variable
        System.out.println("Counsil : "+counsil);}
        public static void address(){P18 t=new P18();  //Declare static method name address() and call instance variable
            System.out.println("Address : "+t.a);}

    public static void main(String[] args) {  //Call both user defined methods into main method.
        P18 y=new P18();
        y.borough();
        P18.address();
    }

}
