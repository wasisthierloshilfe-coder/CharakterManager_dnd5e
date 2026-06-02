package items;

import java.util.List;

import effekte.Effekt;

public class Item{
    String name;
    String beschreibung;
    boolean ausruestbar;
    boolean ausgeruestet;
    
    public Item(String name, String beschreibung, boolean ausruestbar, boolean ausgeruestet){
        this.setName(name);
        this.setBeschreibung(beschreibung);
        this.setAusruestbar(ausruestbar);
        this.setAusgeruestet(ausgeruestet);
    
    }

    private List<Effekt> effekte;
    

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
    public void setAusruestbar(Boolean ausruestbar){
        this.ausruestbar = ausruestbar;
    }
    public void setAusgeruestet(boolean ausgeruestet){
        this.ausgeruestet = ausgeruestet;
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
        return this.ausgeruestet;
    }

    public String toString(){
        return "\nName: " + this.getName()+
            "\nBeschreibung: " + this.getBeschreibung() +
            "\nAusrüstbar: " + this.getAusruestbar() +
            "\nAusgerüstet: " + this.getAusgeruestet() +"\n";

    }
}
   
