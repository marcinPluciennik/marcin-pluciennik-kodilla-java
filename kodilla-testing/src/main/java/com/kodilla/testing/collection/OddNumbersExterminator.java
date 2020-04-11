package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        //check if list is empty
        if (numbers.isEmpty()){
            return numbers;
        }else {
            //Create ArrayList with even numbers
            ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
            for (int j = 0; j < numbers.size(); j++) {
                if (j % 2 == 0) {
                    evenNumbers.add(j);
                }
            }
            return evenNumbers;
        }
    }
    /*
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<10; i++){
            list.add(i);
        }
        OddNumbersExterminator o = new OddNumbersExterminator();
        System.out.println(o.exterminate(list));
    }*/
}
