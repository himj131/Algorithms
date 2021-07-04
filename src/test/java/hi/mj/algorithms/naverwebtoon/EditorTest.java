package hi.mj.algorithms.naverwebtoon;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EditorTest {
    Editor editor;

    @Test
    void test1() {
        editor =  new Editor("aabcbcd");
        editor.removeStr("abc");
        assertThat(editor.removeCnt()).isEqualTo(2);
    }

    @Test
    void test2() {
        editor =  new Editor("aaaaabbbbb");
        editor.removeStr("ab");
        assertThat(editor.removeCnt()).isEqualTo(5);
    }
}