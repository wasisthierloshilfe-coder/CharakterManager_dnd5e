package rassen;

import java.util.List;
import effekte.Effekt;
public class Rasse {

    private String name;

    private List<Effekt> effekte;

    public String getName(){
        return this.name;
    }
    public List<Effekt> getEffekt(){
        return this.effekte;
    }

}