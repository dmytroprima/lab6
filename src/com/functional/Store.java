package com.functional;

import com.candy.Candy;
import com.candy.ChocolateWithFillings;
import com.candy.FruitJelly;
import com.candy.Lollipops;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Candy> storeList = new ArrayList<>();
    public Store(){
        storeList.add(new ChocolateWithFillings("korivka", 20, 15, 5, "caramel"));
        storeList.add(new FruitJelly("bdjilka", 15, 8, 3, "orange"));
        storeList.add(new Lollipops("diushes", 20, 10, 3, "pear"));
    }

    public boolean isCandyAvailable(String name){
        for(Candy candy : storeList)
            if (candy.getName().equals(name)){
                return true;
            }
        return false;
    }

    public Candy returnCandy(String name){
        for(Candy candy : storeList)
            if (candy.getName().equals(name)){
                return candy;
            }
        return new Candy("None", 0,0,0);
    }

    public void printStore() {
        for (Candy candy : storeList) {
            System.out.println(candy.toString());
        }
    }
}
