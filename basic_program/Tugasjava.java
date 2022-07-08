import java.util.Scanner;
public class Tugasjava {
    // SOAL NO.1 MEMBUAT LUAS SEGITIGA DENGAN INPUT ALAS DAN TINGGI
    // metode 1 membuat fungsi dari Luas segitiga
    public static int luassegitiga(int alasseg,int tinggiseg) {
        int Luass;
        Luass = (alasseg * tinggiseg / 2);
        // Mengembalikan hasil yang telah dihasilkan ke variabel Luas
        return Luass;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // SOAL NO.2 membuat fungsi dari penentuan nilai A,B,C,D
    // Cara 1
    public static int Lulus(int SkorNilai){
        if (SkorNilai <= 0){
            System.out.println("NILAI TIDAK VALID");
        }
        else if (SkorNilai> 0 && SkorNilai <= 34){
            System.out.println("Nilai D");
        }
        else if (SkorNilai >= 35 && SkorNilai <= 49 ){
            System.out.println("Nilai C");
        }
        else if (SkorNilai >= 50 && SkorNilai <= 64){
            System.out.println("Nilai B");
        }
        else if (SkorNilai >= 65 && SkorNilai <= 79){
            System.out.println("NILAI B+");
        }
        else if (SkorNilai >= 80 && SkorNilai <= 100){
            System.out.println("NILAI A !! GOODJOB");
        }
        else if (SkorNilai >=101){
            System.out.println("NILAI TIDAK VALID");
        }
        return SkorNilai;
    }
    // Cara kedua soal no.2 dengan mengisi secara manual nilai variabelnya.
    public static void main (String[] args){
        // memberikan value pada variabel
        int alas = 10;
        int tinggi = 20;
        // Pendeklarasian variabel luas
        int luas;
        // Rumus dari LUAS SEGITIGA
        luas = (alas*tinggi/2);
        // Mengprint luas
        System.out.println(luas);

    // Memanggil fungsi luassegitiga pada cara 1
        System.out.println(luassegitiga(20,25));
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("================== SOAL NO 2 =====================");
        // Soal nomor 2
        // Menggunakan cara 2
        // Mendeklarasikan nilai dengan intejer
        int nilai;
        // Memasukkan variabel nilai
        nilai = 109;
        // Jika nilai kurang dari 0 maka NILAI TIDAK VALID
        if (nilai <= 0){
            System.out.println("NILAI TIDAK VALID");
            }
        // Jika nilai 0 - 34 maka akan mendapat nilai D
        else if (nilai> 0 && nilai <= 34){
            System.out.println("Nilai D");
        }
        // Jika nilai 35 - 49 maka akan mendapat nilai C
        else if (nilai >= 35 && nilai <= 49 ){
            System.out.println("Nilai C");
        }
        // Jika nilai 50 - 64 akan mendapat nilai B
        else if (nilai >= 50 && nilai <= 64){
            System.out.println("Nilai B");
        }
        // Jika nilai 65 - 79 akan mendapat nilai B+
        else if (nilai >= 65 && nilai <= 79){
            System.out.println("NILAI B+");
        }
        // Jika nilai 80 - 100 akan mendapat nilai A
        else if (nilai >= 80 && nilai <= 100){
            System.out.println("NILAI A !! GOODJOB");
        }
        // Nilai diatas 100 akan dianggap tidak valid
        else if (nilai >=101){
            System.out.println("NILAI TIDAK VALID");
        }

        //Memanggil fungsi LULUS yang sudah dibuat di cara 1
        System.out.println(Lulus(75));

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("================== SOAL NO 3 =====================");
        //mendeklarasikan variabel bilangan sebagai integer
        int bilangan;
        //membuat object scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin dicari faktornya : ");
        bilangan = input.nextInt();
        System.out.print("Faktor dari " + bilangan + " adalah : ");
        for(int i=1;i<=bilangan;i++)
        {
            if(bilangan%i == 0)
            {
                System.out.print(i + " ");
            }
        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("================== SOAL NO 4 =====================");
        Scanner masukan = new Scanner(System.in);
        int bil, awal, akhir;

        System.out.println("PROGRAM JAVA MENAMPILKAN DERET BILANGAN PRIMA");
        System.out.print("Mulai dari : ");
        awal=masukan.nextInt();
        System.out.print("Sampai : ");
        akhir=masukan.nextInt();
        System.out.println("----------------------------------------------");
        for (int i=awal; i<=akhir; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        String teks = "Radar", teks2 = "";

        int strLength = teks.length();

        for (int i = (strLength - 1); i >=0; --i) {
            teks2 = teks2 + teks.charAt(i);
        }

        if (teks.toLowerCase().equals(teks2.toLowerCase())) {
            System.out.println(teks + " adalah Palindrom.");
        }
        else {
            System.out.println(teks + " Bukan Palindrom.");
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        for(int angka = 0; angka < 10; angka++)
        {   for(int angka2 = 0; angka2 < 10; angka2++)
        {;
            System.out.print(angka);}
            System.out.println(""); }
        }
    }


