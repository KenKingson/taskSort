package by.bntu.fitr.povt.coffeebaby.model;

import java.util.Collections;
import java.util.List;

public class QuickSort {

    public static List<Integer> quickSort(List<Integer> array) {
        int startIndex = 0;
        int endIndex = array.size() - 1;
        doSort(array, startIndex, endIndex);
        return array;
    }

    private static void doSort(List<Integer> array,int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array.get(i) <= array.get(i))) {
                i++;
            }
            while (j > cur && (array.get(cur) <= array.get(j))) {
                j--;
            }
            if (i < j) {
                Collections.swap(array,i,j);
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(array,start, cur);
        doSort(array,cur+1, end);
    }
}
