package sort;

import java.util.Scanner;

public class Insert {
     static void insertSort(int [] data){
        int size = data.length;
        int temp;

        for (int i = 0; i < size; i++){
            int j;
            temp = data[i];
            for (j = i; j > 0 && data[j-1] > temp; j--){
                data[j] = data[j-1];
            }
            data[j] = temp;
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--Insert Sort--");
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

        insertSort(data);

        System.out.println("오름차순");
        for (int i = 0; i < count; i++){
            System.out.println(data[i] + " ");
        }
    }
}
