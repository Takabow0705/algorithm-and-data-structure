package algorithm.chapter4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    public void init() {
        this.fibonacci = new Fibonacci();
    }

    @Test
    public void Code_4_5_1() {
        Assertions.assertEquals(0, fibonacci.calculate(0));
    }

    @Test
    public void Code_4_5_2() {
        Assertions.assertEquals(1, fibonacci.calculate(1));
    }

    @Test
    public void Code_4_5_3() {
        Assertions.assertEquals(1, fibonacci.calculate(2));
    }

    @Test
    public void Code_4_8_1() {
        Assertions.assertEquals(0, fibonacci.calculateByMemoized(0));
    }

    @Test
    public void Code_4_8_2() {
        Assertions.assertEquals(1, fibonacci.calculateByMemoized(1));
    }

    @Test
    public void Code_4_8_3() {
        Assertions.assertEquals(1, fibonacci.calculateByMemoized(2));
    }
}