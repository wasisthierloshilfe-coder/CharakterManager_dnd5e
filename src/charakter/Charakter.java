package charakter;
import attribute.*;
import effekte.*;
import klassen.*;
import rassen.*;
import spells.*;
import talente.*;
import items.*;

import java.util.ArrayList;
import java.util.List;



public class Charakter {

    public Charakter(String name,int level ,Geschlecht geschlecht,int alter, double groesse, Gesinnung gesinnung, Attribute stats, int maxLeben, int leben){
        setName(name);
        setLevel(level);
        setAlter(alter);
        setGeschlecht(geschlecht);
        setGrousse(groesse);
        setGesinnung(gesinnung);
        setAttribute(stats);
        setMaxLeben(maxLeben);
        setAktuellesLeben(leben);
        this.sprachen = new ArrayList<>();
        this.talente = new ArrayList<>();
        this.zauberliste = new ArrayList<>();
        this.inventar = new Inventar();
        this.fertigkeiten = new ArrayList<>();
        this.rettungswuerfe = new ArrayList<>();   
    }

    // Info
    private int id;
    private String name;
    private Geschlecht geschlecht;
    private int alter;
    private double groesse;
    private Gesinnung gesinnung;
    private String hintergrund;

    // Gameplay
    private Rasse rasse;
    private Klasse klasse;
    private int level;
    private List<Talent> talente;
    private List<String> sprachen;
    private List<Effekt> effekte;

    //Inventar und Spells
    private Inventar inventar;
    private List<Spell> zauberliste;

    // Attribute
    private Attribute attribute;

    // Defensive
    private int maxLeben;
    private int aktuelleLeben;
    private int ruestungsklasse;
    private int initiative;
    private int laufreichweite;

    // Proficiencies
    // Von Klasse + Talent
    private List<AttributTyp> fertigkeiten;
    private List<AttributTyp> rettungswuerfe;
    // TODO Abhängig von level berechnen
    private int uebungsbonus = 2;

    //Gibt alles Effekte in Liste<Effekt> zurück
    public List<Effekt> getAlleEffekte(){
        List<Effekt> effekte = new ArrayList<>();

        // Rasse
        if(rasse != null)effekte.addAll(rasse.getEffekte());

        // Klasse
        if(klasse != null)effekte.addAll(klasse.getEffekte());

        // Talente
        for (Talent talent : talente) {
            effekte.addAll(talent.getEffekte());
        }
        // Ausgerüstete Gegenstände
        if(inventar != null){
            for ( Item ausruestung : inventar.getItems()) {
                if (ausruestung != null && ausruestung.getAusgeruestet()) {
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
    public void setGeschlecht(Geschlecht geschlecht){
        this.geschlecht = geschlecht;
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
    public void setEffekte(){
        this.effekte = getAlleEffekte();
    }

    //Getter Methoden
    public String getName(){
        return this.name;
    }
    public int getAlter(){
        return this.alter;
    }
    public Geschlecht getGeschlecht(){
        return this.geschlecht;
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
    public Inventar getInventar(){
        return this.inventar;
    }
    
    //Adder Methoden
    public void addItem(Item item){
        inventar.addItem(item);
    }
    public void takeDamage(int damage){
        this.aktuelleLeben -= damage;
    }
    public void addSprache(String sprache){
        sprachen.add(sprache);
    }
    public void addSpell(Spell spell){
        zauberliste.add(spell);
    }



    //TO STRING
    public String toString(){
         return String.format(
            "\n=== Charakter ===\n" +
            "Name: %s\n" +
            "Level: %d  Geschlecht: %s\n" +
            "HP: %d / %d  RK: %d\n" +
            "\n" +
            "Attribute:\n" +
            "STR: %d (%d)\n" +
            "DEX: %d (%d)\n" +
            "CON: %d (%d)\n" +
            "INT: %d (%d)\n" +
            "WIS: %d (%d)\n" +
            "CHA: %d (%d)\n",
                    name,
                    level, geschlecht,
                    aktuelleLeben,
                    maxLeben,
                    ruestungsklasse,
                    attribute.getStaerke(), attribute.getStaerke_mod(),
                    attribute.getGeschicklichkeit(),attribute.getGeschicklichkeit_mod(),
                    attribute.getKonstitution(),attribute.getKonstitution_mod(),
                    attribute.getIntelligenz(),attribute.getIntelligenz_mod(),
                    attribute.getWeisheit(),attribute.getWeisheit_mod(),
                    attribute.getCharisma(),attribute.getCharisma_mod()
            );
    }

}