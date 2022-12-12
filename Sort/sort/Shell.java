package sort;

import java.util.Scanner;

public class Shell {
    static void shellSort(int [] data){
        int n = data.length;
        int h;
        int l = 0;

        for (h = n/2; h>0; h/=2, l++){
            for (int i=h; i < n; i++){
                int j;
                int temp = data[i];
                for (j=i-h; j>=0 && data[j] > temp; j-=h){
                    data[j+h] = data[j];
                }
                data[j+h] = temp;
            }
        }
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

        shellSort(data);

        System.out.println("오름차순");
        for (int i = 0; i < count; i++){
            System.out.println(data[i] + " ");
        }
    }
}
