public class Rectangle implements Shape {

    private static final String NAME = "Rectangle";
    private static int count = 0;

    public Rectangle() {
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
