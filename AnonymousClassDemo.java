abstract class Animal {
    abstract void makeSound();
}

class AnonymousClassDemo {
    public static void main(String[] args) {
        // Creating an anonymous class that extends Animal
        Animal myAnimal = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Anonymous class says: Roar!");
            }
        };

        myAnimal.makeSound();
    }
}
