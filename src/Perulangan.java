public class Perulangan {
    public static void main(String[] args) {
        /*
        FOOR LOOP
        * for adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan
        * blok kode yang terdapat dalam for akan selalu diulangi selama kondisi for terpenuhi
        * for biasanya digunakan untuk melakukan pengecekan yang harus mengurutkan data
         */

        /**SINTAK MENGGUNAKAN FOR
         * for(init statement; kondisi; post statement){
            //blok kode for
         }
         * init statement akan dieksekusi hanya sekali di awal sebelum perulangan
         * kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan jika false maka perulnagna akan dihentikan
         * ini statment, kondisi dan post statment tidak wajib diisi, jika kondisi tidak diisi, berarti kondisi selalu bernilai true(nilai default)
         */

        for(var data = 1; data <= 5; data++){
            System.out.println("perulangna ke - " + data);
        }
    }
}
