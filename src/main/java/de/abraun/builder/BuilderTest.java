package de.abraun.builder;

public class BuilderTest {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Fiat", "500", "HA:AB123" );
        System.out.println(v1.getBrand() + ", " + v1.getType() + ", " + v1.getRegistration());

        VehicleBuilder vb = new VehicleBuilder();
        vb.setBrand("Ford").setType("Escord").setRegistration("AB:R0815");

        Vehicle v2 = vb.build();
        System.out.println(v2.getBrand() + ", " + v2.getType() + ", " + v2.getRegistration());

        Vehicle v3 = vb.setRegistration("AB:C123").build();
        System.out.println(v3.getBrand() + ", " + v3.getType() + ", " + v3.getRegistration());

        vb = new VehicleBuilder();
        vb.setBrand("Renault");

        v3 = vb.build();
        System.out.println(v3.getBrand() + ", " + v3.getType() + ", " + v3.getRegistration());

        Vehicle v4 = FordFactory.getMustang("XY:Z42");
        System.out.println(v4.getBrand() + ", " + v4.getType() + ", " + v4.getRegistration());

    }
}
