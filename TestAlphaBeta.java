interface Alpha
{
    void hello();
    void Sayhello();
}
interface Beta extends Alpha
{
    void Add();
    void Cal();

    
}
class TestAlphaBeta implements Beta
{
  public void hello()
  {
    System.out.println("Hello Java ");
  }
  public void Sayhello()
  {
    System.out.println("Welcome to Java ");
  }
  public void Add()
  {
    int a=90,b=67;
    System.out.println("Sum is "+(a+b));
  }
  public void Cal()
  {
    System.out.println("Calculating something");
  }
  public static void main(String[] args) {
    TestAlphaBeta t1= new TestAlphaBeta();
    t1.Add();
  }
}