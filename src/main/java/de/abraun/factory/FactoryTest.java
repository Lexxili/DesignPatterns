package de.abraun.factory;

public class FactoryTest {
    public static void main(String[] args) {

        Fahrzeug fz = new Fahrzeug("Porsche", "Chayenne", 265, Antrieb.ELEKTRO, Farbe.GRUEN);
        System.out.println(fz);

        Fahrzeug fz1 = FordFactory.createMustang(Antrieb.DIESEL, Farbe.BLAU);
        System.out.println(fz1);

        GenericFahrzeugFactory gff = new GenericFahrzeugFactory();
        gff.setAntrieb(Antrieb.BENZIN);
        gff.setLeistung(250);
        gff.setMarke("Dodge");
        gff.setModell("RAM");

        Fahrzeug fz2 = gff.create();
        System.out.println(fz2);

        gff.setAntrieb(Antrieb.GAS);
        Fahrzeug fz3 = gff.create();
        System.out.println(fz3);
    }
}
