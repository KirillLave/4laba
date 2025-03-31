package Part2;

import Part2ifaces.FuncOnInterval;

import java.util.Objects;

public class ExpFunc implements FuncOnInterval {
    private final double A;
    private final double B;
    private final double UpLimit;
    private final double LowLimit;

    public ExpFunc(double a, double b, double Lowlimit, double UpLimit){
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
        return A * Math.exp(x) + B;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ExpFunc expFunc = (ExpFunc) o;
        return Double.compare(A, expFunc.A) == 0 && Double.compare(B, expFunc.B) == 0 && Double.compare(UpLimit, expFunc.UpLimit) == 0 && Double.compare(LowLimit, expFunc.LowLimit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(A, B, UpLimit, LowLimit);
    }

    @Override
    public String toString() {
        return "ExpFunc{" +
                "A=" + A +
                ", B=" + B +
                ", UpLimit=" + UpLimit +
                ", LowLimit=" + LowLimit +
                '}';
    }
}

