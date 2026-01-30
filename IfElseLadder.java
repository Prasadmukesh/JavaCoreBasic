import java.util.Scanner;

class IfElseLadder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks(0-100)");
        int marks=sc.nextInt();
        String grade="";
        if(marks>90)
        {
            grade="A+";
        }
        else if(marks>80 && marks<=90)
        {
            grade="A";
        }
        else if(marks>70 && marks<=80)
        {
            grade="B+";

        }
        else if(marks>60 && marks<=70)
        {
            grade="B";
        }
        else if(marks>50 && marks<=60)
        {
            grade="C";
        }
        else
        {
            grade="F";
        }
        System.out.println("Your marks "+marks);
        System.out.println("Grade :"+grade);

        sc.close();

    }
    
}
