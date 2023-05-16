package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Genetator extends Toys {
    ArrayList outList = new ArrayList();


    public ArrayList<Toys> sellArray(int numberSell, ArrayList<Toys> toysList, ArrayList<Toys> outList){
        int a = toysList.get(numberSell).getNumberOf() - 1;
        toysList.get(numberSell).setNumberOf(a);
        outList.add(toysList.get(numberSell));
        return toysList;
    }
    public ArrayList<Toys> BuyToys(int num, ArrayList<Toys> outList){

        return outList;
    }
    public ArrayList<Toys> getOutList(){
        return outList;
    }

    public void printer(int id, ArrayList<Toys> outList){
        System.out.println("id = " + outList.get(id).getId()+
                "| name = " + outList.get(id).getName()
               );
    }


    public ArrayList<Toys> Save(ArrayList<Toys> outList){

        return outList;
    }


}
