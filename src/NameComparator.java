import java.util.Comparator;

public class NameComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer o1, Computer o2) {

        if (o1 == null && o2 == null)
            return 0;
        if (o1 == null && o2 != null)
            return -1;
        if (o1 != null && o2 == null)
            return 0;

        return o1.getName().compareTo(o2.getName());
    }
}
