package org.example;

public class MobilSport extends Mobil {
    private int topSpeed;

    public MobilSport(String merk, int tahun, String mekanik) {
        super(merk, tahun, mekanik);
    }

    public MobilSport(String merk, int tahun, int topSpeed, String  mekanik) {
        super(merk, tahun, mekanik);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
}
