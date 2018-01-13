package ua.edu.ucu.smartarr;

import java.util.ArrayList;

public interface SmartArray {

    Object[] toArray(); // return array with SmartArray elements

    ArrayList<Object> getArrayList();
    void setArrayList(ArrayList<Object> arr);

    String operationDescription(); // return current operation name applied to SmartArray
    
    int size(); // return SmartArray size
   
}
