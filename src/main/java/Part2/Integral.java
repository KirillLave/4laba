package Part2;

import Part2ifaces.FuncOnInterval;
import Part2ifaces.Functional;

import java.util.Objects;

public class Integral <T extends FuncOnInterval> implements Functional<T> {
    private final double upLimit;
    private final double lowLimit;

    public Integral(double lowLimit, double upLimit){
        this.upLimit = upLimit;
        this.lowLimit = lowLimit;
    }

    @Override
    public double result(T func){
        if(lowLimit > func.getUpLimit() || upLimit < func.getLowLimit()){
            throw new IllegalArgumentException("Illegal Range");
        }
        double integral = 0;
        for(double i = lowLimit; i <= upLimit; i += ((upLimit - lowLimit)/1000)){
            integral += func.solution(i) * ((upLimit - lowLimit)/1000);
        }
        return integral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Integral<?> integral = (Integral<?>) o;
        return Double.compare(upLimit, integral.upLimit) == 0 && Double.compare(lowLimit, integral.lowLimit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(upLimit, lowLimit);
    }

    @Override
    public String toString() {
        return "Integral{" +
                "upLimit=" + upLimit +
                ", lowLimit=" + lowLimit +
                '}';
    }
}
