package Encapsulation;

public class Persegi extends BangunDatar{
    private float s;
    
    @Override
    protected float luas(){
        return s * s;
    }
    
    @Override
    protected float keliling(){
        return 4 * s;
    }
    
    public float setSisi(float s){
        this.s = s;
        return this.s;
    }
    
    public float getSisi(){
        return s;
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
