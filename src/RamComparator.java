import java.util.Comparator;

public class RamComparator implements Comparator<Computer> {
    public int compare (Computer o1, Computer o2){
        if (o1 == null && o2 == null)
            return 0;
        if (o1 == null && o2 != null)
            return -1;
        if (o1 != null && o2 == null)
            return 0;

        if (o1.getRam() > o2.getRam()) return 1;
        else if (o1.getRam()==o2.getRam()) return 0;
        else return -1;
    }
}
