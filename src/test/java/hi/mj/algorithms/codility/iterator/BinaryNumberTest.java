package hi.mj.algorithms.codility.iterator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryNumberTest {
    private BinaryNumber binaryNumber;

    @Test
    void test32() {
        binaryNumber = new BinaryNumber(32);
        int result = binaryNumber.maxBinaryGap();
        assertThat(result).isEqualTo(0);
    }

    @Test
    void test1041() {
        binaryNumber = new BinaryNumber(1041);
        int result = binaryNumber.maxBinaryGap();
        assertThat(result).isEqualTo(5);
    }
}