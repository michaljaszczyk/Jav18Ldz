package pl.sda.java.basic.day8.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaExample {

    // zwraca lambdę, która będzie podnosić podany argument do potęgi
    public Function<Integer,Integer> power() {
        return x -> x * x;
    }

    // zwraca lambdę, która będzie sumować podane parametry
    public BiFunction<Integer,Integer,Integer> add() {
        return (x, y) -> x + y;
    }

}
