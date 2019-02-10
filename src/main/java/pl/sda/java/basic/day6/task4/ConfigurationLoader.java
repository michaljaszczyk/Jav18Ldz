package pl.sda.java.basic.day6.task4;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigurationLoader {

    private static final Path DEFAULT_CONFIG_PATH =
            Paths.get("src", "main", "resources", "defaultConfig.txt");

    private List<String> config;
    private Map<String, String> configMap = new HashMap<>();

    public void load(Path path) {
        try {
            config = Files.readAllLines(path, Charset.defaultCharset()); // wczytujemy plik z podanej ścieżki
        } catch (IOException e) {
            try {
                config = Files.readAllLines(DEFAULT_CONFIG_PATH, Charset.defaultCharset()); // w przypadku niepowodzenia wczytujemy plik z domyślnej ścieżki, która powinna zawsze być poprawna
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

        for (String line : config) { // przetwarzamy każdą linię z pliku konfiguracyjnego
            line = line.trim(); // usuwa białe znaki na początku i końcu stringa (np. spacje)
            if (StringUtils.isNotBlank(line)) { // sprawdzamy czy linia nie składa się z samych białych znaków (spacje itd.)
                String[] keyValueArray = line.split("="); // dzielimy tą linię po separatorze "="
                configMap.put(keyValueArray[0], keyValueArray[1]); // dodajemy klucz i wartość do mapy
            }
        }
    }

    public List<String> getConfig() {
        return config;
    }

    public Map<String, String> getConfigMap() {
        return configMap;
    }
}
