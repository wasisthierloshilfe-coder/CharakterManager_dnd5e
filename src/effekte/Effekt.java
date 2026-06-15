package effekte;

public interface Effekt {

    

    void setQuelle(String quelle);
    String getQuelle();

    void setEffektTyp(EffektTyp typ);
    EffektTyp getEffektTyp();

    void setModifikator(int modifikator);
    int getModifikator();

    void setBeschreibung(String beschreibung);
    String getBeschreibung();

    Effekt getEffekt();
}