package items;

import java.util.List;

import effekte.Effekt;

public class Item{
    String name;
    String beschreibung;
    boolean ausruestbar;
    boolean istAusgeruestet;
    
    private List<Effekt> effekte;
    
    public  void setAusgeruestet(boolean istAusgeruestet){
        this.istAusgeruestet = istAusgeruestet;
    }
    public boolean istAusgerüstet(){
        return this.istAusgeruestet;
    }
    public void addEffekt(Effekt effekt){
        this.effekte.add(effekt);
    }
    public List<Effekt> getEffekte(){
        return effekte;
    }

}
   
