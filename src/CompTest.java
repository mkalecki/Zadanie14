import java.util.*;

public class CompTest {

    public static void main(String[] args) {


        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer("Dell", 2000, 4));
        computers.add(new Computer("IBM", 8000, 8));
        computers.add(new Computer("IBM", 8000, 16));
        computers.add(new Computer("IBM", 4000, 32));
        computers.add(new Computer("Asus", 4000, 32));


        System.out.println(computers.toString());
        Collections.sort(computers);
        System.out.println("posortowane domyślnie po nazwie:");
        System.out.println(computers.toString());

        CpuComparator cpuComparator = new CpuComparator();
        Collections.sort(computers, cpuComparator);
        System.out.println("posortowane  po CPU:");
        System.out.println(computers.toString());

        RamComparator ramComparator = new RamComparator();
        Collections.sort(computers, ramComparator);
        System.out.println("posortowane  po RAM:");
        System.out.println(computers.toString());

        Computer[] compsArr = new Computer[computers.size()];
        compsArr = computers.toArray(compsArr);
        System.out.println("Tablica:");
        System.out.println(Arrays.toString(compsArr));

        Scanner scanner = new Scanner(System.in);
        System.out.println("po czym sortujemy tablicę?");
        System.out.println("ram, cpu, name");
        String decision = scanner.nextLine();
        if (decision.equals("ram")) {
            Arrays.sort(compsArr, ramComparator);
        } else if (decision.equals("cpu")) {
            Arrays.sort(compsArr, cpuComparator);
        } else if (decision.equals("ram")) {
            Arrays.sort(compsArr, ramComparator);
        } else if (decision.equals("name")) {
            NameComparator nameComparator = new NameComparator();
            Arrays.sort(compsArr, nameComparator);
        } else
            System.out.println("Nie ma takiej opcji");

        System.out.println(Arrays.toString(compsArr));


    }
}
