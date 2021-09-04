package max.edu.oop;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public int getArea(){
        return length * width;
    }

    public int getPerimeter(){
        return length *2 + width *2;
    }

    public double getDiagonal(){
        return Math.sqrt(length*length + width*width);
    }

    public boolean isSqure(){
        if (width == length)
            return true;
        else
            return false;
    }
}
