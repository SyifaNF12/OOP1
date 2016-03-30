public class Method {

public static void main (String[] args){

//inisialisasi objek
Method nama = new Method();
System.out.println(nama.namaSaya());
nama.pertambahan();


}

//fungsi -> sesuatu yang mengembalikan nilai
public String namaSaya(){
return "Syifa";
}

public void pertambahan(){
int a = 4;
int b = 2;
System.out.println(a+b);
}
}