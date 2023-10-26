package seminar3;

import java.util.*;

public class Person implements Comparable<Person>, Iterable<Person> {
    private String name;
    private List<Person> people = new ArrayList<>();
    private int index = 0;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return this.name.compareTo(otherPerson.getName());
    }

    @Override
    public String toString() {
        return name;
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    @Override
    public Iterator<Person> iterator() {
        return new PersonIterator();
    }

    private class PersonIterator implements Iterator<Person> {
        @Override
        public boolean hasNext() {
            return index < people.size();
        }

        @Override
        public Person next() {
            if (hasNext()) {
                return people.get(index++);
            }
            return null;
        }
    }
    public static void main(String[] args) {
        Person person1 = new Person("Маргарита");
        Person person2 = new Person("Анна");
        Person person3 = new Person("Кристина");
        Person person4 = new Person("Мария");

        person1.addPerson(person1);
        person1.addPerson(person2);
        person1.addPerson(person3);
        person1.addPerson(person4);


        Collections.sort(person1.people);
        System.out.println("Сортировка по алфавиту: " + person1.people);

        Collections.sort(person1.people, new LengthOfNameComparator ());
        System.out.println("Сортировка по длине имени: " + person1.people);


        System.out.println("Перебор коллекции:");
        Iterator<Person> iterator = person1.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println("name - " + person.getName());
        }
    }
}

class LengthOfNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person pers1, Person pers2) {
        return pers1.getName().length() - pers2.getName().length();
    }
}
