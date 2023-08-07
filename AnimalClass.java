public class AnimalClass {


    public static void main(String[] args) {

      Cat cat=new Cat();
        cat.eat();
        cat.makeSounds();
        Dog dog =new Dog();
        dog.eat();
        dog.makeSounds();
    }
}

abstract class Animals {
    //String ea;
    public abstract void eat();
    public abstract void makeSounds();
}
class Cat extends Animals {

    public void eat() {
        // ea="fish";
        System.out.println("Cat eat : fish ");
    }


    public void makeSounds() {
        System.out.println("Cat sounds : miaow miaow ");
    }
}
class Dog extends Animals {

    public void eat() {
        System.out.println("Cat eat : meat ");
    }


    public void makeSounds() {
        System.out.println("Dog sounds : woof  woof ");
    }
}
