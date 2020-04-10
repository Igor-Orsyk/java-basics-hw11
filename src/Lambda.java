import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class Lambda {

    public static BiFunction<Double, Double, Double> getMax() {
        return (a, b) -> Stream.of(a, b)
                .max(Comparator.comparing(Double::doubleValue))
                .get();
    }

    public static Function<Double, Double> getSqrt() {
        return (a) -> Math.sqrt(a);
    }
}