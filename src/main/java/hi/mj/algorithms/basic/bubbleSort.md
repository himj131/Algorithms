## 버블정렬(Bubble Sort) 알고리즘
> 처음부터 배열의 두 값을 비교하면서 더 큰 값을 오른쪽으로 보내어 정렬하는 방법  
> 최대값을 마지막으로 몰아가는 정렬


``` java
public class BubbleSort {

    public static void main(String[] args) {

        //n개의 수를 입력받아 배열로 만든다.
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for(int i=0; i<n; i++){
            data[i] = kb.nextInt();
        }
        kb.close();

        bubbleSort(data,n);

        System.out.println("Sorted data:");
        for (int i=0; i<n; i++){
            System.out.println(data[i]);
        }
    }

    static int[] bubbleSort(int[] data, int n){
        for(int i=n-1; i>0; i--){
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j+1]){
                    //swap data[j] and data[j+1]
                    int tmp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tmp;
                }

            }
        }
        return data;
    }
}

```

정렬하는 로직은 메서드로 만들어 따로 빼냈다.  
data[j]와 data[j+1]을 swiping하는 부분 역시 따로 메서드를 만들어 리팩토링 할 수 있다.  
최종 알고리즘은 다음과 같다.


``` java
public class BubbleSort {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] data = new int[n];

        for(int i=0; i<n; i++){
            data[i] = kb.nextInt();
        }
        kb.close();

        bubbleSort(data,n);

        System.out.println("Sorted data:");
        for (int i=0; i<n; i++){
            System.out.println(data[i]);
        }
    }

    static int[] bubbleSort(int[] data, int n){
        for(int i=n-1; i>0; i--){
            for (int j = 0; j < i; j++) {
                  if (data[j] > data[j+1]){
                    //swap data[j] and data[j+1]
                    swap(data[j], data[j+1]);
                }
            }
        }
        return data;
    }

     static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}

```

 ※ 정답은 아닙니다. 더 좋은 의견 있으시면 공유해주세요 :)
