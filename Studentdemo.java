public class Studentdemo implements Comparable<Studentdemo> {
    private int rollNumber;
    private String name;
    private double marks;

    public Studentdemo(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Natural order: by roll number
    @Override
    public int compareTo(Studentdemo other) {
        return Integer.compare(this.rollNumber, other.rollNumber);
    }

    @Override
    public String toString() {
        return rollNumber + " - " + name + " - " + marks;
    }
}
