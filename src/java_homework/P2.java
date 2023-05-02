package java_homework;

public class P2 {
    /*2.1 Declare two static variables.
2.2 Declare one static method.
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and run the programme.
 */
    static String Name = "Anish", LastName = "Patel";  //Declare two static variables

    public static void Student() {  //Declare one static method.
        System.out.println(Name+" "+LastName);  //Call both static variables into the static method inside the print statement
    }

    public static void main(String[] args) {  //Declare the Main method.
        Student();   //Call the static method into the Main method and run the programme
    }

}
