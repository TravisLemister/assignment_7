public class Wizard extends Enemy{
    String type;
    public Wizard(int h, int d, String t) {
        super(h, d);
        type = t;
    }
    void damageType(){
        if (type.equals("fire")){
            System.out.println("this wizard shoots a fireball");
            }else if (type.equals("ice")){
                System.out.println("this wizard shoots an ice ball");
            }else{
                System.out.println("Please enter a valid wizard type");
        }
    }
}
