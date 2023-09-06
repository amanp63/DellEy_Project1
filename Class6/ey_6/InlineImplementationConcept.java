package ey_6;
@FunctionalInterface
interface Sample {
    String print(String name);
}

public class InlineImplementationConcept {
    public static void main(String[] args) {
        Sample obj = (name) -> "Welcome " + name;
        System.out.println(obj.print("to lambda Expression programming"));
    }
}