package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
            new Person("Abena", Gender.FEMALE),
            new Person("Sey", Gender.FEMALE),
            new Person("Nancy", Gender.FEMALE),
            new Person("Hafsatu", Gender.FEMALE),
            new Person("Alex", Gender.MALE)
        );

        /*
        * Imperative approach to find FEMALES in the list
        * */
        System.out.println("[IMPERATIVE]");
        List<Person> females = new ArrayList<>();

        for(Person person : people){
            if(Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female : females){
            System.out.println("[FEMALE] -> " + female.toString());
        }

        /*
         * Imperative approach to find MALES in the list
         * */

        List<Person> Males = new ArrayList<>();

        for(Person person: people){
            if(Gender.MALE.equals(person.gender)){
                Males.add(person);
            }
        }

        for(Person male : Males){
            System.out.println("[MALE] -> " + male.toString());
        }

        /*
         * Using Declarative Approach to get FEMALES in the list
         * */

        System.out.println("[DECLARATIVE]");
        System.out.println("===========MALE LIST==========");
        people.stream()
                .filter(person -> Gender.MALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("===========FEMALE LIST==========");
        people.stream().filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
