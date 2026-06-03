package effekte;
import attribute.AttributTyp;
public class AttributEffekt implements Effekt {

    private String quelle;
    private AttributTyp typ;
    private int modifikator;
    private String beschreibung = "";

    public AttributEffekt(String quelle, AttributTyp typ, int wert) {
        this.quelle = quelle;
        this.typ = typ;
        this.modifikator = wert;
    }
    public AttributEffekt(String quelle, AttributTyp typ, int wert, String beschreibung) {
        this.quelle = quelle;
        this.typ = typ;
        this.modifikator = wert;
        this.beschreibung = beschreibung;
    }

//Setter
    @Override
    public void setQuelle(String quelle){
        this.quelle = quelle;
    }
    @Override
    public void setTyp(AttributTyp typ){
        this.typ = typ;
    }
    @Override
    public void setModifikator(int modifikator){
        this.modifikator = modifikator;
    }
    @Override
    public void setBeschreibung(String beschreibung){
        this.beschreibung = beschreibung;
    }


//Getter
    @Override
    public String getQuelle() {
        return this.quelle;
    }
    @Override
    public AttributTyp getTyp() {
        return this.typ;
    }
    @Override
    public int getMod() {
        return this.modifikator;
    }
    @Override
    public String getBeschreibung(){
        return this.beschreibung;
    }
    @Override
    public Effekt getEffekt(){
        return this;
    }



}