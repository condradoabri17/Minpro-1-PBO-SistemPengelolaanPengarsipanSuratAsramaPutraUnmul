# Sistem Pengelolaan Pengarsipan Surat Asrama Putra Universitas Mulawarman

## Deskripsi Singkat
Asrama Putra Universitas Mulawarman merupakan tempat tinggal bagi mahasiswa Universitas Mulawarman, 
khususnya mahasiswa yang berasal dari luar daerah Samarinda. Asrama ini tidak hanya berfungsi sebagai tempat tinggal, 
tetapi juga menjadi lingkungan tempat mahasiswa dapat hidup bersama, berinteraksi, serta mengikuti berbagai kegiatan dan aturan yang berlaku di lingkungan asrama.
Dalam pengelolaannya, terdapat kepengurusan yang bertugas membantu menjalankan kegiatan dan administrasi asrama, seperti Ketua, Bendahara, Sekretaris, dan bagian kepengurusan lainnya. 
Salah satu bagian administrasi yang perlu dikelola adalah surat-menyurat, baik surat yang masuk maupun surat yang dikeluarkan oleh asrama. Karena adanya berbagai jenis surat dan data penghuni yang perlu dicatat, 
diperlukan pengelolaan arsip yang teratur agar sekretaris dapat lebih mudah dalam melakukan pencatatan, penyimpanan,  dan pengelolaan data surat serta penghuni asrama.

Program ini merupakan aplikasi sederhana berbasis Java untuk membantu proses pengelolaan dan pengarsipan persuratan di Asrama Putra Universitas Mulawarman (UKM Asmaul). 
Program dibuat untuk mempermudah pengurus, khususnya sekretaris, dalam mencatat dan mengelola surat masuk, surat keluar, dan data penghuni asrama. 
Sebelumnya, alur pengarsipan surat dilakukan dengan membuat surat di Word, lalu menyimpan dokumen Word tersebut pada Google Drive, kemudian mencatat kembali data surat pada Excel. 
Program ini dibuat sebagai bentuk penyederhanaan proses pencatatan arsip surat agar data dapat dikelola dalam satu program.
Program menggunakan konsep dasar Pemrograman Berorientasi Objek (PBO) seperti class, object, constructor, ArrayList, percabangan, input, dan perulangan.

## Fitur Program
Program memiliki tiga bagian utama:
### 1. Pengelolaan Surat Masuk

Digunakan untuk mengelola surat yang diterima oleh Asrama Putra Universitas Mulawarman.

Fitur:
- Tambah surat masuk
- Tampilkan surat masuk
- Ubah/Edit surat masuk
- Hapus surat masuk

Struktur data surat masuk terdiri dari:
- Urutan surat
- Nomor surat
- Perihal
- Tanggal surat
- Pengirim

### 2. Pengelolaan Surat Keluar

Digunakan untuk mengelola surat yang dikeluarkan oleh Asrama Putra Universitas Mulawarman.

Jenis surat keluar yang tersedia:
- Surat Keluar Biasa (Surat seperti Surat pemberitahuan, Surat keterangan organisasi, atau Surat Panggilan)
- Surat Peringatan 
- Surat Izin
alasan Surat peringatan dan Izin dibuatkan fitur yang berbeda dengan surat keluar biasa adalah karena karena keduanya memiliki fungsi dan kebutuhan pengelolaan yang lebih khusus.
1. **Surat Peringatan** berkaitan dengan pencatatan dan pengawasan pelanggaran atau perilaku penghuni asrama. surat peringatan ini memiliki status SP1, SP 2, dan SP 3 (dikeluarkan dari asrama).
   Jika semisal salah satu penghuni sudah mendapat Surat Peringatan (SP) 1, maka jika melakukan pelanggaran lagi, maka dikenakan SP 2. Yang dicegah dari program ini adalah adanya kelupaan dalam pencatatan
   Surat Peringatan yang telah diberikan kepada penghuni, sehingga pemberian Surat Peringatan berikutnya dapat tidak sesuai dengan urutan dan ketentuan yang berlaku. Dan surat peringatan dibuat terpisah agar memudahkan
   sekretaris dalam langsung melihat data terakhir SP oleh penghuni terkait.
2. **Surat Izin** merupakan surat yang dikeluarkan apabila penghuni ingin tidak berada di asrama selama lebih dari satu hari, dengan batas waktu izin maksimal 7 hari.
   Pengambilan Surat Izin hanya dapat dilakukan satu kali dalam satu bulan. Jika fitur Surat Izin dicampurkan dengan surat keluar biasa,
   hal tersebut dapat mempersulit sekretaris dalam melakukan pencatatan dan melacak apakah seorang penghuni sudah mengambil Surat Izin pada bulan tersebut atau belum.
   Yang dicegah dari program ini adalah adanya kesulitan dalam mengontrol dan melacak penggunaan Surat Izin setiap penghuni, sehingga dapat terjadi pencatatan yang kurang teratur atau
   pemberian izin lebih dari satu kali dalam bulan yang sama.   

Fitur:
- Tambah surat keluar
- Tampilkan surat keluar
- Ubah surat keluar
- Hapus surat keluar

Struktur Data surat keluar terdiri dari:
- Urutan surat
- Nomor surat
- Jenis surat
- Perihal
- Tanggal surat
- Tujuan

### 3. Pengelolaan Data Penghuni

Digunakan sebagai data acuan penghuni Asrama Putra Universitas Mulawarman agar data penghuni dapat dikelola dalam program, dan 
mempermudah sekretaris dalam melacak nama lengkap, NIM, asal daerah, dsb tanpa harus menghubungi lagi penghuni yang bersangkutan.

Fitur:
- Tambah penghuni
- Tampilkan penghuni
- Ubah penghuni
- Hapus penghuni

Struktur Data penghuni terdiri dari:
- Nama
- NIM
- Asal daerah
- Fakultas
- Jurusan
- Status

## Alur Program
Alur utama program dimulai dari menu utama.

Program dimulai dengan menampilkan Menu Utama yang terdiri dari tiga bagian pengelolaan data, yaitu Surat Masuk, Surat Keluar, dan Data Penghuni, serta pilihan untuk keluar dari program.
Pada menu Surat Masuk, pengguna dapat memilih untuk menambah, menampilkan, mengubah, atau menghapus data surat masuk. Data yang dikelola meliputi urutan surat, nomor surat, perihal, tanggal surat, dan pengirim.
Pada menu Surat Keluar, pengguna dapat memilih untuk menambah, menampilkan, mengubah, atau menghapus data surat keluar. Saat menambahkan surat keluar, pengguna terlebih dahulu memilih jenis surat, yaitu Surat Biasa, Surat Peringatan, atau Surat Izin. Setelah itu, pengguna memasukkan data surat yang diperlukan.
Pada menu Data Penghuni, pengguna dapat menambah, menampilkan, mengubah, atau menghapus data penghuni asrama. Data ini digunakan sebagai data acuan penghuni dalam pengelolaan administrasi asrama.
Setelah menyelesaikan suatu proses, pengguna dapat kembali ke menu sebelumnya atau Menu Utama. Program menggunakan perulangan sehingga pengguna dapat melakukan pengelolaan data berkali-kali tanpa menjalankan ulang program.
Program akan terus berjalan sampai pengguna memilih menu Keluar, kemudian program selesai.
