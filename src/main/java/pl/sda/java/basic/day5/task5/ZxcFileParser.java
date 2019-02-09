package pl.sda.java.basic.day5.task5;

public class ZxcFileParser implements FileParser {
    @Override
    public String name() {
        return "ZxcFileParser";
    }

    @Override
    public boolean validFormat(String filename) {
        return filename.endsWith(".zxc");
    }
}
