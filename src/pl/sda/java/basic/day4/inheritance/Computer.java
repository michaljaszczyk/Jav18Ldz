package pl.sda.java.basic.day4.inheritance;

public class Computer {
    private String processorName;
    private int ram;
    private int diskSizeInGb;

    public Computer(String processorName, int ram, int diskSizeInGb) {
        this.processorName = processorName;
        this.ram = ram;
        this.diskSizeInGb = diskSizeInGb;
    }

    public boolean powerOn() {
        if (diskSizeInGb > 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getProcessorName() {
        return processorName;
    }

    public int getRam() {
        return ram;
    }

    public int getDiskSizeInGb() {
        return diskSizeInGb;
    }
}
