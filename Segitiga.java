package Encapsulation;

public class Segitiga extends BangunDatar {
    private float alas;
    private float t;

    @Override
    protected float luas() {
        return 0.5f * alas * t;
    }

    // Diasumsikan segitiga sama kaki (hanya ada alas & tinggi)
    @Override
    protected float keliling() {
        float sMiring = (float) Math.sqrt((alas / 2) * (alas / 2) + t * t);
        return alas + 2 * sMiring;
    }

    public float setAlas(float alas) {
        this.alas = alas;
        return this.alas;
    }

    public float setTinggi(float t) {
        this.t = t;
        return this.t;
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return t;
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