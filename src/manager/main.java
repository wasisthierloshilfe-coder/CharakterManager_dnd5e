package manager;
import manager.CharakterCreator;
import charakter.Charakter;
import charakter.Gesinnung;
import effekte.AttributEffekt;
import effekte.Effekt;
import attribute.AttributTyp;
import attribute.Attribute;
import items.Item;
import java.util.Scanner;

public class main {

    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        //PLAYGROUND
        CharakterCreator charakterCreator = new CharakterCreator();
        



        Charakter a = charakterCreator.create();
        System.out.println("Charakter erstellt" );
        //TODO - ItemCreator itemCreator = new ItemCreator();



        Item boots = new Item("Stiefel der Schnelligkeit", "Diese Stiefel verleihen dem Träger erhöhte Geschwindigkeit.", true, false);
        System.out.println("Item erstellt");

        
        
        boots.addEffekt(new AttributEffekt(  "Stiefel der Schnelligkeit", AttributTyp.GESCHICKLICHKEIT, 2, "Erhöht die Geschicklichkeit um 2 Punkte."       ));
        System.out.println("Effekt hinzugefügt");

        a.addItem(boots);
        System.out.println("Item zum Charakter hinzugefügt");


        //Charakter output
        System.out.println(a + " mit " + boots);


        s.close();
    }


    
}

