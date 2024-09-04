public class ShapeFactory {
    private static final int MaxShape = 2;
    private static final int MaxTotal = 5;
    private static int TotalShape = 0;

    public Shape createShp(String type) {

        if (TotalShape >= MaxTotal) {
            System.out.println("No more shapes can be created");
            return null;
        }

        switch (type.toLowerCase()) {

            case "circle":
                if (Circle.getCount() < MaxShape) {
                    TotalShape++;
                    return new Circle();
                } else {
                    System.out.println("No more circles can be created, The limit is reached");
                }
                break;

            case "square":
                if (Square.getCount() < MaxShape) {
                    TotalShape++;
                    return new Square();
                } else {
                    System.out.println("No more squares can be created, The limit is reached");
                }
                break;

            case "rectangle":
                if (Rectangle.getCount() < MaxShape) {
                    TotalShape++;
                    return new Rectangle();
                } else {
                    System.out.println("No more rectangles can be created, The limit is reached");
                }
                break;
            
            default:
                System.out.println("Invalid input, please try again");
                break;
        }

        return null;

    }
}
