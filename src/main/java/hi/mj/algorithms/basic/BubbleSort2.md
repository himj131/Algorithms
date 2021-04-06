## 버블정렬(Bubble Sort) 변형 알고리즘
> 1.n개의 정수를 입력받기  
> 2.입력받을때마다 현재까지 입력된 정수들 정렬(오름차순)

정수를 입력받아 앞에서부터 정렬을 한다면,   
2번째 숫자를 입력 받았을 때 1번째 숫자와 비교,  
3번째 숫자를 입력 받았을 때 1,2번째 숫자와 비,  
4번째 숫자를 입력 받았을 때 1,2,3번째 숫자와 비교  
...  
큰 숫자를 뒤로 보내는 로직이므로   
뒤에서부터 큰값을 먼저 고정시켜주면 연산횟수를 줄일수 있다.

상세 로직은 아래와 같다. 


``` java
public class BubbleSort2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for (int i=0; i<n; i++){

            int tmp =kb.nextInt();

            int j = i-1;
            while (j>=0 && data[j] >tmp){
                data[j+1] = data[j];
                j--;
            }
            data[j+1]=tmp;
            for (int k=0; k<=i; k++)
                System.out.print(data[k]+ " ");
            System.out.println();
        }
        kb.close();
    }
}


```


 ※ 정답은 아닙니다. 더 좋은 방법이 있다면 공유해주세요 :)

