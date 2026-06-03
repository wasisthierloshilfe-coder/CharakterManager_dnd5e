package effekte;

import attribute.AttributTyp;

public interface Effekt {

    

    void setQuelle(String quelle);
    String getQuelle();

    void setTyp(AttributTyp typ);
    AttributTyp getTyp();

    void setModifikator(int modifikator);
    int getMod();

    void setBeschreibung(String bescheibung);
    String getBeschreibung();

    Effekt getEffekt();
}