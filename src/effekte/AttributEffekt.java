package effekte;
import attribute.AttributTyp;
public class AttributEffekt implements Effekt {

    private String quelle;
    private EffektTyp effektTyp;
    private AttributTyp attributTyp;
    private int modifikator;
    private String beschreibung = "";

    public AttributEffekt(String quelle, AttributTyp typ, int wert) {
        this.quelle = quelle;
        this.attributTyp = typ;
        this.modifikator = wert;
    }
    public AttributEffekt(String quelle, AttributTyp typ, int wert, String beschreibung) {
        this.quelle = quelle;
        this.attributTyp = typ;
        this.modifikator = wert;
        this.beschreibung = beschreibung;
    }

//Setter
    @Override
    public void setQuelle(String quelle){
        this.quelle = quelle;
    }
    @Override
    public void setEffektTyp(EffektTyp typ){
        this.effektTyp = typ;
    }
    @Override
    public void setModifikator(int modifikator){
        this.modifikator = modifikator;
    }
    @Override
    public void setBeschreibung(String beschreibung){
        this.beschreibung = beschreibung;
    }
    public void setAttributTyp(AttributTyp typ){
        this.attributTyp = typ;
    }

//Getter
    @Override
    public String getQuelle() {
        return this.quelle;
    }
    @Override
    public EffektTyp getEffektTyp() {
        return this.effektTyp;
    }
    @Override
    public int getModifikator() {
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
    public AttributTyp getAttributTyp(){
        return this.attributTyp;
    }

    //TODO 
    public String toString(){
        //DUMMY
        return this.beschreibung;
    }
}