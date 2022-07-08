public class OPP {
    //Fungsi Luas Persegi
    public static int Luas_Persegi(int sisi){
        int LPersegi;
        LPersegi = sisi*sisi;
        return LPersegi;
    }
    //Fungsi luas segitiga
    public static int Luas_segi3(int alas, int tinggi){
        int LSegi3;
        LSegi3 = (alas*tinggi)/2;
        return LSegi3;
    }
    //Fungsi luas persegi panjang
    public static int Persegi_Panjang (int panjang, int lebar){
        int LPPanjang;
        LPPanjang = panjang*lebar;
        return LPPanjang;
    }
    //Fungsi Keliling Persegi
    public static int Kel_Persegi(int sisi1){
        int Keliling_persegi;
        Keliling_persegi = 4*sisi1;
        return Keliling_persegi;
    }
    //Fungsi Keliling Segitiga
    public static int Kel_S3(int a, int b, int c){
        int Keliling_Segi3;
        Keliling_Segi3 = a+b+c;
        return Keliling_Segi3;
    }
    //Fungsi keliling Persegi panjang
    public static int Kel_PPanjng(int p, int l){
        int Keliling_PPanjang;
        Keliling_PPanjang = p*l+p*l;
        return Keliling_PPanjang;

    }
    ///////////////////////////// KALKULATOR ///////////////////////////
    //Fungsi kalkulator tambah
    public static int tambah(int a , int b){
        int tambahan;
        tambahan = (a+b);
        return tambahan;
    }
    //Fungsi kalkulator pengurangan
    public static int kurang(int c , int d){
        int kurangan;
        kurangan = c-d;
        return kurangan;
    }
    //Fungsi kalkulator pembagian
    public static int bagi(int e , int f){
        int bagian;
        bagian = e/f;
        return bagian;
    }
    //Fungsi kalkulator Perkalian
    public static int kali(int g , int h){
        int perkalian;
        perkalian = g * h;
        return perkalian;
    }


    public static void main(String [] args){
        System.out.println("=========== LUAS DAN KELILING =========== ");
        System.out.println("============ LUAS ============ ");
        System.out.println(Luas_Persegi(4));
        System.out.println(Luas_segi3(3,4));
        System.out.println(Persegi_Panjang(7,8));
        System.out.println("=========== KELILING =========== ");
        System.out.println(Kel_Persegi(4));
        System.out.println(Kel_S3(3,4,5));
        System.out.println(Kel_PPanjng(7,8));

        //////////////////////////////// KALKULATOR //////////////////////////////
        System.out.println("=====Kalkulator=====");
        System.out.println(tambah(3,4));
        System.out.println(kurang(15,4));
        System.out.println(bagi(12,3));
        System.out.println(kali(10,10));




    }
}
