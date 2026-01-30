public class Person {
    private String name;
    private int age;
   // private String city;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }

    // Override equals() and hashCode() for correct behavior in LinkedList methods
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        return this.name.equals(p.name) && this.age == p.age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
