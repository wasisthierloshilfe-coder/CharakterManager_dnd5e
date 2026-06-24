package effekte;

public class ResitenzEffekt implements Effekt{
    private String quelle;
    private EffektTyp effektTyp = EffektTyp.RESISTENZ;
    private int modifikator;
    private String beschreibung;

    public ResitenzEffekt(String quelle, int modifikator, String beschreibung){
        setQuelle(quelle);
        setModifikator(modifikator);
        setBeschreibung(beschreibung);
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
