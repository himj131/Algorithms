## 소수 구하기
> 사용자로부터 먼저 정수의 개수 n을 입력 받는다.   
> 이어서 n개의 정수를 입력받아 순서대로 배열에 저장한다.  
> 그런다음 중복된 정수쌍의 개수를 카운트하여 출력하라.   
> 예를 들어 n=6이고 입력된 정수들이 2,4,2,4,5,2,이면 중복된 정수쌍은 (2,2),(2,2),(2,2),(4,4)로 모두 4쌍이다.

``` java

public class DuplicateNum {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for(int i=0; i<n; i++){
            data[i] = kb.nextInt();
        }
        kb.close();

        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){  //중복조건을 제거할수 있다.
                if(data[i]==data[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

```


※ 정답은 아닙니다. 더 좋은 방법이 있다면 공유해주세요 :)