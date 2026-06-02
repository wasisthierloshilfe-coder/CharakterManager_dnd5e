package talente;
import java.util.List;

import effekte.Effekt;
public class Talent {

    private int id;
    private String name;
    private String beschreibung;

    private List<Effekt> effekte;

    public List<Effekt> getEffekte(){
        return effekte;
    }
}