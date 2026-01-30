 public class Programmer extends Employee {
    double bonus=10000.00;
    String Skill="Java";
    int age=33;
    public void Show()
    {
        Display();
        System.out.println("Age "+age+"\n"+"bonus "+bonus+"\n"+"Skill "+Skill+"\n");
        System.out.println("Net Salary Rs.:"+(basic+bonus));
    }

    
}
