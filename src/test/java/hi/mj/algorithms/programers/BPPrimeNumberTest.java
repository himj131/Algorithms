package hi.mj.algorithms.programers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}