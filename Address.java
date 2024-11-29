public class Address {
    private String strasse;
    private String hausnr;
    private String ort;

    public Address(String strasse, String hausnr, String ort) {
        this.strasse = strasse;
        this.hausnr = hausnr;
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }
    public String getHausnr() {
        return hausnr;
    }
    public String getOrt() {
        return ort;
    }
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }
    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
    }
    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {

        String text = "\nStrasse: " + strasse;
        text += "\nHausnr: " + hausnr;
        text += "\nOrt: " + ort;
        return text;
    }
}
