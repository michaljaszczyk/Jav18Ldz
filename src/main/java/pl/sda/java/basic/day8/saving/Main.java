package pl.sda.java.basic.day8.saving;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // przygotowanie ścieżki do pliku wynikowego
        Path path = Paths.get("C:\\Programowanie\\saving\\test.txt");
        SaveToFile saveToFile = new SaveToFile();
        // przygotowanie zawartości do zapisania
        List<String> lines = new ArrayList<>();
        lines.add("Hello world");
        lines.add("Ala ma kota");
        lines.add("Lubię Javę");
        // zapisanie do pliku
        saveToFile.save(path, lines);
    }
}
