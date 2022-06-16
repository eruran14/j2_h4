package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (listA.size() < 5){
            System.out.println("Введите строку: ");
            listA.add(input.next());
        }
        System.out.println("Список А: " + listA);

        ArrayList<String> listB = new ArrayList<>();

        while (listB.size() < 5){
            System.out.println("Введите строку в лист Б: ");
            listB.add(input.next());
        }
        System.out.println("Список Б: " + listB);

        ArrayList<String> listC = new ArrayList<>();
        listC.add(0, listA.get(0));
        listC.add(1, listB.get(4));
        listC.add(2, listA.get(1));
        listC.add(3, listB.get(3));
        listC.add(4, listA.get(2));
        listC.add(5, listB.get(2));
        listC.add(6, listA.get(3));
        listC.add(7, listB.get(1));
        listC.add(8, listA.get(4));
        listC.add(9, listB.get(0));
        System.out.println("Список С: " + listC);

        listC.sort(Comparator.comparingInt(String::length));

        System.out.println(listC);
    }

}
