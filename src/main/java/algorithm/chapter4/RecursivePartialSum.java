package algorithm.chapter4;

import java.util.List;

public class RecursivePartialSum {

    public String searchPartialSum(List<Integer> a, int W) {
        return isMatch(a.size(), W, a) ? "YES" : "NO";
    }

    private boolean isMatch(int i, int w, List<Integer> a) {
        // ベースケース
        if (i == 0) {
            if (w == 0) {
                return true;
            } else {
                return false;
            }
        }

        // a[i-1]を選ばない場合
        if (isMatch(i - 1, w, a)) {
            return true;
        }

        // a[i-1]を選ぶ場合
        if (isMatch(i - 1, w - a.get(i - 1), a)) {
            return true;
        }

        return false;
    }
}
