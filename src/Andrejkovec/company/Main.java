/**
 * @author Andrejkovec A.A.GI-31
 */
package Andrejkovec.company;
public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(10);
        System.out.println(circle.getSquare());
        System.out.println(circle.getPerimeter());
        Figure rectangle = new Rectangle(10, 15);
        System.out.println(rectangle.getSquare());
        System.out.println(rectangle.getPerimeter());
        Figure triangle = new Triangle(2, 3, 4);
        System.out.println(triangle.getSquare());
        System.out.println(triangle.getPerimeter());
        Figure ellipse = new Ellipse(4, 9);
        System.out.println(ellipse.getSquare());
        System.out.println(ellipse.getPerimeter());
    }
}