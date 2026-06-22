package talente;
import java.util.List;

import effekte.Effekt;
public class Talent {

    private String name;
    private String beschreibung;

    private List<Effekt> effekte;

    public List<Effekt> getEffekte(){
        return effekte;
    }
    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setBeschreibung(String beschreibung){
        this.beschreibung = beschreibung;
    }
    
    //Getter
    public String getName(){
        return this.name;  
    }
    public String getBeschreibung(){
        return this.beschreibung;   
    }
    //Adder
    public void addEffekt(Effekt effekt){
        this.effekte.add(effekt);
    }


}