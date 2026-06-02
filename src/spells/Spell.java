package spells;
public class Spell{
    private String name;
    private String wirkzeit;
    private int reichweite;
    private String komponente;
    private int dauer; 
    private String beschreibung;

    //Setter Methoden
    public void setName(String name){
        this.name =name;
    }
    public void setWirkzeit(String wirkzeit){
        this.wirkzeit = wirkzeit;
    }
    public void setReichweite(int reichweite){
        this.reichweite = reichweite;
    }
    public void setKomponente(String komponente){
        this.komponente = komponente;
    }
    public void setDauer(int dauer){
        this.dauer = dauer;
    }
    public void setBeschreibung(String beschreibung){
        this.beschreibung = beschreibung;
    }

    //Getter Methoden
    public String getName(){
        return this.name;
    }
    public String getWirkzeit(){
        return this.wirkzeit;
    }
    public int getReichweite(){
        return this.reichweite;
    }
    public String getKomponente(){
        return this.komponente;
    }
    public int getDauer(){
        return this.dauer;
    }
    public String getBeschreibung(){
        return this.beschreibung;
    }

    
}