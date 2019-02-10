package pl.sda.java.basic.day6.varargs;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("aa", "zz", "xx", "xx");
        VarargsExample varargsExample = new VarargsExample();
        varargsExample.fun(1);
        varargsExample.fun(1, 3);
        varargsExample.fun(1, 3, 7, 7, 3, 2); // możemy podać dowolną liczbę argumentów
        varargsExample.fun(); // możemy nie podawać żadnego argumentu
    }
}
