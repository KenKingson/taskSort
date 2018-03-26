package by.bntu.fitr.povt.coffeebaby.model;


import java.util.List;

public class Checker {
    public List<Integer> sort(List<Integer> list, Sorting sort)
    {

        switch (sort)
        {
            case QUICK:
                list = QuickSort.quickSort(list);
                break;

            case BUBBLE:
                list = BubbleSort.bubbleSort(list);

                break;
            case CHOICE:
                list = ChoiceSort.selectionSort(list);
                break;
            case MERGER:
                list = MergerSort.sortMerge(list);
                break;
            case INSERTION:
                list = InsertionSort.insertIntoSort(list);
                break;
        }

        return list;
    }
}
