package by.bntu.fitr.povt.coffeebaby.controller;

import by.bntu.fitr.povt.coffeebaby.model.Checker;
import by.bntu.fitr.povt.coffeebaby.model.Sorting;
import by.bntu.fitr.povt.coffeebaby.view.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public static void main(String[] args) {
        Checker checker = new Checker();
        List<Integer> list = new ArrayList<Integer>(0) ;
        list.add(2);
        list.add(1);
        list.add(3);


        View.output(list.toString());
        list = checker.sort(list, Sorting.MERGER);
        View.output(list.toString());
    }
}
