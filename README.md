# Java Dasar-V2

Repository ini berisi materi dasar pemrograman Java yang mencakup konsep fundamental yang perlu dikuasai oleh pemula sebelum masuk ke topik yang lebih lanjut.

## 📌 Daftar Isi
1. [Pengenalan Java](#pengenalan-java)
2. [Struktur Dasar Program Java](#struktur-dasar-program-java)
3. [Tipe Data & Variabel](#tipe-data--variabel)
4. [Operator dalam Java](#operator-dalam-java)
5. [Percabangan](#percabangan)
6. [Perulangan](#perulangan)
7. [Array](#array)
8. [Method & Fungsi](#method--fungsi)
9. [Konsep OOP dalam Java](#konsep-oop-dalam-java)
10. [Exception Handling](#exception-handling)

## 🏁 Pengenalan Java
Java adalah bahasa pemrograman yang dikembangkan oleh Sun Microsystems (sekarang bagian dari Oracle). Java bersifat **platform-independent** berkat konsep "Write Once, Run Anywhere" (WORA).

## 📜 Struktur Dasar Program Java
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## 🔢 Tipe Data & Variabel
- **Primitif**: `int`, `double`, `float`, `char`, `boolean`, `byte`, `short`, `long`
- **Referensi**: `String`, `Array`, `Class`, `Interface`

Contoh penggunaan variabel:
```java
int umur = 25;
String nama = "Budi";
boolean isActive = true;
```

## ➕ Operator dalam Java
- **Aritmatika** (`+`, `-`, `*`, `/`, `%`)
- **Relasional** (`==`, `!=`, `>`, `<`, `>=`, `<=`)
- **Logika** (`&&`, `||`, `!`)
- **Bitwise** (`&`, `|`, `^`, `~`, `<<`, `>>`)

## 🔀 Percabangan
- **if-else**
- **switch-case**

```java
int angka = 10;
if (angka > 5) {
    System.out.println("Angka lebih besar dari 5");
} else {
    System.out.println("Angka 5 atau lebih kecil");
}
```

## 🔁 Perulangan
- **for**
- **while**
- **do-while**

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iterasi ke-" + i);
}
```

## 📂 Array
```java
int[] angka = {1, 2, 3, 4, 5};
System.out.println(angka[0]);
```

## 🔧 Method & Fungsi
```java
public static int tambah(int a, int b) {
    return a + b;
}
```

## 🏛️ Konsep OOP dalam Java
- **Class & Object**
- **Encapsulation**
- **Inheritance**
- **Polymorphism**
- **Abstraction**

```java
class Mahasiswa {
    String nama;
    int umur;
}
```

## ⚠️ Exception Handling
```java
try {
    int hasil = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Terjadi kesalahan: " + e.getMessage());
}
```

## 💡 Kontribusi
Silakan lakukan pull request jika ingin menambahkan materi baru atau memperbaiki kesalahan.



