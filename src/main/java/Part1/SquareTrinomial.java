package Part1;

import java.util.Objects;

public class SquareTrinomial {
    private final double a;
    private final double b;
    private final double c;

    public SquareTrinomial(double c1, double c2, double c3){
        a = c1;
        b = c2;
        c = c3;
    }

    public double[] SolutionOfSquareTrinomial(){
        double[] massiv;
        double des = b*b - (4 * a * c);
        if(a == 0){
            massiv = new double[]{-c/b};
        }
        else {
            if (des > 0) {
                double x1 = (-b - Math.sqrt(des)) / (2 * a);
                double x2 = (-b + Math.sqrt(des)) / (2 * a);
                massiv = new double[]{x1, x2};
            } else if (des == 0) {
                massiv = new double[]{-b / (2 * a)};
            } else {
                massiv = new double[]{};
            }
        }
        return massiv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SquareTrinomial that = (SquareTrinomial) o;
        return Double.compare(a, that.a) == 0 && Double.compare(b, that.b) == 0 && Double.compare(c, that.c) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }

    @Override
    public String toString() {
        return "SquareTrinomial{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

