package bangundatar;

public class BangunDatar {
    int a, b, d = 2, f = 3;
    double hasilLuas, hasilKeliling, hasilLuasSegitiga, hasilKelilingSegitiga, c = 0.5;

    public double getHasilLuas() {
        return hasilLuas;
    }

    public void setHasilLuas(double hasilLuas) {
        this.hasilLuas = hasilLuas;
    }

    public double getHasilKeliling() {
        return hasilKeliling;
    }

    public void setHasilKeliling(double hasilKeliling) {
        this.hasilKeliling = hasilKeliling;
    }

    public double getHasilLuasSegitiga() {
        return hasilLuasSegitiga;
    }

    public void setHasilLuasSegitiga(double hasilLuasSegitiga) {
        this.hasilLuasSegitiga = hasilLuasSegitiga;
    }

    public double getHasilKelilingSegitiga() {
        return hasilKelilingSegitiga;
    }

    public void setHasilKelilingSegitiga(double hasilKelilingSegitiga) {
        this.hasilKelilingSegitiga = hasilKelilingSegitiga;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
    public void hitungLuas(int a, int b){
        hasilLuas = a * b;
    }
    public void hitungKeliling(int d, int a, int b){
        hasilKeliling = d * (a + b);
    }
    
}
