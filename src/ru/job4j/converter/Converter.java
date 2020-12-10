package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value){
        int rsl = value / 70; //формула перевода рублей в евро
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value/60; //формула перевода рублей в доллары
        return rsl;
    }

    public static void main(String[] args){
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("180 rubles are " + dollar + " dollar.");
    }
}
