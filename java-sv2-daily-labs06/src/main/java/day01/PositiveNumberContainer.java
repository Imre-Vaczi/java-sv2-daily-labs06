package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {
    private List<Double> numList = new ArrayList<>();

    public void add(double number) {
        numList.add(number);
    }

    public List<Double> getNumList(){
        return numList;
    }
}
