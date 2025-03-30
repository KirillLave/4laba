package Part2;

import Part2ifaces.FuncOnInterval;
import Part2ifaces.Functional;

public class SumWithLimits<T extends FuncOnInterval> implements Functional<T> {

    @Override
    public double result(T func) {
        return func.solution(func.getUpLimit()) +
                func.solution(func.getLowLimit()) +
                func.solution(((func.getLowLimit() + func.getUpLimit())/2));
    }
}