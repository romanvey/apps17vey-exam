package ua.edu.ucu.smartarr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{

    public DistinctDecorator(SmartArray sa) {
        super(sa);
        boolean needToAdd;
        ArrayList<Object> res = new ArrayList<>();
        for(Object elem: sa.getArrayList()){
            needToAdd = true;
            for(Object resElem: res){
                if(elem.toString().equals(resElem.toString())){
                    needToAdd = false;
                    break;
                }
            }
            if(needToAdd){
                res.add(elem);
            }
        }
        sa.setArrayList(res);
    }

    @Override
    public String operationDescription() {
        return "DistinctDecorator";
    }
}
