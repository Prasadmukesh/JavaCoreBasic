import java.util.Scanner;

/**
 * InnerParth
 */

class InnerParth {

    void Hello() {
        System.out.println("Hello manan");
    }

}

class Parth {

    void myfun() {
        Scanner sc = new Scanner(System.in);
        String name;
        int age = 19;
        double marks = 79.99;
        char gender = 'M';

        System.out.println("Enter name :");
        name = sc.nextLine();
        System.out.println("Hello Mr." + name);
        System.out.println("Age " + age);
        System.out.println("Marks " + marks);
        System.out.println("Gender " + gender);
    }

    public static void main(String args[]) {

        Parth p1 = new Parth();
        p1.myfun();
        InnerParth ip = new InnerParth();
        ip.Hello();

    }

}
