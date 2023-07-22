package person;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Egyeske", 18, Gender.FEMALE);
        Person person2 = new Person("Ketteske", 29, Gender.MALE);
        Person person3 = new Person("Hármaska", 26, Gender.FEMALE);

        person1.addHobby("Futás");
        person1.addHobby("kutyasétáltatás");
        person1.removeHobby("Futás");
        person1.addFriend(person2);
        person2.addFriend(person1);
        person3.addFriend(person1);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        System.out.println("Populáció: " + Person.getPopulation());
    }
}