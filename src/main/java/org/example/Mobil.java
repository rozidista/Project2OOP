package org.example;

public class Mobil extends Bengkel {
    private String merk;
    private int tahun;
    private String supir = "Agus";

    public Mobil(String merk, int tahun, String mekanik) {
        super(mekanik);
        this.merk = merk;
        this.tahun = tahun;
    }

    public Mobil(String supir, String mekanik) {
        super(mekanik);
        this.supir = supir;
    }

    public String getMerk() {
        return this.merk;
    }

    public void klakson() {
        this.print("Tin Tin");
    }

    public String getMekanik() {
        return "Deni";
    }

    public Boolean isFine() {
        return true;
    }
}
