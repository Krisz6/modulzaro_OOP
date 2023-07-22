package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void printAllAnimals() {
        System.out.println("Minden állat: ");
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public void printMammals() {
        System.out.println("Emlősök: ");
        for (Animal animal : animals) {
            if (animal instanceof Mammal) {
                System.out.println(animal.getName());
            }
        }
    }

    public void printBirds() {
        System.out.println("Madarak: ");
        for (Animal animal : animals) {
            if (animal instanceof Bird) {
                System.out.println(animal.getName());
            }
        }
    }

    public void printReptiles() {
        System.out.println("Hüllők: ");
        for (Animal animal : animals) {
            if (animal instanceof Reptile) {
                System.out.println(animal.getName());
            }
        }
    }
}

