package effekte;
import attribute.AttributTyp;
public class AttributEffekt implements Effekt {

    private String quelle;
    private AttributTyp typ;
    private int wert;
    private String beschreibung = "";

    public AttributEffekt(String quelle, AttributTyp typ, int wert) {
        this.quelle = quelle;
        this.typ = typ;
        this.wert = wert;
    }
    public AttributEffekt(String quelle, AttributTyp typ, int wert, String beschreibung) {
        this.quelle = quelle;
        this.typ = typ;
        this.wert = wert;
        this.beschreibung = beschreibung;
    }

    @Override
    public String getQuelle() {
        return quelle;
    }

    @Override
    public AttributTyp getTyp() {
        return typ;
    }

    @Override
    public int getMod() {
        return wert;
    }
}