/**
 * @author Andrejkovec A.A.GI-31
 * Создаем класс эллипс, наследуемый от фигуры
 */
package Andrejkovec.company;
public class Ellipse implements Figure {
    private double a = 0;
    private double b = 0;

    /**
     *
     * @param a - длинна малой полуоси
     * @param b - длинна большой полуоси
     */
    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     *
     * @return - возвращаем площадь эллипса
     */
    @Override
    public double getSquare() {
        return Math.PI * a * b;
    }

    /**
     *
     * @return возвращаем периметр эллипса
     */
    @Override
    public double getPerimeter() {
        return 4*((Math.PI*a * b + (a - b))/(a+b));
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
