package java_homework;

public class P17 {
    /*Write a Java Program using below steps.
17.1 Declare your city as instance variables.
17.2 Declare your country as static variables.
17.3 Declare one instance method and call static variable in print statement
17.4 Declare static method and call instance variable in print Statement.
17.5 Call both user defined methods into main method.*/
    String city ="Phoenix";   //Declare your city as instance variables.
    static String country = "USA";  //Declare your country as static variables
    public void get(){          //Declare one instance method and call static variable in print statement
        System.out.println("Country : "+country);}
        public static void get2(){P17 t=new P17();//Declare static method and call instance variable in print Statement.
            System.out.println("City : "+t.city);}

    public static void main(String[] args) {  //Call both user defined methods into main method.
        P17 y = new P17();
        y.get();
        get2();
    }
}
