package hi.mj.algorithms.programers.heap;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42626
 *
 * 매운 것을 좋아하는 Leo는 모든 음식의 스코빌 지수를 K 이상으로 만들고 싶습니다.
 * 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 Leo는 스코빌 지수가 가장 낮은 두 개의 음식을 아래와 같이 특별한 방법으로 섞어 새로운 음식을 만듭니다.
 *
 * 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
 * Leo는 모든 음식의 스코빌 지수가 K 이상이 될 때까지 반복하여 섞습니다.
 * Leo가 가진 음식의 스코빌 지수를 담은 배열 scoville과 원하는 스코빌 지수 K가 주어질 때, 모든 음식의 스코빌 지수를 K 이상으로 만들기 위해 섞어야 하는 최소 횟수를 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한 사항
 * scoville의 길이는 2 이상 1,000,000 이하입니다.
 * K는 0 이상 1,000,000,000 이하입니다.
 * scoville의 원소는 각각 0 이상 1,000,000 이하입니다.
 *  * 모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.
 *
 * */
public class Spicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Scoville sco = new Scoville(scoville);

        while (!sco.allGreaterThanIndex(K)) {
            sco = sco.nextSco();
            answer++;
        }
        return answer == 0 ? -1 : answer;
    }

}
class Scoville {
    private List<Integer> scoville;
    private ScovillIndex scovilleIndex;

    public Scoville(int[] scoville) {
        this.scoville = Arrays.stream(scoville).boxed().sorted().collect(Collectors.toList());
        this.scovilleIndex = new ScovillIndex(scoville);
    }

    public Scoville(List<Integer> scoville) {
        this.scoville = scoville.stream().sorted().collect(Collectors.toList());
        this.scovilleIndex = new ScovillIndex(scoville);
    }

    public Scoville nextSco() {
        List<Integer> newSco = scoville.subList(2, scoville.size());
        newSco.add(scovilleIndex.intValue());
        return new Scoville(newSco);
    }

    public boolean allGreaterThanIndex(int k) {
        return scoville.stream()
                .allMatch(it -> it >= k);
    }
}

class ScovillIndex {
    private int scovilleIndex;

    public ScovillIndex(int[] scoville) {
        int[] ordered = Arrays.stream(scoville)
                .sorted()
                .toArray();
        this.scovilleIndex = ordered[0] + (ordered[1] * 2);
    }

    public ScovillIndex(List<Integer> scoville) {
        List<Integer> ordered = scoville.stream()
                .sorted().collect(Collectors.toList());
        this.scovilleIndex = ordered.get(0) + (ordered.get(1) * 2);
    }

    public ScovillIndex(int i) {
        this.scovilleIndex = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScovillIndex that = (ScovillIndex) o;
        return scovilleIndex == that.scovilleIndex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(scovilleIndex);
    }

    public int intValue() {
        return scovilleIndex;
    }
}

