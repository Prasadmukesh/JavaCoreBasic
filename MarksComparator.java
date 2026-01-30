import java.util.Comparator;

// Sort by marks
class MarksComparator implements Comparator<Studentdemo> {
    @Override
    public int compare(Studentdemo s1, Studentdemo s2) {
        return Double.compare(s1.getMarks(), s2.getMarks());
    }
}