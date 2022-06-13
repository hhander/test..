package com.demo1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PokerCard {

    public static ArrayList<String> cardArr = new ArrayList();

    static
    {
        String[] cardNum = {"3","4","5","6","7","8","9","10","j","q","k","A","2",};
        String[] color = {"红桃","黑桃","方块","梅花"};
        String cards = "";
        for (int i = 0; i < cardNum.length; i++)
        {

            for (int j = 0; j <color.length ; j++)
            {
                cards = color[j] + cardNum[i]  ;
                cardArr.add(cards);
            }
        }
        cardArr.add("bigKing");
        cardArr.add("smallKing");
    }

    public static void main(String[] args) {

        Random r = new Random();
        System.out.println(cardArr.size());
//        for (int i = 0; i < cardArr.size(); i++) {
//            System.out.println(cardArr.get(i));
        ArrayList<String> card1 = DrawPokercards.drawCard(cardArr,r);
        ArrayList<String> card2 = DrawPokercards.drawCard(cardArr,r);
        ArrayList<String> card3 = cardArr;

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);











    }
}
