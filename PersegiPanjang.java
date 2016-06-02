package bangundatar;

public class PersegiPanjang extends BangunDatar{

    @Override
    public int getA() {
        return a;
    }

    @Override
    public void setA(int a) {
        this.a = a;
    }

    @Override
    public int getB() {
        return b;
    }

    @Override
    public void setB(int b) {
        this.b = b;
    }

    /**
     *
     * @return
     */
    @Override
    public int getD() {
        return d;
    }

    @Override
    public void setD(int d) {
        this.d = d;
    }

    /**
     *
     * @return
     */
    @Override
    public int getF() {
        return f;
    }

    @Override
    public void setF(int f) {
        this.f = f;
    }

    /**
     *
     * @return
     */
    @Override
    public double getHasilLuas() {
        return hasilLuas;
    }

    @Override
    public void setHasilLuas(double hasilLuas) {
        this.hasilLuas = hasilLuas;
    }

    /**
     *
     * @return
     */
    @Override
    public double getHasilKeliling() {
        return hasilKeliling;
    }

    /**
     *
     * @param hasilKeliling
     */
    @Override
    public void setHasilKeliling(double hasilKeliling) {
        this.hasilKeliling = hasilKeliling;
    }
    
    @Override
    public void hitungKeliling(int d, int a, int b) {
        super.hitungKeliling(d, a, b); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void hitungLuas(int a, int b) {
        System.out.println("Hasil luas persegi panjang adalah: " + a * b);
    }

    
}
