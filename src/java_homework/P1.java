package java_homework;

public class P1 {
/*
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and run the programme.
 */
    int a=10,b=20;  // Declare two instance variables.
    public void add( ){  //Declare one instance method.
        System.out.println(a+b);  //Call both instance variables into the instance method inside the print statement

    }
    public static void main(String[] args) {  //Declare the Main method.
        P1 t = new P1();  //Call the above instance method into the Main method and run the programme.
        t.add();

    }

}
