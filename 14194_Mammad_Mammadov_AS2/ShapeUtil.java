public class ShapeUtil {
    public static void sort(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            for (int j = i + 1; j < shapes.length; j++) {
                if (shapes[i].getArea() > shapes[j].getArea()) {
                    swap(shapes, i, j);
                }
            }
        }
    }

    private static void swap(Shape[] shapes, int i, int j) {
        Shape temp = shapes[i];
        shapes[i] = shapes[j];
        shapes[j] = temp;
    }

    public static void printShapes(Shape[] shapes) {
        if (shapes.length == 0) {
            System.out.println("You do not have enough color for painting at least one shape\n");
        } else {
            System.out.print("[");
            for (int i = 0; i < shapes.length; i++) {
                if (i != shapes.length - 1) {
                    System.out.print(String.format("%s: %.3f, ", shapes[i].toString(), shapes[i].getArea()));
                } else {
                    System.out.println(String.format("%s: %.3f]\n", shapes[i].toString(), shapes[i].getArea()));
                }
            }
        }
    }

    public static Shape findShapeByName(Shape[] shapes, String name) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].getName().equals(name)) {
                return shapes[i];
            }
        }
        return null;
    }
}
