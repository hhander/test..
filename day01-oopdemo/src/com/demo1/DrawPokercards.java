package com.demo1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DrawPokercards {
    public static ArrayList<String> drawCard(ArrayList<String> arr, Random r)
    {
        ArrayList<String> Cards = new ArrayList<>();
        for (int i = 0; i < 17; i++)
        {
            int sz = arr.size();
            int randCard = r.nextInt(sz);
            Cards.add(arr.get(randCard));
            arr.remove(arr.get(randCard));
        }

        return Cards;

    }
}
