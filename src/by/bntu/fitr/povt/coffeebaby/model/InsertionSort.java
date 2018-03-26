package by.bntu.fitr.povt.coffeebaby.model;

import java.util.List;

public class InsertionSort {
    public static List<Integer> insertIntoSort(List<Integer> arr) {
        int  j;
        int temp;
        for(int i = 0; i < arr.size() - 1; i++){
            if (arr.get(i) > arr.get(i + 1)) {
                temp = arr.get(i + 1);
                arr.set(i + 1,arr.get(i));
                j = i;
                while (j > 0 && temp < arr.get(j - 1)) {
                    arr.set(j , arr.get(j - 1));
                    j--;
                }
                arr.set(j , temp);
            }
        }
        return  arr;
    }
}
