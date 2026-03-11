DEFINITELY NOT THE RADICAL CLUB

Deskripsi:
Soal ini meminta membuat program untuk seleksi anggota sebuah klub.
Ada 2 petugas: Satu bertugas memverifikasi usia, dan yang satunya bertugas memproses antrean.

Keterangan:
- Proses rekrutmen  membutuhkan minimal 8 tahun
- Usia minimal untuk mulai bergabung adalah 20 tahun
- Usia minimum yang lolol adalah 28 tahun
- Usia maksimum yang diperbolehkan bergabung tidak lebih dari 118 tahun

Cara Kerja:
1. User memasukkan input berupa string angka yang dipisah spasi
2. Angka dimasukkan ke dalam Queue satu persatu
3. Setiap angka dicek apakah berada di range 28-118
4. Angka yang lolos masuk ke queue lulus, sisanya ke queue tidaklulus

Simulasi Input & Output:
Input: 39 538 39 55 12 28 49 430
Output: [39, 39, 55, 28, 49]
        [538, 12, 430]

Input: 29 48 52 28 27 104 58 395 57
Output: [29, 48, 52, 28, 104, 58, 57]
        [27, 395]
        
Constraint
- 0 < n <= 1000
- Input berupa String, output berupa int
- Menggunakan Queue dengan method add(), remove(), enqueue(), dan dequeue()