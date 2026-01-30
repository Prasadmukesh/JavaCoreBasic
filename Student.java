

public class Student {
    int rollno;
    String name;
    Address address;   // Has -A relationship or aggregation
    DOB dob;           // Aggregation 

    public Student(int rollno,String name, Address address,DOB dob)
    {
        this.rollno=rollno;
        this.name=name;
        this.address=address;
        this.dob=dob;
    

    }

    public void Display()
    {
        System.out.println("Student Info");
        System.out.println(rollno+"\n"+name);
        System.out.println("Address "+address.addressline+" "+address.streetno+" "+address.city+" "+address.State+" "+address.Country+" "+address.Pin);
        System.out.println("Date Of Birth "+dob.Get_dob());

    }
    public static void main(String[] args)
    {
        Address adrss=new Address("145 Silkboard","D19","banglore","Karnatka","India","560088");
        DOB mydob=new DOB(12,"July",2003);
        Student s1=new Student(101,"Ajit Yadav",adrss,mydob);
        s1.Display();

        Address a1=new Address("Rohini", "09", "New Delhi", "Delhi", "India","110054");
        DOB d1=new DOB(24, "june", 2004);

        Student s2=new Student(101, "samarth", a1, d1);
        s2.Display();
        
    }



}
