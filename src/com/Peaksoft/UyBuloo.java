package com.Peaksoft;

public abstract class UyBuloo implements Oplata {
    private int people;
    private String address;

    public UyBuloo(int people, String address) {
        this.people = people;
        this.address = address;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Pomeshenie{" +
                "people: " + people +
                ", address: '" + address + '\'' +
                '}';
    }
}
