import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multyply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y == 0) throw new ArithmeticException("Делить на ноль нельзя!");
        return x / y;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> (x > 0) ? (x) : (x * (-1));

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Object> println = System.out::println;
}

