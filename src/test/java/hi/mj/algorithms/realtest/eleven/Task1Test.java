package hi.mj.algorithms.realtest.eleven;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Task1Test {
    Task1 task = new Task1();

    @Test
    void test1() {
        int solution = task.solution(28);
        assertThat(solution).isEqualTo(37);
    }

    @Test
    void test2() {
        int solution = task.solution(734);
        assertThat(solution).isEqualTo(743);
    }

    @Test
    void test3() {
        int solution = task.solution(1990);
        assertThat(solution).isEqualTo(2089);
    }

    @Test
    void test4() {
        int solution = task.solution(1000);
        assertThat(solution).isEqualTo(10000);
    }

    @Test
    void test5() {
        int sumDigit = sumDigit(734);
        assertThat(sumDigit).isEqualTo(14);
    }

    private static int sumDigit(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n = n / 10;
        }
        return sum;
    }
}