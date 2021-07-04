package hi.mj.algorithms.naverwebtoon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class DiscountTest {
    private Discount discount = new Discount();

    @Test
    void test1() {
        int result = discount.solution(new int[]{13000, 88000, 10000},	new int[]{30, 20});
        assertThat(result).isEqualTo(82000);
    }
}