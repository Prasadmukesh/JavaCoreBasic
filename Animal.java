 class Animal {
    public String color="White";

    public Animal()
    {
        System.out.println("Animal Class Constructor..");
    }
    public void eat()
    {
        System.out.println("Animal eats something..");
    }
    public void Sound()
    {
        System.out.println("Animal has own sound..");
    }
}

class Dog extends Animal
{
    public String species="bull dog"; 
    public String color="brown-black";
    Dog()
    {
        super();
    }
   
    public void eat()
    {
        super.eat();
    
        System.out.println("dog Color is "+super.color);
        System.out.println("Dogs are eating milk and bread");
    }
    public void Sound()
    {
        System.out.println("dogs are Barking..");
    }
}

class Lion extends Animal
{
   String color="Dark Brown";
    public void eat()
    {
        System.out.println("Lions are eating fresh meat..");
    }
    public void Sound()
    {
        System.out.println("Lion are Rouaring....");
    }

}
