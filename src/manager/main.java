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
        
   


        //Dummy Item
        Item boots = new Item("Stiefel der Schnelligkeit", "Diese Stiefel verleihen dem Träger erhöhte Geschwindigkeit.", true, false);
        System.out.println("-----------Item erstellt");

        
        //Effekt erstellt und angefügt
        boots.addEffekt(new AttributEffekt(  "Stiefel der Schnelligkeit", AttributTyp.GESCHICKLICHKEIT, 2, "Erhöht die Geschicklichkeit um 2 Punkte."       ));
        System.out.println("-----------Effekt hinzugefügt Geschwindigkeit");

        //Effekt erstellt und angefügt
        boots.addEffekt(new EffektCreator().create());
        System.out.println("----------Effekt angefügt Gesicht");
        System.out.println(boots);

        s.close();
    }


    
}

