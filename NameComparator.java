import java.util.Comparator;

// Sort by name
class NameComparator implements Comparator<Studentdemo> {
    @Override
    public int compare(Studentdemo s1, Studentdemo s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}


