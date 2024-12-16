public class MainOverload {
    public static void main(Integer intvalue)
{
    int total=(intvalue++) + (--intvalue) + (intvalue) + (intvalue--);
    System.out.println("Total :"+total);
}
public static String main(String args )
{
    

    main(2);
    System.out.println(
         
        main("Cloud")+" "+main("Rain");
        main(4);
    );
   


}
}
