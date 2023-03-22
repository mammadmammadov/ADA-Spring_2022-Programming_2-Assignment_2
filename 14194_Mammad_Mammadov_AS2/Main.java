import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Rectangle r1 = new Rectangle("r1", 3, 5);
        Rectangle r2 = new Rectangle("r2", 2, 7);
        Rectangle r3 = new Rectangle("my_rect", 5, 5);

        Sphere s1 = new Sphere("s1", 3);
        Sphere s2 = new Sphere("s2", 6);
        Sphere s3 = new Sphere("ball", 5);

        Shape[] shapes = new Shape[]{s2, r1, s1, r2, s3, r3};
        System.out.println("***Printing all the shapes***");
        ShapeUtil.printShapes(shapes);
//ShapeUtil.sort(shapes);
//ShapeUtil.printShapes(shapes);
// nbCans - first argument and volume of a single can - second argument
// For running the code from command prompt, please uncomment lines 23, 24, and 33; comment lines 26, 27, 28, 29, 34
//        int nbCans = Integer.parseInt(args[0]);
//        double vol = Double.parseDouble(args[1]);
        System.out.println("***Printing the shapes that could be painted\n\tgiven the #cans and value of each can***");
        System.out.print("Please enter the number of cans: ");
        int nbCans = scanner.nextInt();
        System.out.print("Please enter the volume of each can: ");
        double vol = scanner.nextDouble();
        ShapeUtil.printShapes(PaintManager.getPaintedShapes(shapes, nbCans, vol));
        System.out.println("***Finding and printing the shapes based on the given name***");
        System.out.print("Enter the name of the shape you are looking for: ");
//        String name = args[2];
        String name = scanner.next();
        Shape res = ShapeUtil.findShapeByName(shapes, name);
        System.out.println(name + ":" + res);
    }
}