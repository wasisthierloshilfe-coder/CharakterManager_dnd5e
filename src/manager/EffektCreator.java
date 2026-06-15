package manager;
import java.util.Scanner;

import attribute.AttributTyp;
import effekte.AttributEffekt;
import effekte.Effekt;   

public class EffektCreator implements Creator<Effekt> {
    
    private String quelle;
    private AttributTyp typ;
    private int modifikator;
    private String beschreibung;

    @Override
    public Effekt create(){
        Scanner input = new Scanner(System.in);
        System.out.println("Gib mir die Quelle");
        this.quelle = input.next();
        System.out.println("Gib mir den Typ");
        //TODO aus ENUM auswählen
	    this.typ = AttributTyp.INTELLIGENZ;

	    System.out.println("Gib ein modifikator");
	    this.modifikator = input.nextInt();
	    System.out.println("Gib eine Beschreibung");
        this.beschreibung = input.next();



        Effekt effekt = new AttributEffekt(this.quelle, this.typ ,this.modifikator, this.beschreibung);
        return effekt;
    }
    
}
