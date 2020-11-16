package algorithm.chapter4;

import org.junit.jupiter.api.*;

import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveFunctionTest {

    private RecursiveFunction recursiveFunction;

    @BeforeEach
    public void init(){
        this.recursiveFunction = new RecursiveFunction();
    }

    @Nested
    class Code_4_2{
        @Test
        @DisplayName("引数が0の場合")
        public void Code_4_2_1(){
            Assertions.assertEquals(0, recursiveFunction.sum(0));
        }

        @Test
        @DisplayName("引数が10の場合")
        public void Code_4_2_2(){
            Assertions.assertEquals(55, recursiveFunction.sum(10));
        }
    }
}