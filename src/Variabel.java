public class Variabel {

//    Variable adalah tempat untuk menyimpan data,
//    pada java variabel hanya bisa memuat satu tipedata saja (hanya tipe data yang sama)
//    * saat membuat variable tidah boleh ada spasi kecuali dengan menggunakan undescore
//    * angka tidak boleh diletakkan pada depan variabel


    public static void main(String[] args) {
        //contoh membuat variabel
        String name = "Fajar Abdillah Ahmad";
        int umur = 21;
        char golongan_darah = 'b';
        System.out.println(name + " " + umur + " Golongan darah : "+golongan_darah);
        test();


    }

    public  static  void test(){
//        ini adalah contoh penulian variabel dengan  kata kunci var, kita dapat menuliskan variabel dengan tipe data var, saat menggunakan var maka kita harus langsung memberi inisiasi pada valuenya(harus langsung bervalue)
        var kampus = "Uhamka Jakarta Timur";
        System.out.println(kampus);
    }



}
