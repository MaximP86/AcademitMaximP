

/**
 * Created by 1 on 04.02.2017.
 */
public class Square implements Shape {
    private double sideLength;

    public Square (double sideLength) {
        this.sideLength = sideLength;
    }
    public double getArea(){
        return Math.pow(sideLength, 2);
    }
    public double getWidth(){
        return sideLength;
    }
    public double getHeight(){
        return sideLength;
    }
    public double getPerimeter(){
        return sideLength * 4;
    }
}
