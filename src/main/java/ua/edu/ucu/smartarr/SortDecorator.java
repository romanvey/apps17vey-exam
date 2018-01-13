package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.ArrayList;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator{
    public SortDecorator(SmartArray sa, MyComparator cmp) {
        super(sa);
        ArrayList<Object> res = sa.getArrayList();
        res.sort(cmp);
        sa.setArrayList(res);
    }

    @Override
    public String operationDescription() {
        return "DistinctDecorator";
    }
}
