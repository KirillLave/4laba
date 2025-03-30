package Part2;

import Part2ifaces.FuncOnInterval;

import java.util.Objects;

public class RatioonalFrac implements FuncOnInterval {
    private final double A;
    private final double B;
    private final double C;
    private final double D;
    private final double UpLimit;
    private final double LowLimit;

    public RatioonalFrac(double a, double b, double c, double d, double Lowlimit, double UpLimit){
        A = a;
        B = b;
        C = c;
        D = d;
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
        return (A * x + B)/(C * x + D);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RatioonalFrac that = (RatioonalFrac) o;
        return Double.compare(A, that.A) == 0 && Double.compare(B, that.B) == 0 && Double.compare(C, that.C) == 0 && Double.compare(D, that.D) == 0 && Double.compare(UpLimit, that.UpLimit) == 0 && Double.compare(LowLimit, that.LowLimit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(A, B, C, D, UpLimit, LowLimit);
    }

    @Override
    public String toString() {
        return "RatioonalFrac{" +
                "A=" + A +
                ", B=" + B +
                ", C=" + C +
                ", D=" + D +
                ", UpLimit=" + UpLimit +
                ", LowLimit=" + LowLimit +
                '}';
    }
}

