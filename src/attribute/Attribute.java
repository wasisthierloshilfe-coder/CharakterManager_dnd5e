package attribute;
public class Attribute {

    public Attribute(int staerke ,int geschicklichkeit ,int konstitution ,int intelligenz ,int weisheit ,int charisma){
        set_staerke(staerke);
        set_geschicklichkeit(geschicklichkeit);
        set_konstitution(konstitution);
        set_intelligenz(intelligenz);
        set_weisheit(weisheit);
        set_charisma(charisma);
    }
    private int staerke;
    private int geschicklichkeit;
    private int konstitution;
    private int intelligenz;
    private int weisheit;
    private int charisma;



    // addiere Attribute dazu
    public void add_staerke(int i){
        this.staerke+= i;
    }
    public void add_geschicklichkeit(int i){
        this.geschicklichkeit+= i;
    }
    public void add_konstitution(int i){
        this.konstitution+= i;
    }
    public void add_intelligenz(int i){
        this.intelligenz+= i;
    }
    public void add_weisheit(int i){
        this.weisheit+= i;
    }
    public void add_charisma(int i){
        this.charisma+= i;
    }
    //setze Attribute
    public void set_staerke(int i){
        this.staerke= i;
    }
    public void set_geschicklichkeit(int i){
        this.geschicklichkeit= i;
    }
    public void set_konstitution(int i){
        this.konstitution= i;
    }
    public void set_intelligenz(int i){
        this.intelligenz= i;
    }
    public void set_weisheit(int i){
        this.weisheit= i;
    }
    public void set_charisma(int i){
        this.charisma= i;
    }
    // bekomme Attribute
    public int get_staerke(){
        return this.staerke;
    }    
    public int get_geschicklichkeit(){
        return this.geschicklichkeit;
    }
    public int get_konstitution(){
        return this.konstitution;
    }
    public int get_intelligenz(){
        return this.intelligenz;
    }
    public int get_weisheit(){
        return this.weisheit;
    }
    public int get_charisma(){
        return this.charisma;
    }
    // bekomme Modifikator
    public static int berechneModifikator(int wert) {
        return Math.floorDiv(wert - 10, 2);
    }
    public int get_staerke_mod() {
        return berechneModifikator(this.staerke);
    }
    public int get_geschicklichkeit_mod() {
        return berechneModifikator(this.geschicklichkeit);
    }
    public int get__konstitution_mod() {
        return berechneModifikator(this.konstitution);
    }
    public int get_inteligenz_mod() {
        return berechneModifikator(this.intelligenz);
    }
    public int get_weisheit_mod() {
        return berechneModifikator(this.weisheit);
    }
    public int get_charisma_mod() {
        return berechneModifikator(this.charisma);
    }
    
}