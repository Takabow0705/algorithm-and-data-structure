package algorithm.chapter3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PartialSumTest {

    private PartialSum partialSum;

    @BeforeEach
    public void init(){
        this.partialSum = new PartialSum();
    }

    @Test
    @DisplayName("Code3.6の正常系を確認。")
    public void testCode3_6_1(){
        var a = List.of(1,2,4,5,11);
        var W = 10;
        Assertions.assertEquals("YES", this.partialSum.searchPartialSum(a, W));
    }
}