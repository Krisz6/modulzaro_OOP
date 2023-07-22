package person;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private static int population = 0;

    private String name;
    private int age;
    private final Gender gender;
    private List<String> hobbies = new ArrayList<>();
    private List<Person> friends= new ArrayList<>();

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        population++;
    }
    public void addFriend(Person person) {
        if (!friends.contains(person)) {
            friends.add(person);
            person.addFriend(this);
        }
    }
    private List<String> getFriendNames() {
        List<String> friendNames = new ArrayList<>();
        for (Person friend : friends) {
            friendNames.add(friend.getName());
        }
        return friendNames;
    }

    public static void setPopulation(int population) {
        Person.population = population;
    }
    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }
    public void removeHobby(String hobby) {
        hobbies.remove(hobby);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<Person> getFriends() {
        return friends;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }

    public static int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Age: " + age +
                ", Gender: " + gender.getHungarian() +
                ", Hobbies: " + hobbies +
                ", Friends: " + getFriendNames();
    }
}
