public class Square implements Shape {

    private static final String NAME = "Square";
    private static int count = 0;

    public Square() {
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