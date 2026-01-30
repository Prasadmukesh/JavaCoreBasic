public class Shivani {
    final int Age=20;  //final variable

    public final void Message()    // final method
    {
        System.out.println("Hi I am "+Age+"Years old.");
        System.out.println("Hello India Very Good Morning!");
    }
    final void Fun()
    {
        System.out.println("Hello I am Shivani");
    }
}
class Akhilesh extends Shivani
{
    int myage=19;
    public void AkMessage()
    {
        super.Fun();
        super.Message();
        System.out.println("Hi I am "+myage+"Years Old");
        System.out.println("Hello World Very Good Morning!");

    }


}


