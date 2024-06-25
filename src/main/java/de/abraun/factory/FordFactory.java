package de.abraun.factory;

public class FordFactory {
    private static final String MARKE = "Ford";

    private static Fahrzeug createPrototype(Antrieb antrieb, Farbe farbe) {
        Fahrzeug fz = new Fahrzeug();
        fz.setMarke(MARKE);
        fz.setAntrieb(antrieb);
        fz.setFarbe(farbe);
        return fz;
    }

    public static Fahrzeug createMustang(Antrieb antrieb, Farbe farbe) {
        Fahrzeug fz = createPrototype(antrieb, farbe);
        fz.setModell("Mustang");
        fz.setLeistung(235);

        return new Fahrzeug(MARKE, "Mustang", 235, antrieb, farbe);
    }

    public static Fahrzeug createFiesta(Antrieb antrieb, Farbe farbe) {
        return new Fahrzeug(MARKE, "Fiesta", 54, antrieb, farbe);
    }

}

