package Encapsulation;

public class PersegiPanjang extends BangunDatar {
    private float p;
    private float l;

    @Override
    protected float luas() {
        return p * l;
    }

    @Override
    protected float keliling() {
        return 2 * (p + l);
    }

    public float setPanjang(float p) {
        this.p = p;
        return this.p;
    }

    public float setLebar(float l) {
        this.l = l;
        return this.l;
    }

    public float getPanjang() {
        return p;
    }

    public float getLebar() {
        return l;
    }

    @Override
    public float getLuas() {
        return luas();
    }

    @Override
    public float getKeliling() {
        return keliling();
    }
}