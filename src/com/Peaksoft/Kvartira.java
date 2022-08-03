package com.Peaksoft;

public class Kvartira extends UyBuloo {


    public Kvartira(int people, String address) {
        super(people, address);
    }


    @Override
    public String platit() {
        return "Kvartirada jawagandar kommunalka toloshot";
    }
}
