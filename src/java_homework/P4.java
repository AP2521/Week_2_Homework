package java_homework;

public class P4 {
    /*
    4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
     */
    String a = "Java" , b = "Program";    //Declare two instance.
    static String c = "Week_2" ,d= "HomeWork";// two static variables.
    public void Detail(){ //Declare one instance method.
        System.out.println(a+" "+b);
        System.out.println(c+" "+d);
    }
    public static void Detail2(){  //Declare one static method.
        P4 t= new P4();
        System.out.println(t.a+" "+t.b);
        System.out.println(c+" "+d);
    }

    public static void main(String[] args) {  //Declare the Main method.
        P4 y = new P4();  //Call both instance and static methods into the Main method and run the programme
        y.Detail();
        Detail2();
    }
}
