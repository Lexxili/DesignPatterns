package de.abraun.composite;

public class CompositeTest {
    public static void main(String[] args) {

        Circle c1 = new Circle(10, 15, 50);
        Circle c2 = new Circle(1, 1, 100);

        Rectangle r1 = new Rectangle(5, 5, 20, 20);
        Rectangle r2 = new Rectangle(7, 15, 50, 50 );

        GeoFormGroup geoGroup = new GeoFormGroup(c1, c2, r1, r2);
        geoGroup.print();
        System.out.println();
        geoGroup.moveTo(100, 100);
        geoGroup.print();
        System.out.println();

        geoGroup.add(new Circle(10, 10, 37));
        geoGroup.add(new Rectangle(50, 50, 33, 47));
        geoGroup.print();
        System.out.println();
    }
}
