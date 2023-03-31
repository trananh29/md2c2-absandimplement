public class Main {
    public interface Edible{
         void howToEat();
    }

    public static void main(String[] args) {
        Animal[] animals =new Animal[2];
        animals[0]= new Tiger();
        animals[1]=new Chicken();
        for (Animal animal: animals) {
            animal.maksound();
            if (animal instanceof Chicken){
                ((Edible) animal).howToEat();
            }

        }
        Fruit[] fruits1= new Fruit[] {new Apple(),new Orange()};
        for (Fruit f1: fruits1) {
            if (f1 instanceof Apple){
                ((Edible) f1).howToEat();
            }
            if (f1 instanceof Orange){
                ((Edible) f1).howToEat();
            }
        }
        }
    }

