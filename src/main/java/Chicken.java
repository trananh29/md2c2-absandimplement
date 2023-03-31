public class Chicken extends Animal implements Main.Edible {
    @Override
    public void maksound() {
        System.out.println(" i am a chicken");
    }

    @Override
    public void howToEat() {
        System.out.println("Chicken very good");
    }
}
