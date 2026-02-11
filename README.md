# Sistem Informasi Peminjaman Inventaris Kampus

## Deskripsi
Sistem Informasi Peminjaman Inventaris Kampus adalah aplikasi berbasis desktop yang dikembangkan menggunakan bahasa pemrograman Java dengan konsep Pemrograman Berorientasi Objek (PBO).  
Aplikasi ini bertujuan untuk membantu proses pencatatan dan pengelolaan peminjaman barang inventaris kampus secara terstruktur dan terintegrasi dengan database.

Aplikasi ini dibuat sebagai tugas **Ujian Akhir Semester (UAS)** mata kuliah **Pemrograman Berorientasi Objek**.

---

## Tujuan Aplikasi
- Mencatat data peminjam inventaris kampus
- Mengelola data barang inventaris
- Memproses transaksi peminjaman barang
- Mengurangi kesalahan pencatatan manual
- Meningkatkan efisiensi pengelolaan inventaris

---

## Fitur Utama
- Input data peminjam
- Input data barang inventaris
- Proses peminjaman barang
- Penyimpanan data ke database MySQL/MariaDB
- Menampilkan detail peminjaman
- Penerapan konsep MVC dan DAO

---

## Teknologi yang Digunakan
- Java (JDK)
- Eclipse IDE
- MySQL / MariaDB (XAMPP)
- JDBC (Java Database Connectivity)
- GitHub

---

## Konsep PBO yang Diterapkan
- Class dan Object
- Encapsulation
- Constructor
- Relasi antar class (Association)
- MVC (Model, View, Controller)
- DAO (Data Access Object)

---

## Struktur Database
Database terdiri dari 3 tabel utama:
- **peminjam**
- **barang**
- **peminjaman**

Relasi antar tabel menggunakan **primary key** dan **foreign key** untuk menjaga integritas data.

---

## UML & ERD
- Use Case Diagram
- Class Diagram
- Entity Relationship Diagram (ERD)

Diagram digunakan sebagai acuan perancangan dan telah diimplementasikan ke dalam aplikasi.

---

## Struktur Folder Project

```text
PBO-SistemPeminjamanInventaris/
├── src/
│   ├── model/
│   │   ├── Barang.java
│   │   ├── Peminjam.java
│   │   └── Peminjaman.java
│   ├── dao/
│   │   ├── BarangDAO.java
│   │   ├── PeminjamDAO.java
│   │   └── PeminjamanDAO.java
│   ├── controller/
│   │   └── ControllerPeminjaman.java
│   ├── view/
│   │   ├── ViewMenu.java
│   │   └── FormPeminjaman.java
│   ├── database/
│   │   └── Koneksi.java
│   └── Main.java
├── database/
│   └── database.sql
└── README.md
```


---

## Cara Menjalankan Aplikasi
1. Jalankan XAMPP dan aktifkan MySQL
2. Buat database sesuai file `database.sql`
3. Buka project di Eclipse
4. Pastikan MySQL Connector/J sudah ditambahkan ke project
5. Jalankan file `Main.java`
6. Input data melalui form atau console
7. Data akan tersimpan ke database

---

## Repository GitHub
https://github.com/USERNAME/PBO-SistemPeminjamanInventaris

> Ganti `USERNAME` dengan username GitHub Anda.

---

## Catatan
Aplikasi ini dikembangkan untuk keperluan akademik dan masih dapat dikembangkan lebih lanjut dengan fitur tambahan seperti pengembalian barang, update data, delete data, dan tampilan antarmuka yang lebih kompleks.

---

## Penutup
Dengan adanya aplikasi ini, diharapkan proses peminjaman inventaris kampus dapat dilakukan dengan lebih rapi, terstruktur, dan efisien dibandingkan dengan pencatatan manual.
