package hi.mj.algorithms.programers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BPPrimeNumberTest {

    private BPPrimeNumber bp;
    @BeforeEach
    void setUp() {
        bp = new BPPrimeNumber();
    }

    @Test
    void test1() {
        String input = "17";
        int expected = 2;
        int result = bp.solution(input);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        String input = "011";
        int expected = 2;
        int result = bp.solution(input);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void splitStringTest() {
        String input = "011";
        String[] numbers = input.split("");

        assertThat(numbers).isEqualTo(new String[]{"0","1","1"});
    }

    @Test
    void getAllPossibleNums() {
        Set<Integer> results = bp.createAllPossibleNums("011");

        assertThat(results).containsExactly(1, 11, 101, 10);
    }

    @Test
    void isPrimeNum() {
        int input = 101;
        assertTrue(bp.isPrimeNum(input));
    }

    @Test
    void isPrimeNum2() {
        int input = 10000001;
        assertTrue(bp.isPrimeNum(input));
    }

    @Test
    void isNotPrimeNum() {
        int input = 10;
        assertFalse(bp.isPrimeNum(input));
    }
}