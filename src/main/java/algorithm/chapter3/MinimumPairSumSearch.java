package algorithm.chapter3;

import java.util.List;

public class MinimumPairSumSearch {

    public Integer searchMinimumSumPair(List<Integer> a, List<Integer> b, Integer K){
        int minimumValue = 2000000;

        for(int i = 0; i < a.size(); i++){
            for(int j = 0; j < b.size(); j++){
                Integer pairSum = a.get(i) + b.get(j);
                if(pairSum >= K && pairSum < minimumValue){
                    minimumValue = pairSum;
                }

            }
        }
        return minimumValue;
    }
}
