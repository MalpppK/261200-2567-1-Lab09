public class Circle implements Shape {

    private static final String NAME = "Circle";
    private static int count = 0;

    public Circle() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void draw() {
        System.out.println("Drawing the " + NAME);
    }
}
