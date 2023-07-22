package person;

public enum Gender {
    MALE("male", "férfi"),
    FEMALE("female", "nő");

    private final String english;
    private final String hungarian;

    Gender(String english, String hungarian) {
        this.english = english;
        this.hungarian = hungarian;
    }

    public String getEnglish() {
        return english;
    }

    public String getHungarian() {
        return hungarian;
    }
}

