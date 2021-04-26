package hi.mj.algorithms.programers.ordering;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 *
 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
 * 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
 * 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한 사항
 * numbers의 길이는 1 이상 100,000 이하입니다.
 * numbers의 원소는 0 이상 1,000 이하입니다.
 * 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
 *
 * 입출력 예
 * numbers	            return
 * [6, 10, 2]	        "6210"
 * [3, 30, 34, 5, 9]	"9534330"
 *
 **/
public class MaxNumber {
    public String solution(int[] numbers) {
        List<String> strings = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted(sorting())
                .collect(Collectors.toList());

        if(strings.get(0).equals("0")) {
            return "0";
        }

        return String.join("", strings);
//        int[] ordered = new int[]{};
//        for(int i = 0; i < numbers.length - 1; i++) {
//            int firstDigit = Integer.parseInt(String.valueOf(numbers[i]).substring(0, 1));
//            int firstDigit2 = Integer.parseInt(String.valueOf(numbers[i+1]).substring(0, 1));
//            if(firstDigit > firstDigit2) {
//                ordered[i] = firstDigit;
//                ordered[i+1] = firstDigit2;
//            } else {
//                ordered[i] = firstDigit;
//                ordered[i+1] = firstDigit2;
//            }
//
//        }
//        String answer = "";
//        return answer;
        
    }

    private Comparator<String> sorting() {
        Comparator<String> compare = (first, second) -> (second + first).compareTo(first + second);
        return compare;
    }

//    private int comparingNums(int num1, int num2) {
//        Comparator comparator = new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//        }
//    }
}
