public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.createShp("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.createShp("square");
        shape2.draw();

        Shape shape3 = shapeFactory.createShp("rectangle");
        shape3.draw();

        Shape shape4 = shapeFactory.createShp("circle");
        shape4.draw();

        Shape shape5 = shapeFactory.createShp("square");
        shape5.draw();

        //in case that the limit is reached
        Shape shape6 = shapeFactory.createShp("circle");
        if (shape6 != null) shape6.draw();
    }
}