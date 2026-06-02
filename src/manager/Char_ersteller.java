package manager;
import charakter.*;
import items.Inventar;
import attribute.*;
import java.util.Scanner;

public class Char_ersteller {
    
    public static final Scanner input = new Scanner(System.in);

    private String name;
    private int level;
    private int alter;
    private Geschlecht geschlecht;
    private double groesse;
    private Gesinnung gesinnung;
    private Attribute attribute;
    private int maxLeben;
    private int aktuelleLeben;
    private Charakter charakter;
    
    
    //Setter
    private void setName(String name){
        this.name = name;
    }
    private void setAlter(int alter){
        this.alter = alter;
    }
    private void setGeschlecht(Geschlecht geschlecht){
        this.geschlecht = geschlecht;
    }
    private void setGrousse(double groesse){
        this.groesse = groesse;
    }
    private void setGesinnung(Gesinnung gesinnung){
        this.gesinnung = gesinnung;
    }
    private void setAttribute(Attribute attribute){
        this.attribute =attribute;
    }
    private void setLevel(int level){
        this.level = level;
    }
    private void setMaxLeben(int leben){
        this.maxLeben = leben;
    }
    private void setAktuellesLeben(int leben){
        this.aktuelleLeben = leben;
    }


    //Getter Methoden
    private String getName(){
        return this.name;
    }
    private int getAlter(){
        return this.alter;
    }
    private Geschlecht getGeschlecht(){
        return this.geschlecht;
    }
    private double getGrousse(){
        return this.groesse;
    }
    private Gesinnung getGesinnung(){
        return this.gesinnung;
    }
    private Attribute getAttribute(){
        return this.attribute;
    }
    private int getLevel(){
        return this.level;
    }
    private int getMaxLeben(){
        return this.maxLeben;
    }
    private int getAktuellesLeben(){
        return this.aktuelleLeben;
    }


    public Attribute creatAttribute(){
        
        //Datenabfrage
        System.out.print("\nGib mir deine Stärke: ");
        int staerke = input.nextInt();
        System.out.print("\nGib mir deine Geschicklichkeit: ");
        int geschicklichkeit = input.nextInt();
        System.out.print("\nGib mir deine Konstitution: ");
        int konstitution = input.nextInt();
        System.out.print("\nGib mir deine Intiligenz: ");
        int intelligenz = input.nextInt();
        System.out.print("\nGib mir deine Weisheit: ");
        int weisheit = input.nextInt();
        System.out.print("\nGib mir dein Charisma: ");
        int charisma = input.nextInt();

        return new Attribute(staerke, geschicklichkeit, konstitution, intelligenz, weisheit, charisma);
    }
    public Geschlecht pickGeschlecht(){
        Geschlecht[] werte = Geschlecht.values();
        for (int i = 0; i < werte.length; i++) {
            System.out.println((i + 1) + ". " + werte[i]);
        }
        while (true) {
            System.out.print("> ");
            int auswahl = input.nextInt();
            if (auswahl >= 1 && auswahl <= werte.length) {
                
                return werte[auswahl - 1];
            }

            System.out.println("Ungültige Nummer.");
        }
    }
    public Gesinnung pickGesinnung(){
        Gesinnung[] werte = Gesinnung.values();

        //Auflistung
        for (int i = 0; i < werte.length; i++) {
            System.out.println((i + 1) + ". " + werte[i]);
        }


        while (true) {
            System.out.print("> ");
            int auswahl = input.nextInt();
            if (auswahl >= 1 && auswahl <= werte.length) {
                
                return werte[auswahl - 1];
            }

            System.out.println("Ungültige Nummer.");
        }
    }



    public Charakter create(){
        //NAME
        System.out.println("Gib mir dein Namen");
        setName(input.next());
        System.out.println("Gib mir dein Level");
        setLevel(input.nextInt());
        System.out.println("Wähle dein Geschlecht");
        setGeschlecht(pickGeschlecht());
        System.out.println("Gib mir dein alter");
        setAlter(input.nextInt());
        System.out.println("Gib mir deine Größe");
        setGrousse(input.nextDouble());
        
        System.out.println("Wähle deine Gesinnung");
        setGesinnung(pickGesinnung());
        
        //Erstellt Attribute und setzt
        setAttribute(creatAttribute());


        System.out.println("Gib mir dein Maximales leben");
        setMaxLeben(input.nextInt());
        setAktuellesLeben(getMaxLeben());

        input.close();
        return new Charakter(name, level, geschlecht, alter ,groesse, gesinnung, attribute, maxLeben, aktuelleLeben);
    }
    
    public Charakter getCharakter(){
        return this.charakter;
    }

}

