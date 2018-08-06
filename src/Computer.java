public class Computer implements Comparable<Computer> {

    private String name;
    private double cpu;
    private double ram;

    public Computer(String name, double cpu, double ram) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }


    @Override
    public int compareTo(Computer o) {
//        if (this.cpu > o.cpu) {
//            return 1;
//        } else if (this.cpu == o.cpu) {
//            if (this.ram > o.ram) {
//                return 1;
//            } else if (this.ram == o.ram) {
                return this.name.compareTo(o.name);
//                if (this.name.compareTo(o.name) > 0) {
//                    return 1;
//                } else if (this.name.compareTo(o.name) == 0) {
//                    return 0;
//                } else {
//                    return -1;
//                }

//            } else {
//                return -1;
//            }
//
//        } else
//            return -1;
    }

    @Override
    public String toString() {
        return name +
                " cpu=" + cpu +
                " ram=" + ram + ", ";
    }
}
