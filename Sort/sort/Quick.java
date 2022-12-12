package sort;

import java.util.Scanner;

public class Quick {
    static void quickSort(int [] data, int left, int right){
        if (left>=right){
            return;
        }

        int pivot = partition(data, left, right);
        quickSort(data, left, pivot-1);
        quickSort(data, pivot+1, right);
    }

    public static int partition(int [] data, int left, int right){
        int savedLeft = left;
        int pivot = data[left];

        while (left < right){
            while (data[right] > pivot && right > left){
                --right;
            }
            while (data[left] <= pivot && right > left){
                ++left;
            }
            swap(data, left, right);
        }
        swap(data, savedLeft, left);
        return left;
    }

    public static void swap(int [] data, int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--Shell Sort--");
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

        quickSort(data, 0, count-1);

        System.out.println("오름차순");
        for (int i = 0; i < count; i++){
            System.out.println(data[i] + " ");
        }
    }
}
