
// Membuat class ongkir


public class BiayaOngkir{
    // mendeklarasikan antribut
    int panjang;
    int lebar;
    int tinggi;
    float berat;
    // Membuat Constructor
    public BiayaOngkir(int inputPanjang, int inputLebar, int inputTinggi,float inputBerat){
        panjang = inputPanjang;
        lebar = inputLebar;
        tinggi = inputTinggi;
        berat = inputBerat;
    }
    int HargaOngkir(){
        int vol = tinggi * lebar * panjang;
        if ( berat <= 1) && (vol <=50){
            return 5000;
        }
        else
        { return 10000;}
    }
public class Ongkir {
        public static void main(String[] args){
            BiayaOngkir Barang1 = new BiayaOngkir(3,4,10,2.0);
            System.out.println(Barang1);
        }
}

}
