package effekte;

import attribute.AttributTyp;

public interface Effekt {

    

    void setQuelle(String quelle);
    String getQuelle();

    void setTyp(EffektTyp typ);
    EffektTyp getTyp();

    void setModifikator(int modifikator);
    int getModifikator();

    void setBeschreibung(String beschreibung);
    String getBeschreibung();

    Effekt getEffekt();
}