package hi.mj.algorithms.codility.iterator;

public class Iterator {
    public int solution(int N) {
        BinaryNumber binaryNumber = new BinaryNumber(N);

        return binaryNumber.maxBinaryGap();
    }
}
