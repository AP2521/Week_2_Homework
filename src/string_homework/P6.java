package string_homework;
/*Write a java program which replace a “I@love@java” to “we love java”
Expected output: We love java*/
public class P6 {
    public static void main(String[] args) {
      String a= "I@love@java";
        System.out.println(a);
      System.out.println(a.replaceAll("I@love@java", "We love java"));

    }
}
