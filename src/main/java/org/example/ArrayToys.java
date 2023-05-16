package org.example;

import java.util.ArrayList;
import java.util.Random;


public class ArrayToys
{
    ArrayList<Integer> numberSet = new ArrayList<>();
    ArrayList<Toys> toysList = new ArrayList<>();
    Random rnd = new Random();
    public void addToys(String nameToys, int id, String name, int numberOf, int luck){
        Toys toys = new Toys(id, name, numberOf, luck);
        toysList.add(toys);
    }
    public ArrayList<Toys> getToysList(){
        for (int i=0; i < toysList.size(); i++){
            System.out.println("номер игрушки "+i+": "+ toysList.get(i).getName());

        }
        System.out.println();
        return toysList;
    }
    public Boolean generator( int i, ArrayList<Toys> toysList){
        int a = toysList.get(i).getLuck();
        int r = rnd.nextInt(0,100);
        if (a > r){
            return true;
        }
        else
            return false;
    }

}
