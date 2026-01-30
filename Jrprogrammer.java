class Jrprogrammer extends Programmer {
    String department="Dev";
    String email="";
    String SkillLevel=" ";

    void GetJrPro_Details(String email, String SkillLevel)
    {
        this.email=email;
        this.SkillLevel=SkillLevel;
    } 
    public static void main(String[] args) {
        Jrprogrammer p2=new Jrprogrammer();
        p2.Getemployee();
        p2.GetJrPro_Details("akhil@gmail.com", "Fresher");
        p2.Show();
        System.out.println("Department "+p2.department);
        System.out.println("Email "+p2.email);
        System.out.println("Skill Level "+p2.SkillLevel);

    }
    
}
