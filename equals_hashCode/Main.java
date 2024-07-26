package equals_hashCode;

import java.util.*;

class Person {
    String name;
    int age;
    int sal;

    public Person(String name, int age, int sal) {
        this.name = name;
        this.age = age;
        this.sal=sal;
    }
    
    @Override
     public String toString(){
         return "[ "+this.name+", "+this.age+", "+this.sal+" ]";
     }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && Objects.equals(sal,person.sal)&&Objects.equals(name, person.name);
    }
     
     @Override
    public int hashCode() {
        return Objects.hash(name, age, sal);
    }

}

public class Main{
    public static void main(String[] args){
        
        HashMap<Person,Integer>mp =new HashMap<>();
        Person p1= new Person("Ram", 21, 123);
        Person p2= new Person("Deep", 21,56);
        Person p3= new Person("Shayam", 22,45);
        Person p4= new Person("Ram", 21, 123);
        
        mp.put(p1,1);
        mp.put(p2,2);
        mp.put(p3,3);
        mp.put(p4,4);
        
        System.out.println(mp.get(p1));
    }
}
