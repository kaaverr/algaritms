package max.edu.oop;

public class OOP {

    public static void main(String[] args) {
        int length = 2;
        int width = 3;
        int aria = length * width;

        System.out.println(aria);

        Rectangle rectangle= new Rectangle(2 ,3);
        System.out.println(rectangle.getArea());

        System.out.println(rectangle.getPerimeter());

        System.out.println(rectangle.getDiagonal());

        System.out.println(rectangle.isSqure());
    }

}
