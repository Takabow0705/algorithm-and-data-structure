package algorithm.chapter4;

/**
 * ユークリッドの互除法
 */
public class EuclideanAlgorithm {

    /**
     * ユークリッドの互除法を再帰関数で実装
     * @param m
     * @param n
     * @return
     */
    public Integer execute(int m, int n) {
        if (n == 0) return m;
        return execute(n, m % n);
    }
}
