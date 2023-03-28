/**
 * @author Andrejkovec A.A.GI-31
 * Создаем класс прямоугольник, наследуемый от фигуры
 */
package Andrejkovec.company;
public class Rectangle implements Figure{
    private double a = 0;
    private double b = 0;

    /**
     *
     * @param a - ширина прямоугольника
     * @param b - высота прямоугольника
     */
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     *
     * @return - возвращаем площадь прямоугольника
     */
    @Override
    public double getSquare() {
        return a*b;
    }

    /**
     *
     * @return возращаем периметр прямоугольника
     */
    @Override
    public double getPerimeter() {
        return (a+b)*2;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


}
