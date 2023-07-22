package zoo;

public abstract class Bird extends Animal implements Flyable,Oviparous{
    public Bird(String name, int age) {
        super(name, age);
    }
}
