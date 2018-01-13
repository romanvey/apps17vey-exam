package ua.edu.ucu.smartarr;

import java.util.ArrayList;
import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray {

    private ArrayList<Object> arr = new ArrayList<>();
    public BaseArray(Object[] arr) {
        this.arr.addAll(Arrays.asList(arr));
    }


    @Override
    public Object[] toArray() {
        return arr.toArray();
    }

    @Override
    public ArrayList<Object> getArrayList() {
        return arr;
    }

    @Override
    public void setArrayList(ArrayList<Object> arr) {
        this.arr = arr;
    }

    @Override
    public String operationDescription() {
        return "BaseArray";
    }

    @Override
    public int size() {
        return arr.size();
    }

    @Override
    public String toString() {
        String s = "";
        for(Object elem: arr){
            s +=  elem + "\n";
        }
        return s;
    }
}
