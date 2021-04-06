## 소수 구하기
> 정수 n을 입력받아, 2~n(10000)까지 정수중 소수를 모두 출력해라

``` java

public class PrimeNum {

    public static void main(String[] args) {

        int n = 100000;

        for (int j = 2; j < n; j++) {
            if (isPrime(j))
                System.out.println(j);
        }
    }

    static boolean isPrime(int n){

        if(n<2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

}


```


 ※ 정답은 아닙니다. 더 좋은 방법이 있다면 공유해주세요 :)

