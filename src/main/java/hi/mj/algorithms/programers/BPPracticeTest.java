package hi.mj.algorithms.programers;

import java.util.HashMap;
import java.util.Map;

/**
 * 완전탐색 > 모의고사
 * https://programmers.co.kr/learn/courses/30/lessons/42840
 *
 * 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 *
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 *
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 */
public class BPPracticeTest {

    public int[] solution(int[] input) {
        int[] firstAnswer = {1, 2, 3, 4, 5} ;
        int[] secondAnswer = {2, 1, 2, 3, 2, 4, 2, 5} ;
        int[] thirdAnswer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5} ;

        int firstResults = matchAnswers(input, firstAnswer);
        int secondResults = matchAnswers(input, secondAnswer);
        int thirdResults = matchAnswers(input, thirdAnswer);

        Map<Integer, Integer> map= new HashMap<>();

        map.put(1, firstResults);
        map.put(2, secondResults);
        map.put(3, thirdResults);

        return map.entrySet().stream()
                .filter(it -> it.getValue() > 0)
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
//                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
//                .sorted(Map.Entry.comparingByKey())
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }

    private int matchAnswers(int[] answers, int[] stuAnswers) {
        int matchCount = 0;
        int iteratorSize = stuAnswers.length;
        for(int i = 0; i < answers.length; i++) {
            int answer =  stuAnswers[i%iteratorSize];
            if(answer == answers[i]) matchCount++;
        }
        return matchCount;
    }
}
