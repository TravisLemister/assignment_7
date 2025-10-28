public class Goblin extends Enemy{
   public Wizard(int h, int d) {
        super(h, d);
   }
  @Override
  void attack(){
    System.out.println("The goblin gobbles");
  }
}
