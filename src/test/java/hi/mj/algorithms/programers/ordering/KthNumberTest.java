package hi.mj.algorithms.programers.ordering;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 입출력 예
 * array	                commands	                        return
 * [1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
 *
 * 입출력 예 설명
 * [1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
 * [1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
 * [1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
 *
 * */
class KthNumberTest {
    private KthNumber kthNumber = new KthNumber();

    @Test
    void test1() {
        int[] input = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] solution = kthNumber.solution(input, commands);

        assertThat(solution).isEqualTo(new int[]{5, 6, 3});
    }

    @Test
    void lenTest() {
        int[][] array = new int[3][4];
        assertThat(array.length).isEqualTo(3);
    }

    @Test
    void sliceArray() {
        int[] input = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[] ints = Arrays.copyOfRange(input, 2 - 1, 5);

        assertThat(ints).isEqualTo(new int[]{5, 2, 6, 3});
    }
}