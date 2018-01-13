package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {

    public FilterDecorator(SmartArray sa, MyPredicate pr) {
        super(sa);
        ArrayList<Object> res = new ArrayList<>();
        for(Object elem: sa.toArray()){
            if(pr.test(elem)){
                res.add(elem);
            }
        }
        sa.setArrayList(res);
    }

    @Override
    public String operationDescription() {
        return "FilterDecorator";
    }


}

