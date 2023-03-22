public class PaintManager {
    public static Shape[] getPaintedShapes(Shape[] shapes, int nbCans, double vol) {
        ShapeUtil.sort(shapes);
        double totalPaint = nbCans * vol;
        int cnt = -1;
        while (totalPaint >= 0) {
            totalPaint -= shapes[++cnt].getArea();
        }
        Shape[] PaintedShapes = new Shape[cnt];
        for (int i = 0; i < cnt; i++) {
            PaintedShapes[i] = shapes[i];
        }
        return PaintedShapes;
    }
}
