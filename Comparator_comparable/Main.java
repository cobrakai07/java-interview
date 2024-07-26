package Comparator_comparable;
import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
     public String toString(){
         return "[ "+this.name+", "+this.age+" ]";
     }

    @Override
    public int compareTo(Person other) {
        return this.age - other.age;

    }
    
}

class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Sorting by age (natural order)
        Collections.sort(people);
        System.out.println("Sorted by age: " + people);

        // Sorting by name (using Comparator)
        Collections.sort(people,new PersonNameComparator());

        System.out.println("Sorted by name: " + people);
    }
}
