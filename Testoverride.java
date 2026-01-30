
class Testoverride {
    public static void main(String[] agrs)
    {
        Dog dog= new Dog();
        System.out.println("Dog Type "+dog.species);
        System.out.println("Dog Color "+dog.color);
        dog.eat();
        dog.Sound();

        Lion lion =new Lion();
        lion.eat();
        lion.Sound();
    }
}