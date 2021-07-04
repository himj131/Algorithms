package hi.mj.algorithms.realtest.eleven;

/**
 *  두줄 바꾸기
 *  오류 찾기 (1부터 K까지 수가 모두 배열 A안에 속해 있는지 판단하는 로직)
 *
 * public boolean solution(int[] A, int K) {
 *         int n = A.length;
 *         for (int i = 0; i < n - 1; i++) {
 *             if (A[i] + 1 < A[i + 1])
 *                 return false;
 *         }
 *         if (A[0] != 1 && A[n - 1] != K)
 *             return false;
 *         else
 *             return true;
 *     }
 * */
class Task2 {
    public boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        if (A[0] != 1 || A[n - 1] != K)
            return false;
        else
            return true;
    }
}