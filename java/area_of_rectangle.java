
public class area_of_rectangle {
    public static void main(String[] args) {
        int l = 5;
        int w = 10;
        double area = area(l,w);
        System.out.println("Area of rectangle: " + area);
    }
    public static double area(int l, int w) {
        return l * w;
    }
}
