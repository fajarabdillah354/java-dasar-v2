public class OperasiAssigment {
    /*
     kita dapat memberikan tugas kepada beberapa variable dalam operasinya termasuk operasi ini, contoh dari operasi ini adalah :
        a = 100;
        a = a +20 --> a+=20 (ini berlaku bagi semua operator termasuk modulo atau sisa bagi
     */


    public static void main(String[] args) {
        int x = 50;
        x += 30;
        System.out.println(x);


        /*
        Operator unary:
        ++ yaitu x + 1
        -- yaitu x - 1
        - yaitu negative
        + yaitu positif
        ! yaitu tidak sama dengan
         */

        int a = 10;
        a++;
        int b = 10;
        b--;

        System.out.println(a);//dia akan bertambah 1
        System.out.println(b);// dia akan berkurang 1

        {
            /*
            operasi perbandingan
            * operasi yang digunakan untuk membandiingkan 2 buah data
            * akan menghasilkan nilai boolean yaitu true dan false
            contoh dari operasi perbandingan yaitu
            >
            <
            =
            <=
            >=
            !=

             */

            var nilai1 = 100;
            var nilai2 = 50;
            var nilai3 = 100;
            System.out.println(nilai1 < nilai2);
            System.out.println(nilai1 > nilai3);
            System.out.println(nilai1 == nilai3);
            System.out.println(nilai1 >= nilai2);
            System.out.println(nilai3 <= nilai1);
            System.out.println(nilai1 != nilai2 );




        }

    }
}
