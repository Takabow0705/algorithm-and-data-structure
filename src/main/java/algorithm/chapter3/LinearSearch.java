package algorithm.chapter3;

import java.util.List;

/**
 * 第三章のCode3.1 ~ Code3.3の実装
 */
public class LinearSearch {

    /**
     * Code3.1のアルゴリズム
     *
     * @param N
     * @param v
     * @return
     */
    public String searchValue(List<Integer> N, int v) {
        boolean exist = false;

        for (Integer i = 0; i < N.size(); i++) {
            if (N.get(i).equals(v)) {
                exist = true;
            }
        }
        return exist? "YES" : "NO";
    }

    /**
     * Code3.2のアルゴリズム
     *
     * @param N
     * @param v
     * @return
     */
    public Integer searchValueIndex(List<Integer> N, int v){
        int foundIndex = -1;
        for(Integer i = 0; i < N.size(); i++){
            if(N.get(i).equals(v)){
                foundIndex = i;
                return foundIndex;
            }
        }
        return foundIndex;
    }

    public Integer getMinimumValue(List<Integer> N){
        int minValue = 1000000000;
        for (Integer i = 0; i < N.size(); i++){
            if(N.get(i) < minValue){
                minValue = N.get(i);
            }
        }
        return minValue;
    }
}
