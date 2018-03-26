package by.bntu.fitr.povt.coffeebaby.model;

import java.util.Collections;
import java.util.List;

public class ChoiceSort {
    public static List<Integer> selectionSort (List <Integer> numbers){
        int min, temp;

        for (int index = 0; index < numbers.size()-1; index++){
            min = index;
            for (int scan = index+1; scan < numbers.size(); scan++){
                if (numbers.get(scan) < numbers.get(min))
                    min = scan;
            }
            Collections.swap(numbers,index,min);
        }
        return numbers;
    }
}
