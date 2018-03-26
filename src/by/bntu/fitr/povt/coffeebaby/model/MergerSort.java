package by.bntu.fitr.povt.coffeebaby.model;

import java.util.ArrayList;
import java.util.List;

public class MergerSort {

    public static List<Integer> sortMerge(List<Integer> arr) {
        List <Integer>arr2 = new ArrayList<Integer>(0);
        List <Integer>arr1 = new ArrayList<Integer>(0);
        int len = arr.size();
        if (len < 2) return arr;
        int middle = len / 2;
        int i = 0;
        arr1.clear();
        arr2.clear();
        for(;i<middle;i++)
        {
            arr1.add(arr.get(i));
        }
        for(;i<len;i++)
        {
            arr2.add(arr.get(i));
        }
        return merge(arr1,arr2);
    }



    public static List<Integer> merge(List<Integer> arr_1,List<Integer> arr_2){
        int len_1 = arr_1.size(), len_2 = arr_2.size();
        int a = 0, b = 0, len = len_1 + len_2; // a, b - счетчики в массивах
        List<Integer> result = new ArrayList<Integer>(0);
        for (int i = 0; i < len; i++) {
            if (b < len_2 && a < len_1) {
                if (arr_1.get(a) > arr_2.get(b))
                    result.add(arr_2.get(b++));
                else result.add( arr_1.get(a++));
            } else if (b < len_2) {
                result.add( arr_2.get(b++));
            } else {
                System.out.println(i);
                result.add(arr_1.get(a++));
            }
        }
        return result;
    }
}
