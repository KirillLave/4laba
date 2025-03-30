package Part2;

import Part2ifaces.FuncOnInterval;

import java.util.Objects;

public class TrigonometricFunc implements FuncOnInterval {
    private final double A;
    private final double B;
    private final double UpLimit;
    private final double LowLimit;

    public TrigonometricFunc(double a, double b, double Lowlimit, double UpLimit){
        A = a;
        B = b;
        this.LowLimit = Lowlimit;
        this.UpLimit = UpLimit;
    }

    public double getUpLimit(){
        return UpLimit;
    }

    public double getLowLimit(){
        return LowLimit;
    }

    public double solution(double x) {
        return A * Math.sin(x * B);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrigonometricFunc that = (TrigonometricFunc) o;
        return Double.compare(A, that.A) == 0 && Double.compare(B, that.B) == 0 && Double.compare(UpLimit, that.UpLimit) == 0 && Double.compare(LowLimit, that.LowLimit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(A, B, UpLimit, LowLimit);
    }

    @Override
    public String toString() {
        return "TrigonometricFunc{" +
                "A=" + A +
                ", B=" + B +
                ", UpLimit=" + UpLimit +
                ", LowLimit=" + LowLimit +
                '}';
    }
}

