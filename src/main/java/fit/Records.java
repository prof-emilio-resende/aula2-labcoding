package fit;

record Point (int x, int y) {};

public class Records {
    public static void testar() {
        System.out.println("starting prod support...");
        var point = new Point(10, 20);
        System.out.println(point);
        System.out.println(point.x());
    }
}
