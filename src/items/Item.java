package items;

import java.util.List;
import java.util.ArrayList;

import effekte.Effekt;

public class Item{
    String name;
    String beschreibung;
    boolean ausruestbar;
    boolean ausgeruestet;
    private List<Effekt> effekte;
    
    
    public Item(String name, String beschreibung, boolean ausruestbar, boolean ausgeruestet){
        this.setName(name);
        this.setBeschreibung(beschreibung);
        this.setAusruestbar(ausruestbar);
        this.setAusgeruestet(ausgeruestet);
        this.effekte = new ArrayList<Effekt>();
    
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
    public void addEffekt(Effekt effekt){
        this.effekte.add(effekt);
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
    public List<Effekt> getEffekte(){
        return effekte;
    }


    public String toString(){
        StringBuilder s = new StringBuilder(); 
        s.append("\nName: " + this.getName()+
            "\nBeschreibung: " + this.getBeschreibung() +
            "\nAusrüstbar: " + this.getAusruestbar() +
            "\nAusgerüstet: " + this.getAusgeruestet() +"\n" +
            "\nEffekte: \n");
        for(Effekt effekt :this.effekte){
            s.append(effekt+"\n");
        }
        return s.toString();

    }
}
   
