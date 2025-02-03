package dev.alejandro;

import java.util.ArrayList;
import java.util.List;

public class Multiplier {

    private List<String> multiplicationTable = new ArrayList<>();

    public Multiplier(){    
    
    }

    public void createMultiplicationTable(int n){
        for(int i = 1; i<=10; i++)
        multiplicationTable.add(n + "x" +i +"=" +n*i);
    }

    public List<String> getMultiplicationTable(){
        return multiplicationTable;
    }

}
