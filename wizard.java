public class Wizard extends Enemy{
    String type;
    public Wizard(int h, int d, String t) {
        super(h, d);
        type = t;
    }
    void damageType(){
