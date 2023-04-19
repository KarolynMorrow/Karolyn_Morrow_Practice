package sba_core_java.exercise1;


import java.util.ArrayList;
import java.util.Arrays;

public class MyOperation implements IMyOperations{

    ArrayList<String> myArrayList;

    public MyOperation() {
       myArrayList = new ArrayList<>();
    }

    @Override
    public void convertStringArrayIntoArrayList(String[] stringArray) {
        myArrayList.addAll(Arrays.asList(stringArray));
    }


    @Override
    public void replaceAnElementInTheStringArrayListGiven(int index) {

        myArrayList.set(index, "Nah");


    }

    @Override
    public ArrayList<String> createANewArrayListFromExistingArray() {
        ArrayList<String> clonedList = new ArrayList<>();
        if (myArrayList.contains("Nah")) {
            myArrayList.remove("Nah");
            clonedList = (ArrayList<String>) myArrayList.clone();

        }
        return clonedList;
    }
}
