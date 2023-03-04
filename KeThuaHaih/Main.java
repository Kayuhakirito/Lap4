

package KeThuaHaih;

public class Main {
    public static void main(String[] args) {
        Circle cir = new Circle(5,"red");
        Cylinder cyl = new Cylinder(5,5,"blue");
        System.out.println("Ban kinh Circle la: "+cir.getRadius());
	System.out.println("Mau Circle la: "+cir.getColor());
        System.out.println("Ban kinh Cylinder la: "+cyl.getRadius());
        System.out.println("Mau Cylinder la: "+cyl.getColor());
        System.out.println("Chieu cao Cylinder la: "+cyl.getHeight());
    }
}