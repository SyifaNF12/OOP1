package bangundatar;

public class TestBangunDatar {

    public static void main(String[] args) {
       TestBangunDatar test = new TestBangunDatar();
       Persegi persegi = new Persegi();
       persegi.hitungKeliling(2, 4, 3);
       BangunDatar bd = new  Persegi();
       bd.hitungLuas(4, 5);
       PersegiPanjang pp = new PersegiPanjang();
       pp.hitungLuas(4, 5);
       Segitiga sg = new Segitiga();
       sg.hitungLuas(0.5, 5, 2);
       sg.hitungKeliling(3, 5);
    }
    
}
