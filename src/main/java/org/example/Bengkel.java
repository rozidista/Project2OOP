package org.example;

public abstract class Bengkel {
    private String mekanik;

    public Bengkel(String mekanik) {
        this.mekanik = mekanik;
    }

    public String getMekanik() {
        return this.mekanik;
    }

    public abstract Boolean isFine();

    public void print(String message) {
        System.out.println(message);
    }
}
