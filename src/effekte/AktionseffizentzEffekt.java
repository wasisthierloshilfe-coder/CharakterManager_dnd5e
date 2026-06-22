package effekte;

public class AktionseffizentzEffekt implements Effekt{
    String quelle;
    EffektTyp effektTyp;
    int modifikator;
    String beschreibung;

    
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


}
