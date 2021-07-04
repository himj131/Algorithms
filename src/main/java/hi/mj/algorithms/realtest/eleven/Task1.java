package hi.mj.algorithms.realtest.eleven;

public class Task1 {
    public int solution(int N) {
        int digitSum = digitSum(N);
        int nextNum = N + 1;
        int nextNumDigitSum = digitSum(nextNum);

        while (digitSum != nextNumDigitSum) {
            nextNum ++;
            nextNumDigitSum = digitSum(nextNum);
        }

        return nextNum;
    }

    private static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n = n / 10;
        }
        return sum;
    }
}
