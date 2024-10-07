import java.util.*;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radiusInches = sc.nextDouble();
        double radiusCm = radiusInches * 2.54;
        double circumference = 2 * Math.PI * radiusCm;
        double area = Math.PI * Math.pow(radiusCm, 2);

        System.out.printf(circumference);
        System.out.printf( area);
     
}
}
