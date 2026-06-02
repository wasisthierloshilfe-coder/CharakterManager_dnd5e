package charakter;
import attribute.*;
import effekte.*;
import klassen.*;
import rassen.*;
import tallente.*;
import spells.*;
import items.*;

import java.util.ArrayList;
import java.util.List;



public class Charakter {

    public Charakter(String name, int alter, double groesse, Gesinnung gesinnung, Attribute stats){
        setName(name);
        setAlter(alter);
        setGrousse(groesse);
        setGesinnung(gesinnung);
        setAttribute(stats);

    }

    // Info
    private int id;
    private String name;
    private int alter;
    private double groesse;
    private Gesinnung gesinnung;
    private String hintergrund;




    // Gameplay
    private Rasse rasse;
    private Klasse klasse;
    private List<Talent> talente = new ArrayList<>();
    private int level;
    private List<String> sprachen = new ArrayList<>();

    //Inventar und Spells
    private Inventar inventar = new Inventar();
    private List<Spell> zauberliste = new ArrayList<>();

    // Attribute
    private Attribute attribute;

    // Defensive
    private int maxLeben;
    private int aktuelleLeben;
    private int ruestungsklasse;
    private int initiative;
    private int laufreichweite;

    // Proficiencies
    private List<String> fertigkeiten = new ArrayList<>();
    private List<String> rettungswuerfe = new ArrayList<>();
    private int uebungsbonus = 2;

    //Gibt alles Effekte in Liste<Effekt> zurück
    public List<Effekt> getAlleEffekte(){
        List<Effekt> effekte = new ArrayList<>();

        // Rasse
        if(rasse != null)effekte.addAll(rasse.getEffekte());

        // Klasse
        if(klasse != null)effekte.addAll(klasse.getEffekte());

        // Talente
        if(talente != null){
            for (Talent talent : talente) {
                effekte.addAll(talent.getEffekte());
            }
        }
        // Ausgerüstete Gegenstände
        if(inventar != null){
            for ( Item ausruestung : inventar.getItems()) {
                if (ausruestung.istAusgerüstet()) {
                    effekte.addAll(ausruestung.getEffekte());
                }
            }
        }
        return effekte;
    }

        //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setAlter(int alter){
        this.alter = alter;
    }
    public void setGrousse(double groesse){
        this.groesse = groesse;
    }
    public void setGesinnung(Gesinnung gesinnung){
        this.gesinnung = gesinnung;
    }
    public void setHintergrund(String hintergrund){
        this.hintergrund = hintergrund;
    }
    public void setAttribute(Attribute stats){
        this.attribute = stats;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void setMaxLeben(int leben){
        this.maxLeben = leben;
    }
    public void setAktuellesLeben(int leben){
        this.aktuelleLeben = leben;
    }
    public void takeDamage(int damage){
        this.aktuelleLeben -= damage;
    }

    //Getter Methoden
     public String getName(){
        return this.name;
    }
    public int getAlter(){
        return this.alter;
    }
    public double getGrousse(){
        return this.groesse;
    }
    public Gesinnung getGesinnung(){
        return this.gesinnung;
    }
    public String getHintergrund(){
        return this.hintergrund;
    }
    public Attribute getAttribute(){
        return this.attribute;
    }
    public int getLevel(){
        return this.level;
    }
    public int getMaxLeben(){
        return this.maxLeben;
    }
    public int getAktuellesLeben(){
        return this.aktuelleLeben;
    }
    public String toString(){
         return """
            \n=== Charakter ===
            Name: %s
            Level: %d
            HP: %d/%d
            RK: %d

            STR: %d
            DEX: %d
            CON: %d
            INT: %d
            WIS: %d
            CHA: %d
            """
            .formatted(
                    name,
                    level,
                    aktuelleLeben,
                    maxLeben,
                    ruestungsklasse,
                    attribute.get_staerke(),
                    attribute.get_geschicklichkeit(),
                    attribute.get_konstitution(),
                    attribute.get_intelligenz(),
                    attribute.get_weisheit(),
                    attribute.get_charisma()
            );
    }

}