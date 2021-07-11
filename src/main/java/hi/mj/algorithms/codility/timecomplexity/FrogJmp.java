package hi.mj.algorithms.codility.timecomplexity;

public class FrogJmp {
    private int position;
    private int destination;
    private int movableDistance;
    private int moveCnt = 0;

    public FrogJmp(int position, int destination, int movableDistance) {
        this.position = position;
        this.destination = destination;
        this.movableDistance = movableDistance;
    }

    public int jump() {
        moveCnt++;
        return position += movableDistance;
    }

    public boolean reachedDestination() {
        return position >= destination;
    }

    public int getMoveCnt() {
        return moveCnt;
    }


    public static class Solution {
        public int solution(int X, int Y, int D) {
            //case1
//            FrogJmp frog = new FrogJmp(X, Y, D);
//            while (!frog.reachedDestination()) {
//                frog.jump();
//            }
//
//            return frog.getMoveCnt();

           //case2
           int distance = D - X;
           return (distance % Y) == 0 ? (distance / Y) : (distance / Y)  + 1;
        }
    }
}
