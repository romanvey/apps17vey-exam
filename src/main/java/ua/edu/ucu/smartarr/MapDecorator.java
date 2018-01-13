package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.ArrayList;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator {
    public MapDecorator(SmartArray sa, MyFunction func) {
        super(sa);
        ArrayList<Object> res = new ArrayList<>();
        for(Object elem: sa.toArray()){
            res.add(func.apply(elem));
        }
        sa.setArrayList(res);
    }

    @Override
    public String operationDescription() {
        return "MapDecorator";
    }
}
