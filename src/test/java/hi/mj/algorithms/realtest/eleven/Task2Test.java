package hi.mj.algorithms.realtest.eleven;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.in;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    Task2 task2 = new Task2();

    @Test
    void test1() {
        boolean solution = task2.solution(new int[]{1, 1, 2, 3, 3}, 3);
        assertThat(solution).isTrue();
    }

    @Test
    void test2() {
        boolean solution = task2.solution(new int[]{1, 1, 3}, 2);
        assertThat(solution).isFalse();
    }

    @Test
    @Deprecated
    void test3() {
        int[] input = new int[]{1, 1, 3};
        System.out.println(input.length);
    }
}