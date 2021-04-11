package hi.mj.algorithms.leetcode;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * https://leetcode.com/problems/rotate-image/
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
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
        int lastIdx = matrix.length - 1;
        int length = matrix.length;

        Map<Integer, int[]> temp = new HashMap<>();
        for(int i = 0; i < length; i++) {
            int[] num = matrix[i].clone();
            temp.put(i, num);
        }

        for(int i = 0; i < length ; i++) {
            for(int j = 0; j < length ; j++) {
              matrix[j][lastIdx - i] = temp.get(i)[j];
            }
        }

        return matrix;
    }
}




















