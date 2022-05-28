package com.chuyashkou.lessons_oop.clothes;

public class Runner {

    public static void main(String[] args) {

        TShirt tShirt = new TShirt(Size.XXS, 30.40, "blue");
        Trousers trousers = new Trousers(Size.L, 80.16, "red");
        Skirt skirt = new Skirt(Size.S, 45.50, "white");
        Tie tie = new Tie(Size.XS, 30.20, "black");

        Clothes[] clothes = {tShirt, trousers, skirt, tie};

        Atelier atelier = new Atelier();

        atelier.dressAMan(clothes);
        atelier.dressAWoman(clothes);
    }
}
