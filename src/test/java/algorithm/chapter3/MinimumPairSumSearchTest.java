package algorithm.chapter3;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumPairSumSearchTest {

    private MinimumPairSumSearch minimumPairSumSearch;

    @BeforeEach
    public void init() {
        this.minimumPairSumSearch = new MinimumPairSumSearch();
    }

    @Nested
    class Code_3_4 {
        @Test
        @DisplayName("Code3.4で12を返すパターン")
        public void testCode3_1_1() {
            var a = List.of(8, 5, 4);
            var b = List.of(1, 4, 9);
            var K = 10;
            Assertions.assertEquals(12, minimumPairSumSearch.searchMinimumSumPair(a, b, K));
        }
    }
}