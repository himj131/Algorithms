package hi.mj.algorithms.programers.greedy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42883
 * <p>
 * 어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.
 * <p>
 * 예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.
 * <p>
 * 문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.
 * <p>
 * 제한 조건
 * number는 1자리 이상, 1,000,000자리 이하인 숫자입니다.
 * k는 1 이상 number의 자릿수 미만인 자연수입니다.
 * <p>
 * 입출력 예
 * number	    k	return
 * "1924"	    2	"94"
 * "1231234"	3	"3234"
 * "4177252841" 4	"775841"
 */

public class BiggestNumber {
    public String solution(String number, int k) {
        List<Integer> numbers = createNumberList(number);
        StringBuilder answer = new StringBuilder();
        while (answer.length() < number.length()- k) {
            int index = 0;
            int big = numbers.get(0);
            for (int i = 0; i < k; i++) {
                if (big < numbers.get(i)) {
                    big = numbers.get(i);
                    index = i;
                }
            }
            answer.append(big);
            numbers = numbers.subList(index+1, numbers.size());
        }
        return answer.toString();
    }

    private List<Integer> createNumberList(String number) {
        return Arrays.stream(number.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
