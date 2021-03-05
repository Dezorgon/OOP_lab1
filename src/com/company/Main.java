package com.company;

import Salad.Salad;
import Salad.SaladBuilder;
import Vegetables.VegetableNames;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Map<VegetableNames, Integer> vegetableList = getVegetableListConsole();
        SaladBuilder saladBuilder = new SaladBuilder();
        Salad salad = saladBuilder.build(vegetableList);
        salad.cook();
    }
    static Map<VegetableNames, Integer> getVegetableListConsole() {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";

        Map<VegetableNames, Integer> vegetableList = new HashMap<VegetableNames, Integer>();

        int length = VegetableNames.values().length;
        int code = 0;
        boolean isAdd[] = new boolean[length];


        do
        {
            for(int clear = 0; clear < 100; clear++) {
                System.out.println("\b") ;
            }

            int index = 0;
            for(VegetableNames item: VegetableNames.values()){
                if (isAdd[index])
                {
                    System.out.println(Integer.toString(index+1) + ") " + ANSI_RED + item + ANSI_RESET);
                }
                else
                {
                    System.out.println(Integer.toString(index+1) + ") " +item);
                }
                index++;
            }

            try {
                code = System.in.read();
                if (code >= 49 && code <= length + 48) {
                    if (!isAdd[code - 1 - 48]){
                        isAdd[code - 1 - 48] = true;
                        System.out.println("weight:");
                        Scanner in = new Scanner(System.in);
                        int weight = in.nextInt();
                        vegetableList.put(VegetableNames.values()[code - 1 - 48], weight);
                    }
                }
            }catch (IOException e) {
                e.printStackTrace();
            }

        } while (code != 48);

        for(int clear = 0; clear < 100; clear++) {
            System.out.println("\b");
        }

        return vegetableList;
    }
}
