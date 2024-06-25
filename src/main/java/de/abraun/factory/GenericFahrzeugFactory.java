package de.abraun.factory;

public class GenericFahrzeugFactory {

    private String marke = "unbekannt", modell = "unbekannt";
    private int leistung;
    private Antrieb antrieb = Antrieb.BENZIN;
    private Farbe farbe = Farbe.SCHWARZ;

    public Fahrzeug create() {
        return new Fahrzeug(marke, modell, leistung, antrieb, farbe);
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
}
