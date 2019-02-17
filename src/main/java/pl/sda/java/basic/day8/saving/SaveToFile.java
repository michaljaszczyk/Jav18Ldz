package pl.sda.java.basic.day8.saving;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SaveToFile {
    public void save(Path path, List<String> lines) throws IOException {
        // dopisuje tekst na końcu pliku, zachowując orginalną treść
//        Files.write(path, lines, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        //
//        Files.write(path, lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
//        Files.write(path, lines); // to samo co wyżej
        Files.write(path, lines, StandardCharsets.UTF_8); // możemy określić kooowanie pliku

        // zapisywanie tablicy bajtów do pliku
//        String string = "Hello world";
//        Files.write(path, string.getBytes());
    }
}
