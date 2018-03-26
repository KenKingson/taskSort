package tests;


import by.bntu.fitr.povt.coffeebaby.model.Checker;
import by.bntu.fitr.povt.coffeebaby.model.Sorting;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CheckerTest {
    Checker check = new Checker();
    @Test
    public void sortBubble() throws Exception {
        List<Integer> list = new ArrayList<Integer>(0) ;
        list.add(2);
        list.add(1);
        list.add(3);
        List<Integer> truelist = new ArrayList<Integer>(0) ;
        truelist.add(1);
        truelist.add(2);
        truelist.add(3);

        assertArrayEquals(check.sort(list,Sorting.BUBBLE).toArray(),truelist.toArray());
    }

    @Test
    public void sortChoise() throws Exception {
        List<Integer> list = new ArrayList<Integer>(0) ;
        list.add(2);
        list.add(1);
        list.add(3);
        List<Integer> truelist = new ArrayList<Integer>(0) ;
        truelist.add(1);
        truelist.add(2);
        truelist.add(3);

        assertArrayEquals(check.sort(list,Sorting.CHOICE).toArray(),truelist.toArray());
    }

    @Test
    public void sortInsertion() throws Exception {
        List<Integer> list = new ArrayList<Integer>(0) ;
        list.add(2);
        list.add(1);
        list.add(3);
        List<Integer> truelist = new ArrayList<Integer>(0) ;
        truelist.add(1);
        truelist.add(2);
        truelist.add(3);

        assertArrayEquals(check.sort(list,Sorting.INSERTION).toArray(),truelist.toArray());
    }

    @Test
    public void sortMerger() throws Exception {
        List<Integer> list = new ArrayList<Integer>(0) ;
        list.add(2);
        list.add(1);
        list.add(3);
        List<Integer> truelist = new ArrayList<Integer>(0) ;
        truelist.add(1);
        truelist.add(2);
        truelist.add(3);

        assertArrayEquals(check.sort(list,Sorting.MERGER).toArray(),truelist.toArray());
    }


    @Test
    public void sortQuick() throws Exception {
        List<Integer> list = new ArrayList<Integer>(0) ;
        list.add(2);
        list.add(1);
        list.add(3);
        List<Integer> truelist = new ArrayList<Integer>(0) ;
        truelist.add(1);
        truelist.add(2);
        truelist.add(3);

        assertArrayEquals(check.sort(list,Sorting.QUICK).toArray(),truelist.toArray());
    }


}