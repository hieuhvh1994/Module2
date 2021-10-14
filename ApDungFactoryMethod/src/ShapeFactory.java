public class ShapeFactory {
    public Shape getShape(String type) {

            if ("Circle".equals(type)) {
                return new Circle();
            } else if ("Rectangle".equals(type)) {
                return new Rectangle();
            } else  {
                return new Square();
            }


    }
}
