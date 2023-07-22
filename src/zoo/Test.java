package zoo;

public class Test {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Dog dog = new Dog("Kutyus", 12);
        Cat cat = new Cat("Macskusz", 6);
        Eagle eagle = new Eagle("Sasusz", 7);
        Penguin penguin = new Penguin("Pingvinusz", 5);
        Snake snake = new Snake("Kígyusz", 6);
        Turtle turtle = new Turtle("Teki", 98);

        zoo.addAnimal(dog);
        zoo.addAnimal(cat);
        zoo.addAnimal(eagle);
        zoo.addAnimal(penguin);
        zoo.addAnimal(snake);
        zoo.addAnimal(turtle);

        zoo.printAllAnimals();

        zoo.printMammals();
        zoo.printBirds();
        zoo.printReptiles();

        System.out.println("Állathangok:");
        dog.makeSound();
        cat.makeSound();
        eagle.makeSound();
        penguin.makeSound();
        snake.makeSound();
        turtle.makeSound();

        zoo.removeAnimal(snake);
        zoo.removeAnimal(turtle);

        System.out.println("Eltávolítás utáni kiírás: ");
        zoo.printAllAnimals();
    }
}
