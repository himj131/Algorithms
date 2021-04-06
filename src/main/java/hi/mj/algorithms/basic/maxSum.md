## String 다루기

> n개의 정수를 입력받아 배열에 저장한다.  
> 이들 중에서 0개 이상의 연속된 정수들을 더하여 얻을 수 있는 최대값 출력하기

``` java
public class MaxSum {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        int[] data = new int[n];

        for(int i=0; i<n; i++){
            data[i] = kb.nextInt();
        }
        kb.close();

        int maxSum =0 ;

        for(int i =0; i<n; i++){  //i= 각 구간의 시작점
            int sum=0;
            for(int j=i; j<n; j++){ //j=각 구간의 끝점

                //구간의 합 계산
                sum += data[j];

                if(sum>maxSum)
                    maxSum = sum;

            }
        }

        System.out.println(maxSum);
    }
}

```

