package attribute;
public class Attribute {

    public Attribute(int staerke ,int geschicklichkeit ,int konstitution ,int intelligenz ,int weisheit ,int charisma){
        setStaerke(staerke);
        setGeschicklichkeit(geschicklichkeit);
        setKonstitution(konstitution);
        setIntelligenz(intelligenz);
        setWeisheit(weisheit);
        setCharisma(charisma);
    }
    private int staerke;
    private int geschicklichkeit;
    private int konstitution;
    private int intelligenz;
    private int weisheit;
    private int charisma;



    // addiere Attribute dazu
    public void addStaerke(int i){
        this.staerke+= i;
    }
    public void addGeschicklichkeit(int i){
        this.geschicklichkeit+= i;
    }
    public void addKonstitution(int i){
        this.konstitution+= i;
    }
    public void addIntelligenz(int i){
        this.intelligenz+= i;
    }
    public void addWeisheit(int i){
        this.weisheit+= i;
    }
    public void addCharisma(int i){
        this.charisma+= i;
    }
    //setze Attribute
    public void setStaerke(int i){
        this.staerke= i;
    }
    public void setGeschicklichkeit(int i){
        this.geschicklichkeit= i;
    }
    public void setKonstitution(int i){
        this.konstitution= i;
    }
    public void setIntelligenz(int i){
        this.intelligenz= i;
    }
    public void setWeisheit(int i){
        this.weisheit= i;
    }
    public void setCharisma(int i){
        this.charisma= i;
    }
    // bekomme Attribute
    public int getStaerke(){
        return this.staerke;
    }    
    public int getGeschicklichkeit(){
        return this.geschicklichkeit;
    }
    public int getKonstitution(){
        return this.konstitution;
    }
    public int getIntelligenz(){
        return this.intelligenz;
    }
    public int getWeisheit(){
        return this.weisheit;
    }
    public int getCharisma(){
        return this.charisma;
    }
    // bekomme Modifikator
    public static int berechneModifikator(int wert) {
        return Math.floorDiv(wert - 10, 2);
    }
    public int getStaerke_mod() {
        return berechneModifikator(this.staerke);
    }
    public int getGeschicklichkeit_mod() {
        return berechneModifikator(this.geschicklichkeit);
    }
    public int getKonstitution_mod() {
        return berechneModifikator(this.konstitution);
    }
    public int getIntelligenz_mod() {
        return berechneModifikator(this.intelligenz);
    }
    public int getWeisheit_mod() {
        return berechneModifikator(this.weisheit);
    }
    public int getCharisma_mod() {
        return berechneModifikator(this.charisma);
    }
    
}