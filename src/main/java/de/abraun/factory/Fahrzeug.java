package de.abraun.factory;

public class Fahrzeug {

    private String marke, modell;
    private int leistung;
    private Antrieb antrieb;
    private Farbe farbe;

    public Fahrzeug(String marke, String modell, int leistung, Antrieb antrieb, Farbe farbe) {
        this.marke = marke;
        this.modell = modell;
        this.leistung = leistung;
        this.antrieb = antrieb;
        this.farbe = farbe;
    }

    public Fahrzeug() {

    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public Antrieb getAntrieb() {
        return antrieb;
    }

    public void setAntrieb(Antrieb antrieb) {
        this.antrieb = antrieb;
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public void setFarbe(Farbe farbe) {
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "Fahrzeug{ " +
                "marke = " + marke +
                ", modell = " + modell +
                ", leistung = " + leistung +
                ", antrieb = " + antrieb +
                ", farbe = " + farbe +
                " }";
    }
}
