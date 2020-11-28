package algorithm.chapter4;

import com.google.common.collect.Maps;

import java.util.Map;

public class Fibonacci {

    private Map<Integer, Integer> memo = Maps.newConcurrentMap();

    public int calculate(int N) {
        if (N == 0) return 0;
        else if (N == 1) return 1;

        return calculate(N - 1) + calculate(N - 2);
    }

    public int calculateByMemoized(int N) {
        if (N == 0) return 0;
        else if (N == 1) return 1;

        Integer cache = memo.get(N);
        if (cache != null) {
            return cache;
        }
        var result = calculateByMemoized(N - 1) + calculateByMemoized(N - 2);
        memo.putIfAbsent(N, result);
        return result;
    }
}
