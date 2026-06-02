package items;

import java.util.List;

import effekte.Effekt;

public class Item{
    String name;
    String beschreibung;
    boolean ausruestbar;
    boolean istAusgeruestet;
    
    private List<Effekt> effekte;
    

    public boolean istAusgerüstet(){
        return this.istAusgeruestet;
    }
    public void addEffekt(Effekt effekt){
        this.effekte.add(effekt);
    }
    public List<Effekt> getEffekte(){
        return effekte;
    }

    //Setter Methoden
    public void setName(String name){
        this.name = name;
    }
    public void setBeschreibung(String beschreibung){
        this.beschreibung = beschreibung;
    }
    public void setAusruestbar(Boolean istAusruestbar){
        this.ausruestbar = istAusruestbar;
    }
    public void setAusgeruestet(boolean istAusgeruestet){
        this.ausruestbar = istAusgeruestet;
    }


    //Getter Methoden
    public String getName(){
        return this.name;
    }
    public String getBeschreibung(){
        return this.beschreibung;
    }
    public boolean getAusruestbar(){
        return this.ausruestbar;
    }
    public boolean getAusgeruestet(){
        return this.ausruestbar;
    }

    public String toString(){
        return "Name: " + this.getName();

    }
}
   
