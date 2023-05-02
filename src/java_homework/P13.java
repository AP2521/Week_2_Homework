package java_homework;

public class P13 {
    /*Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.6 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.208*/
    public static void main(String[] args) {
        double a = 5.6, b =8.6;
        P13 t =new P13();
        t.Area(5.6,8.5);
        Perimeter(5.6,8.5);
    }

    public void Area(double Width, double Height){
        double c= Width*Height;
        System.out.println("Area is "+Width+" * "+Height+" = "+c);
    }
    public static void Perimeter(double Width, double Height){
        double d= 2*(Width+Height);
        System.out.println("Perimeter is 2 * ("+Width+" + "+Height+") = "+d);
        }
    }

