package Part2;

import Part2ifaces.FuncOnInterval;

import java.util.Objects;

public class LinealFunc implements FuncOnInterval {
    private final double A;
    private final double B;
    private final double UpLimit;
    private final double LowLimit;

    public LinealFunc(double a, double b, double Lowlimit, double UpLimit){
        A = a;
        B = b;
        this.LowLimit = Lowlimit;
        this.UpLimit = UpLimit;
    }

    @Override
    public double getUpLimit(){
        return UpLimit;
    }

    @Override
    public double getLowLimit(){
        return LowLimit;
    }

    @Override
    public double solution(double x) {
        return x * A + B;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinealFunc that = (LinealFunc) o;
        return Double.compare(A, that.A) == 0 && Double.compare(B, that.B) == 0 && Double.compare(UpLimit, that.UpLimit) == 0 && Double.compare(LowLimit, that.LowLimit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(A, B, UpLimit, LowLimit);
    }

    @Override
    public String toString() {
        return "LinealFunc{" +
                "A=" + A +
                ", B=" + B +
                ", UpLimit=" + UpLimit +
                ", LowLimit=" + LowLimit +
                '}';
    }
}

