package hi.mj.algorithms.naverwebtoon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringPieceTest {
    StringPiece sp = new StringPiece();

    @Test
    void test1() {
        String[] results = sp.solution("abcxyasdfasdfxyabc");
        assertThat(results).isEqualTo(new String[]{"abc","xy","asdf","asdf","xy","abc"});

    }

    @Test
    void test2() {
        String[] results = sp.solution("abcxyqwertyxyabc");
        assertThat(results).isEqualTo(new String[]{"abc","xy","qwerty","xy","abc"});
    }

    @Test
    void test3() {
        String[] results = sp.solution("abcabcabcabc");
        assertThat(results).isEqualTo(new String[]{"abc","abc","abc","abc"});
    }

    @Test
    void test4() {
        String[] results = sp.solution("llttaattll");
        assertThat(results).isEqualTo(new String[]{"l","l","t","t","a","a","t","t","l","l"});
    }

    @Test
    void test5() {
        String[] results = sp.solution("zzzzzz");
        assertThat(results).isEqualTo(new String[]{"z","z","z","z","z","z"});
    }

    @Test
    void test6() {
        String[] results = sp.solution("abcdef");
        assertThat(results).isEqualTo(new String[]{"abcdef"});
    }
}