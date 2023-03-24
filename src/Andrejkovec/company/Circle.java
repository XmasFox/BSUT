/**
 * @author Andrejkovec A.A.GI-31
 * Создаем класс круг, наследуемый от фигуры
 */
package Andrejkovec.company;
public class Circle implements Figure{
    private double r = 0;

    /**
     *
     * @param r - радиус круга
     */
    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    /**
     *
     * @return - возвращаем площадь круга
     */
    @Override
    public double getSquare() {
        return Math.PI*r*r;
    }

    /**
     *
     * @return - возвращаем периметр круга
     */
    @Override
    public double getPerimeter() {
        return Math.PI*2*r;
    }
}
