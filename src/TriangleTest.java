public class TriangleTest {
    public static void main(String[] args) {
        Triangle tri1 = new Triangle();
        Triangle tri2 = new Triangle(3, 4, 5);
        Triangle tri3 = new Triangle(7, 8, 10, "skyblue", false);
        System.out.println(tri1);
        System.out.println(tri2);
        System.out.println(tri3);

        System.out.println();
        tri2.setSide1(4);
        tri2.setSide2(6);
        tri3.setSide3(12);
        tri3.setColor("red");
        tri3.setFilled(true);
        System.out.println(tri2);
        System.out.println(tri3);
    }
}
