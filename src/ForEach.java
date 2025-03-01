public class ForEach {


    public static void main(String[] args) {
        /*
        PERULANGAN DENGAN MENGGUNAKAN FOREACH LEBIH SEDERHANA DARIPADA FOR BIASA KARNA KITA TIDAK PERLU
         */

        //CONTOH JIKA TIDAK MENGGUNAKAN FOREACH
        String[] arrayName = {
          "fajar", "sandi", "ryan", "hasan"
        };
        for (int i = 0; i<arrayName.length; i++){
            System.out.println("perulangan ke - "+ i +" "+ arrayName[i]);

        }

        //CONTOH JIKA MENGGUNAKAN FOREACH, ini akan jauh lebih efiesien untuk perulangan yang tidak memerlukan angka
        System.out.println("========= INI CONTOH JIKA MEMAKAI FOREACH =========");
        for(var name : arrayName){
            System.out.println("perulangan : "+ name);
        }
    }
}
