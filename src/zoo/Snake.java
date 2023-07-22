package zoo;

public class Snake extends Reptile{
    public Snake(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("sssssssss");
    }
}
