package java_homework;

public class P3 {
    /*3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */
    int a = 3;
    static String b = "JavaProgram"; //Declare one instance and one static variable
    public void HomeWork(){  //Declare one instance method.
        System.out.println(b+a);/*Call both instance and static variables into both instance and static methods inside the
        print statement.*/
    }
    public static void Week2(){ //Declare one static method.
        P3 t = new P3();
        System.out.println(b+"="+t.a);  /*Call both instance and static variables into both instance and static methods inside the
        print statement. */

    }

    public static void main(String[] args) {  //Declare the Main method.
        P3 y = new P3();  //Call both instance and static methods into the Main method and run the programme.
        y.HomeWork();
        Week2();
    }
}
