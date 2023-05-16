package org.example;

import java.util.Scanner;

public class UI {

    public void start() {


        Scanner scan = new Scanner(System.in);
        ArrayToys arrayToys = new ArrayToys();
        Genetator genetator = new Genetator();
        Toys toys = new Toys();


        toys.addToys("1toy", 1, "bear", 5, 50);
        toys.addToys("2toy", 2, "star", 3, 30);


        System.out.println("Список игрушек: ");
        toys.getToysList();

        System.out.println("Выберите № ишрушки: ");
        int choiceToy = scan.nextInt();

        System.out.println("Хотете ли вы изменить шанс выподания игрушки? \n 1-да , 2 - нет");
        int c = scan.nextInt();

        if (c == 1) {
            System.out.println("введите % выпадения игрушки: ");
            int chance = scan.nextInt();
            if (chance > 100 || chance < 0) {
                System.out.println("вы ввели не верное значение");
            } else {
                toys.toysList.get(choiceToy).setLuck(chance);
            }

        boolean a = arrayToys.generator(choiceToy, toys.toysList);
        if (a == true) {
            genetator.sellArray(choiceToy, toys.toysList, genetator.outList);
            genetator.printer(choiceToy, genetator.outList);
        } else
            System.out.println("неудачная попытка");
            System.out.println("1 - продолжить 2 - выйти ");
        int str = scan.nextInt();
        genetator.printer(choiceToy, genetator.outList);
        if (str == 1) {
            start();
        }
    }else
        {
            System.out.println("Конец программы");
        }

    }
    public int num(int a){
        a--;
        return a;
    }
}
