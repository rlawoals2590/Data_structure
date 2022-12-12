package sort;

import java.util.Scanner;

public class Selection {
    static void selectionSort(int [] data){
        int size = data.length;
        int min;
        int temp;

        for (int i = 0; i < size-1; i++){
            min = i;
            for (int j = i+1; j < size; j++){
                if (data[min] > data[j]){
                    min = j;
                }
            }
            temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--Selection Sort--");
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

        selectionSort(data);

        System.out.println("오름차순");
        for (int i = 0; i < count; i++){
            System.out.println(data[i] + " ");
        }
    }
}
