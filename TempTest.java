public class TempTest {
    void Sayhello(String name)
    {
        System.out.println("Hello Mr."+name);
    }
    public static void main(String[] args) {
        System.out.println("Hello Java");
        int a=900,b=1000;

        int c=a+b;
        System.out.println("Sum is "+c);
        TempTest t1= new TempTest();
        t1.Sayhello("Lucky");

        for(int k=1;k<=100;k++)
        {
            System.out.println(k+"Hello java");
        }

    }
}
