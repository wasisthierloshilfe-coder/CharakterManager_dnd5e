package manager;
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
        
        //dummy effekt
        this.quelle = "Anton";
        this.typ = typ.CHARISMA;
        this.modifikator = 4;
        this.beschreibung = "Antons schönes gesicht";


        Effekt effekt = new AttributEffekt(this.quelle, this.typ ,this.modifikator, this.beschreibung);
        return effekt;
    }
    
}
