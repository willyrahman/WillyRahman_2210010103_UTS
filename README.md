
## **Aplikasi Catatan Harian**

---
Aplikasi Catatan Harian berbasis GUI menggunakan Java Swing untuk mengelola catatan dengan fitur seperti menambah, mengubah, menghapus, mengekspor, dan mengimpor catatan.

---

## **Fitur Utama**

1. **Tambah Catatan**
   - Menambahkan catatan baru ke daftar.
   - Judul catatan harus unik, dan konten tidak boleh kosong.
   - Jika salah satu syarat tidak terpenuhi, akan muncul pesan error.

2. **Ubah Catatan**
   - Mengubah isi catatan yang sudah ada.
   - Pengguna harus memilih catatan dari daftar untuk memperbarui isinya.

3. **Hapus Catatan**
   - Menghapus catatan yang dipilih dari daftar.
   - Setelah catatan dihapus, input judul dan konten akan dibersihkan.

4. **Ekspor Catatan**
   - Menyimpan catatan yang dipilih ke dalam file teks.
   - File akan menyertakan judul dan isi catatan.

5. **Impor Catatan**
   - Memuat catatan dari file teks ke dalam aplikasi.
   - Jika judul catatan yang dimuat sudah ada, akan muncul pesan error.

6. **Bersihkan Input**
   - Menghapus teks di input judul dan area konten.

7. **Checkbox untuk Tombol Hapus**
   - Checkbox digunakan untuk mengaktifkan atau menonaktifkan tombol hapus.

8. **Keluar dari Aplikasi**
   - Menutup aplikasi.

---

## **Komponen GUI**
1. **JTextField (judulText)**
   - Input untuk judul catatan.
2. **JTextArea (areaKonten)**
   - Area untuk menulis isi catatan.
3. **JList (listCatatan)**
   - Menampilkan daftar catatan yang tersimpan.
4. **Tombol-tombol**
   - Berbagai tombol untuk menambah, mengubah, menghapus, dan lainnya.
5. **JCheckBox**
   - Mengontrol status tombol hapus.

---

## **Struktur Data**
1. **HashMap<String, String> (catatanMap)**
   - Menyimpan catatan dengan judul sebagai kunci dan konten sebagai nilai.
2. **DefaultListModel<String> (listModel)**
   - Mengelola elemen yang ditampilkan dalam `JList`.

---

## **Cara Menjalankan Aplikasi**

1. **Persiapan:**
   - Pastikan Anda memiliki **Java Development Kit (JDK)** terinstal di komputer Anda.
   - Simpan kode aplikasi dalam file bernama `CatatanApp.java`.

2. **Kompilasi Program:**
   - Buka terminal atau Command Prompt.
   - Arahkan ke direktori tempat file `CatatanApp.java` disimpan.
   - Jalankan perintah berikut untuk mengompilasi program:
     ```bash
     javac CatatanApp.java
     ```

3. **Menjalankan Program:**
   - Setelah proses kompilasi berhasil, jalankan program dengan perintah:
     ```bash
     java CatatanApp
     ```

4. **Menggunakan Aplikasi:**
   - GUI aplikasi akan muncul.
   - Anda dapat menggunakan fitur yang tersedia seperti:
     - **Tambah Catatan:** Menambahkan catatan baru.
     - **Ubah Catatan:** Memperbarui catatan yang sudah ada.
     - **Hapus Catatan:** Menghapus catatan yang dipilih.
     - **Ekspor Catatan:** Menyimpan catatan ke file teks.
     - **Impor Catatan:** Memuat catatan dari file teks.

---

## **Pembuat Apllikasi**
   Willy Rahman - 2210010103

## **Demo** 
   ![Demo GIF](https://github.com/willyrahman/WillyRahman_2210010103_UTS/blob/main/img/demo%20aplikasi%20catatan%20harian%20uts%20pbo2.gif)


