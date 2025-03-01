public class OperasiBoolean {

//    adalah suatu operasi yang menghasilkan nilai benar dan salah

    public static void main(String[] args) {
        /*
        operator yang tersedia meliputi (&&,||,!)
        keterangan --> && adalah DAN
                       || adalah ATAU
                       ! adalah NOT ATAU KEBALIKAN

        * nilai kebenaran untuk && (DAN)
            T DAN T = T
            selain dari diatas adalah false
        * nilai kebenaran untuk || (ATAU)
            AKAN SELALU BERNILAI TRUE selain FALSE || FALSE

         */

        var nilaiUTS = 78;
        var nilaiUAS = 80;
        var lulusKuliah = nilaiUAS >= 68 && nilaiUTS >= 70;
        if(lulusKuliah = true){
            System.out.println("selamat anda lulus kuliah");
        }
        System.out.println(lulusKuliah);


    }
}
