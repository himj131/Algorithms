package hi.mj.algorithms.programers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 *  * 제한사항
 *  * 갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
 *  * 노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
 *  * 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
 *
 * 입출력 예
 * brown	yellow	return
 * 10	    2	    [4, 3]
 * 8	    1	    [3, 3]
 * 24	    24	    [8, 6]
 *
 */
class BPCarpetTest {
    private BPCarpet bpCarpet = new BPCarpet();

    @Test
    void test1() {
        int[] solution = bpCarpet.solution(10, 2);
        assertThat(solution).isEqualTo(new int[]{4, 3});
    }

    @Test
    void test2() {
        int[] solution = bpCarpet.solution(8, 1);
        assertThat(solution).isEqualTo(new int[]{3, 3});
    }

    @Test
    void test3() {
        int[] solution = bpCarpet.solution(24, 24);
        assertThat(solution).isEqualTo(new int[]{8, 6});
    }
}