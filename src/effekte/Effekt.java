package effekte;

import attribute.AttributTyp;

public interface Effekt {

    String getQuelle();

    AttributTyp getTyp();

    int getMod();
}