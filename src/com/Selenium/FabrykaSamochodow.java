package com.Selenium;

interface Samochod {
    int maxPredkosc();
}

class Mercedes implements Samochod{
    int cena;
    String kolor;
    int maxPredkosc = 100;

//    public Mercedes(int cena, String kolor) {
//        this.cena = cena;
//        this.kolor = kolor;
//    }

    @Override
    public int maxPredkosc() {
        return this.maxPredkosc;
    }
}

class BMW implements Samochod{
    int cena;
    String kolor;
    int maxPredkosc = 150;

//    public BMW(int cena, String kolor) {
//        this.cena = cena;
//        this.kolor = kolor;
//    }

    @Override
    public int maxPredkosc() {
        return this.maxPredkosc;
    }
}

class Audi implements Samochod{
    int cena;
    String kolor;
    int maxPredkosc = 300;

//    public Audi(int cena, String kolor) {
//        this.cena = cena;
//        this.kolor = kolor;
//    }

    @Override
    public int maxPredkosc() {
        return this.maxPredkosc;
    }
}

public class FabrykaSamochodow {
    public static void main(String[] args) {
        Samochod samochod = getSamochod(100);
        System.out.println(samochod.getClass().toString());
        System.out.println(samochod.maxPredkosc());
    }

    public static Samochod getSamochod(int predkosc) {
        Samochod samochod = null;
        switch (predkosc) {
            case 100:
                samochod = new Mercedes();
                break;
            case 150:
                samochod = new BMW();
                break;
            case 200:
                samochod = new Audi();
                break;
        }
        return samochod;
    }




}
