package bangundatar;

public class Segitiga extends BangunDatar {

    @Override
    public int getA() {
        return a;
    }

    /**
     *
     * @param a
     */
    @Override
    public void setA(int a) {
        this.a = a;
    }

    /**
     *
     * @return
     */
    @Override
    public int getB() {
        return b;
    }

    /**
     *
     * @param b
     */
    @Override
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int getF() {
        return f;
    }

    /**
     *
     * @param f
     */
    @Override
    public void setF(int f) {
        this.f = f;
    }

    @Override
    public double getHasilLuasSegitiga() {
        return hasilLuasSegitiga;
    }

    /**
     *
     * @param hasilLuasSegitiga
     */
    @Override
    public void setHasilLuasSegitiga(double hasilLuasSegitiga) {
        this.hasilLuasSegitiga = hasilLuasSegitiga;
    }

    @Override
    public double getHasilKelilingSegitiga() {
        return hasilKelilingSegitiga;
    }

    /**
     *
     * @param hasilKelilingSegitiga
     */
    @Override
    public void setHasilKelilingSegitiga(double hasilKelilingSegitiga) {
        this.hasilKelilingSegitiga = hasilKelilingSegitiga;
    }

    @Override
    public double getC() {
        return c;
    }

    /**
     *
     * @param c
     */
    @Override
    public void setC(double c) {
        this.c = c;
    }

    public void hitungKeliling(int f, int a) {
       System.out.println("Hasil keliling segitiga adalah:" + f * a); 
    }

    public void hitungLuas(double c, int a, int b) {
        System.out.println("Hasil luas  adalah:" + (int) (c * a * b));
    }
    
    
}
