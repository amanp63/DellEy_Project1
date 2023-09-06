package ey_8;

class Name {
    private String name;

    public Name(String name) {
        this.name = name;
    }

    public String addLetterToFront(char letter) {
        return letter + name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class ImmutableClassExample {
    public static void main(String[] args) {
        Name yourName = new Name("Aman");
        char letterToAdd = 'B';
        String newName = yourName.addLetterToFront(letterToAdd);
        System.out.println("Original name: " + yourName);
        System.out.println("New name with added letter: " + newName);
    }
}