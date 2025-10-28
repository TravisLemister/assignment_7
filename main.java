public class Main {
    public static void main(String[] args) {

    enemy e1 = new enemy (100 , 10);
        System.out.println(e1.health);
        System.out.println(e1.damage);

    enemy e2 = new wizard (115, 25, "fire");
        System.out.println(e2.health);
        System.out.println(e2.damage);
        System.out.println(e2.type);

    enemy e3 = new wizard (125, 15, "ice");
        System.out.println(e3.health);
        System.out.println(e3.damage);
        System.out.println(e3.type);

    enemy e4 = new goblin (50, 5);
        System.out.println(e4.health);
        System.out.println(e4.damage);
