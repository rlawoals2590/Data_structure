package sort;

import java.util.Scanner;

public class Bubble {
    static void swap(int [] data, int index1, int index2){
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    private static void bubbleSort(int [] data, int n){
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-1-i; j++){
                if (data[j] > data[j+1]){
                    swap(data, j, j+1);
                }
            }
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--Bubble Sort--");
        System.out.printf("데이터 갯수: ");
        int count = sc.nextInt();
        int [] data = new int[count];

        for (int i = 0; i < count; i++){
            System.out.printf(i + "번째 데이터 값: ");
            data[i] = sc.nextInt();
        }

        System.out.println("정렬전 데이터");
        for (int i = 0; i < count; i++){
            System.out.println(data[i] + " ");
        }
        System.out.println("");

        bubbleSort(data, count);

        System.out.println("오름차순");
        for (int i = 0; i < count; i++){
            System.out.println(data[i] + " ");
        }
    }
}
