package hi.mj.algorithms.quiz.rotate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/rotate-image/
 *
 * Input: matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}}
 * Output: {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}}
 *
 *Input: matrix = {{1}}
 * Output: {{1}}
 *
 * Input: matrix = {{1,2},{3,4}}
 * Output: {{3,1},{4,2}}
 *
 * Constraints:
 * matrix.length == n
 * matrix[i].length == n
 * 1 <= n <= 20
 * -1000 <= matrix[i][j] <= 1000
 *
 * */
class MatrixRotationTest {
    @Test
    void rotate() {
        int[][] input = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] output = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};
        assertThat(output).isEqualTo(rotate(input));
    }

    private int[][] rotate(int[][] matrix) {
        int[][] result = null;
        for(int i = 0; i < matrix.length; i++) {
//            for(int j = 0; i < matrix.length; i++) {
//                int first = matrix[i][j];
//                int second = matrix[i][j];
//            }


        }

        //matrix[0][0] -> matrix[0][3]
        //matrix[0][1] -> matrix[1][3]
        //matrix[0][2] -> matrix[2][3]
        //matrix[0][3] -> matrix[3][3]
        //matrix[0][0] -> matrix[0][3]
        //matrix[1][0] -> matrix[0][2]
        //matrix[1][2] -> matrix[2][3]
        //matrix[0][3] -> matrix[3][3]
        return result;
    }
}




















