package algorithm.chapter3;

import java.util.List;

public class PartialSum {

    public String searchPartialSum(List<Integer> a, int W){
        boolean exist = false;
        int N = a.size();
        for(int bit = 0; bit < (1 << N); bit++){
            int sum = 0;
            for (int i = 0; i < N; i++){
                if((bit & 1 << i) != 0) {
                    sum += a.get(i);
                }
            }
            if(sum == W) { exist = true; };
        }
        return exist ? "YES" : "NO";
    }
}
