package hi.mj.algorithms.programers;

import java.util.HashSet;
import java.util.Set;

/**
 * 완전탐색 > 소수찾기
 * 문제 설명
 * 한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
 *
 * 각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * numbers는 길이 1 이상 7 이하인 문자열입니다.
 * numbers는 0~9까지 숫자만으로 이루어져 있습니다.
 * "013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
 *
 * 입출력 예
 * numbers	return
 * "17"	3
 * "011"	2
 *
 * 입출력 예 설명
 * 예제 #1
 * [1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.
 *
 * 예제 #2
 * [0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.
 *
 * 11과 011은 같은 숫자로 취급합니다.
 *
 * */
public class BPPrimeNumber {

    public int solution(String numbers) {
        HashSet<Integer> set = new HashSet<>();
        permutation("", numbers, set);
        int count = 0;
        while(set.iterator().hasNext()){
            int a = set.iterator().next();
            set.remove(a);
            if(a==2) count++;
            if(a%2!=0 && isPrime(a)){
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=3; i<=(int)Math.sqrt(n); i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
    public void permutation(String prefix, String str, Set<Integer> set) {
        int n = str.length();
        if(!prefix.equals("")) set.add(Integer.valueOf(prefix));
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);
    }
    
    
/** (풀다만)나의 풀이 */
//    public int solution(String numbers) {
//        int answer = 0;
//        Set<Integer> possibleNums = createAllPossibleNums(numbers);
//
//        answer = Math.toIntExact(possibleNums.stream()
//                .filter(this::isPrimeNum)
//                .count());
//
//        return answer;
//    }
//
//    public Set<Integer> createAllPossibleNums(String strNum) {
//        Set<Integer> resultNumbers = new HashSet<>();
//
//        int[] numbers = Arrays.stream(strNum.split(""))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//        int length = numbers.length;
//        int[] output = new int[length];
//        boolean[] visited = new boolean[length];
//
//        for(int cnt = 1; cnt <= length; cnt++) {
//            recursive(numbers, output, visited, 0, length, cnt, resultNumbers);
//        }
//
//        return resultNumbers;
//    }
//
//    private Set<Integer> recursive(int[] numbers, int[] output, boolean[] visited, int depth, int length, int cnt, Set<Integer> results) {
//        if(cnt == 0) {
////            System.out.println(Arrays.toString(Arrays.stream(output).filter(i -> i!=0).toArray()));
//            return null;
//        }
//        for(int i = 0; i < length; i++) {
//            if(!visited[i]){
//                visited[i] = true;
//                output[depth] = numbers[i];
//                recursive(numbers, output, visited, depth+1, length, cnt-1, results);
//                visited[i] = false;
//            }
//        }
//        return results;
//    }
//
//    public boolean isPrime(int input) {
//        boolean result = true;
//        if(input < 2) return false;
//        for(int i = 2; i < input/2; i++) {
//            if(input % i == 0) result = false;
//            break;
//        }
//        return result;
//    }

}
