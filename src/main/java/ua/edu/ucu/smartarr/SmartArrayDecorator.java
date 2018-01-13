package ua.edu.ucu.smartarr;

import java.util.ArrayList;

abstract class SmartArrayDecorator implements SmartArray {

    private SmartArray smartArray;

    SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
    }

    @Override
    public Object[] toArray() {
        return smartArray.toArray();
    }

    @Override
    public ArrayList<Object> getArrayList() {
        return smartArray.getArrayList();
    }

    @Override
    public String operationDescription() {
        return "SmartArrayDecorator";
    }


    @Override
    public void setArrayList(ArrayList<Object> arr) {
        smartArray.setArrayList(arr);
    }

    @Override
    public int size() {
        return smartArray.size();
    }


    @Override
    public String toString() {
        String s = "";
        for(Object elem: smartArray.getArrayList()){
            s +=  elem + "\n";
        }
        return s;
    }
}
