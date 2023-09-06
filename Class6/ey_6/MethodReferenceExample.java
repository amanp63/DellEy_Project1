package ey_6;

public class MethodReferenceExample {

    @FunctionalInterface
    public static interface Converter<F, T> {
        T convert(F from);
    }

    public static void main(String[] args) {
        Converter<String, Integer> intConverter = (from) -> Integer.valueOf(from);
        Integer convertedValue = intConverter.convert("123");

        System.out.println("Integer Value is " + convertedValue);

        Converter<String, Integer> intConverter2 = Integer::valueOf;
        Integer convertedValue2 = intConverter2.convert("123");

        System.out.println("Integer Value is " + convertedValue2);

        StartingAlphabet obj = new StartingAlphabet();

        Converter<String, String> strCon = obj::startWith;
        String value = strCon.convert("Java");

        System.out.println(value);

        PersonFactory<Person> personObject = Person::new;
        Person person = personObject.create("Core", "Java");

        System.out.println("Person name is " + person.firstName + " " + person.lastName);
    }

    static class StartingAlphabet {
        String startWith(String str) {
            return String.valueOf(str.charAt(0));
        }
    }

    interface PersonFactory<P extends Person> {
        P create(String firstName, String lastName);
    }

    static class Person {
        String firstName;
        String lastName;

        Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
}