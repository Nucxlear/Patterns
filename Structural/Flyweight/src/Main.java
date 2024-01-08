import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        List<Shape> shapes = new ArrayList();

        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("square"));

        Random rnd = new Random();
        for (Shape shape: shapes){
            int x = rnd.nextInt(100);
            int y = rnd.nextInt(100);
            shape.draw(x,y);
        }
    }
}