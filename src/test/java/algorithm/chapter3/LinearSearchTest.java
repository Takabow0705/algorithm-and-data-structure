package algorithm.chapter3;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.*;

import java.util.List;

class LinearSearchTest {

    private LinearSearch linearSearch;

    @BeforeEach
    public void init(){
        this.linearSearch = new LinearSearch();
    }

    /**
     * Code3.1のテストケース
     */
    @Nested
    class Code3_1{

        @Test
        @DisplayName("Code3.1でYESを返すパターン")
        public void testCode3_1_1(){
            var N = List.of(4, 3, 12, 7, 11);
            var v = 7;
            Assertions.assertEquals("YES", linearSearch.searchValue(N, v));
        }

        @Test
        @DisplayName("Code3.1でNOを返すパターン")
        public void testCode3_1_2(){
            var N = List.of(4, 3, 12, 8, 11);
            var v = 7;
            Assertions.assertEquals("NO", linearSearch.searchValue(N, v));
        }
    }

    /**
     * Code3.2のテストケース
     */
    @Nested
    class Code3_2{
        @Test
        @DisplayName("Code3.2でindexを返すパターン")
        public void testCode3_2_1(){
            var N = List.of(4, 3, 12, 7, 11);
            var v = 7;
            Assertions.assertEquals(3, linearSearch.searchValueIndex(N, v));
        }

        @Test
        @DisplayName("Code3.2で-1を返すパターン")
        public void testCode3_2_2(){
            var N = List.of(4, 3, 12, 8, 11);
            var v = 7;
            Assertions.assertEquals(-1, linearSearch.searchValueIndex(N, v));
        }
    }
    /**
     * Code3.3のテストケース
     */
    @Nested
    class Code3_3{
        @Test
        @DisplayName("Code3.3で最小値を返すパターン")
        public void testCode3_3_1(){
            var N = List.of(4, 3, 12, 7, 11);
            Assertions.assertEquals(3, linearSearch.getMinimumValue(N));
        }
    }
}