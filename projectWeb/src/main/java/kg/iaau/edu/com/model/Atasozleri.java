package kg.iaau.edu.com.model;

public class Atasozleri {

    private int id;
    private String KG;
    private String TR;
    private String maining;

    public Atasozleri()
    {

    }

    public Atasozleri(int id, String KG, String TR, String maining) {
        this.id = id;
        this.KG = KG;
        this.TR = TR;
        this.maining = maining;
    }

    public Atasozleri(String KG, String TR, String maining) {
        this.KG = KG;
        this.TR = TR;
        this.maining = maining;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getKG() {
        return KG;
    }

    public void setKG(String KG) {
        this.KG = KG;
    }

    public String getTR() {
        return TR;
    }

    public void setTR(String TR) {
        this.TR = TR;
    }

    public String getmaining() {
        return maining;
    }

    public void setmaining(String maining) {
        this.maining = maining;
    }

    @Override
    public String toString() {
        return "Atasozleri{" +
                "id=" + id +
                ", KG='" + KG + '\'' +
                ", TR='" + TR + '\'' +
                ", maining='" + maining + '\'' +
                '}';
    }
}
