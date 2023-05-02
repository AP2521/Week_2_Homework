package string_homework;
/*Write a java program which remove extra space from both side “ I love
java ”
Expected output: “I love java”*/
public class P2 {
    public static void main(String[] args) {

        String b = " I love java ";
        System.out.println(b.replaceAll(" I Love java ","I love java"));
    }
}
