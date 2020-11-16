package algorithm.chapter4;

import java.util.List;

public class RecursiveFunction {

    public Integer sum(Integer n){
        if(n == 0) return 0;

        int result = n + sum(n-1);
        return result;
    }
}
