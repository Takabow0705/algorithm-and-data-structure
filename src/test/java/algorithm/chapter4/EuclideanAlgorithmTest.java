package algorithm.chapter4;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EuclideanAlgorithmTest {

    private EuclideanAlgorithm euclideanAlgorithm;

    @BeforeEach
    public void init() {
        this.euclideanAlgorithm = new EuclideanAlgorithm();
    }

    @Test
    @DisplayName("51と15の最大公約数を計算する(書籍の例)")
    public void Code_4_4_1(){
        Assertions.assertEquals(3, euclideanAlgorithm.execute(51, 15));
    }
}