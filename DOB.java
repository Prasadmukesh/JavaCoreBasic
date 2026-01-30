public class DOB {
    int day;
    String month;
    int year;
    public DOB(int day,String month, int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public String Get_dob()
    {
        return (day+"-"+month+"-"+year);
    }

}
