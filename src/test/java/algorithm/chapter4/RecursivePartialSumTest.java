package algorithm.chapter4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;


class RecursivePartialSumTest {
    private RecursivePartialSum partialSum;

    @BeforeEach
    public void init() {
        this.partialSum = new RecursivePartialSum();
    }

    @Test
    @DisplayName("Code4.9の正常系を確認。")
    public void testCode4_9_1() {
        var a = List.of(1, 2, 4, 5, 11);
        var W = 10;
        Assertions.assertEquals("YES", this.partialSum.searchPartialSum(a, W));
    }

    @Test
    @DisplayName("Code4.9の正常系を確認。")
    public void testCode4_9_2() {
        var a = List.of(3, 2, 6, 5);
        var W = 14;
        Assertions.assertEquals("YES", this.partialSum.searchPartialSum(a, W));
    }
}