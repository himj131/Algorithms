package hi.mj.algorithms.programers.hash;

import java.util.*;

import static java.util.Map.*;
import static java.util.stream.Collectors.*;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42579
 *
 *스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
 *
 * 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
 * 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
 * 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
 * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
 *
 * 제한사항
 * genres[i]는 고유번호가 i인 노래의 장르입니다.
 * plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
 * genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
 * 장르 종류는 100개 미만입니다.
 * 장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
 * 모든 장르는 재생된 횟수가 다릅니다.
 * */
public class BestAlbum {

//    public int[] solution(String[] genres, int[] plays) {
//        int[] answer = {};
//        PlayTime playTime = new PlayTime(genres, plays);
//
//        List<Map<String, Integer>> playList = new ArrayList<>();
//        for(int i = 0; i < genres.length; i++) {
//            Map<String, Integer> pair = new HashMap<>();
//            pair.put(genres[i], plays[i]);
//            playList.add(pair);
//        }
//        Map<String, Map<Integer, Integer>> map = new HashMap<>();
//        for(int i = 0; i < genres.length; i++) {
//            map.put(genres[i], new HashMap<>(i, plays[i]));
//        }
//    }
//
//    class PlayTime {
//        Map<String, Integer> playTime;
//
//        public PlayTime(String[] genres, int[] plays) {
//            for(int i = 0; i < genres.length; i++) {
//                addPlayTime(genres[i], plays[i]);
//            }
//        }
//
//        private void addPlayTime(String genre, int playCount) {
//            int count = playTime.get(genre);
//            playTime.put(genre, count+playCount);
//        }
//    }
}
