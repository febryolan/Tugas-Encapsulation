package Encapsulation;

public class Lingkaran extends BangunDatar{
    private float r;
    
    @Override
    protected float luas(){
        return (float) (Math.PI * r * r);
    }
    
    @Override
    protected float keliling(){
        return (float) (2 * Math.PI * r);
    }
    
    protected float setJariJari(float r){
        this.r = r;
        return this.r;
    }
    
    public float getJari(){
        return r;
    }
    
    @Override
    public float getLuas(){
        return luas();
    }
    
    @Override
    public float getKeliling(){
        return keliling();
    }
}
