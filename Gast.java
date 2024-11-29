public class Gast {
    private int kundennr;
    private String vorname;
    private String nachname;
    private Address adresse;

    public Gast(String vorname, String nachname, Address adresse) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
    }
    public int getKundennr() {
        return kundennr;
    }
    public void setKundennr(int kundennr) {
        this.kundennr = kundennr;
    }
    public String getVorname() {
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public Address getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        String text = "\nKundennr:" + kundennr;
        text += "\nVorname:" + vorname;
        text += "\nNachname:" + nachname;
        text += "\nAdresse:" + adresse;
        return text;
    }
}
