public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 5);
        int b = calc.minus.apply(3, 1);
        int c = calc.multyply.apply(a, b);
        calc.println.accept(c);
        int d = calc.devide.apply(a, b);
        calc.println.accept(d);

        int e = calc.pow.apply(6);
        calc.println.accept(e);
        calc.println.accept(calc.abs.apply(-6));

        boolean f = calc.isPositive.test(2);
        System.out.println(f);

        int g = calc.devide.apply(5, 0);
        calc.println.accept(g);
    }
}