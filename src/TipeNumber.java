public class TipeNumber {
//    pada java ada beberapa tipe data number seperti :
//    1. byte (BATASNYA 100 AN)
//    2. short (BATASNYA 10000 AN)
//    3. int (BATASNYA 2 MILYAR AN)
//    4. long (TAK HINGGA)
    public static void main(String[] args) {
//        INI ADALAH CONTOH DARI BYTE

        byte iniByte = 100;
        short iniShort = 10000;
        int iniInt = 1000000000;
        long iniLong = 1000000000;

        System.out.println(iniByte);

        // konversi tipe data number dengan otomatis(ini karena mengkonversi dari tipe data besar ke kecil ke besar
        byte tipebyte = 124;
        long tipeLong = tipebyte;
        System.out.println(tipeLong);

        // konversi tipe data number dengan narrowing(tidak otomatis) karena konversi dari tipe data besar ke kecil sehingga untuk indexnya tidak muat
        short tipeShort = 10000;
        byte konverByte = (byte) tipeShort;
        System.out.println(konverByte);

    }



}
