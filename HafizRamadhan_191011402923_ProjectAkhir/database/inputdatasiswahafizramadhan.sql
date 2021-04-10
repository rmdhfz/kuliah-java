-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 10 Apr 2021 pada 05.33
-- Versi server: 10.4.14-MariaDB
-- Versi PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inputdatasiswahafizramadhan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `hafizramadhan_guru`
--

CREATE TABLE `hafizramadhan_guru` (
  `id` int(4) NOT NULL,
  `name` varchar(35) NOT NULL,
  `code` varchar(5) NOT NULL,
  `gender` varchar(35) DEFAULT NULL,
  `address` varchar(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `hafizramadhan_guru`
--

INSERT INTO `hafizramadhan_guru` (`id`, `name`, `code`, `gender`, `address`) VALUES
(2, 'Haiz Guru', 'G001', 'Laki-laki', 'Bogor');

-- --------------------------------------------------------

--
-- Struktur dari tabel `hafizramadhan_kelas`
--

CREATE TABLE `hafizramadhan_kelas` (
  `id` int(4) NOT NULL,
  `name` varchar(35) NOT NULL,
  `code` varchar(5) DEFAULT NULL,
  `capacity` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `hafizramadhan_kelas`
--

INSERT INTO `hafizramadhan_kelas` (`id`, `name`, `code`, `capacity`) VALUES
(1, 'Kelas A', 'A123', 50);

-- --------------------------------------------------------

--
-- Struktur dari tabel `hafizramadhan_penilaian_mahasiswa`
--

CREATE TABLE `hafizramadhan_penilaian_mahasiswa` (
  `id` int(5) NOT NULL,
  `name` varchar(35) NOT NULL,
  `uts` varchar(10) NOT NULL,
  `tm` varchar(10) NOT NULL,
  `uas` varchar(10) NOT NULL,
  `grade` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `hafizramadhan_siswa`
--

CREATE TABLE `hafizramadhan_siswa` (
  `id` int(4) NOT NULL,
  `name` varchar(35) NOT NULL,
  `gender` varchar(35) DEFAULT NULL,
  `address` varchar(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `hafizramadhan_siswa`
--

INSERT INTO `hafizramadhan_siswa` (`id`, `name`, `gender`, `address`) VALUES
(4, 'Hafiz Ramadhan', 'Laki-laki', 'Bogor');

-- --------------------------------------------------------

--
-- Struktur dari tabel `hafizramadhan_user`
--

CREATE TABLE `hafizramadhan_user` (
  `id` int(4) NOT NULL,
  `name` varchar(35) NOT NULL,
  `email` varchar(35) DEFAULT NULL,
  `username` varchar(35) NOT NULL,
  `password` varchar(50) NOT NULL,
  `is_active` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `hafizramadhan_user`
--

INSERT INTO `hafizramadhan_user` (`id`, `name`, `email`, `username`, `password`, `is_active`) VALUES
(1, 'Hafiz Ramadhan', 'hfzrmd@gmail.com', 'hafiz', 'mimin', 1);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `hafizramadhan_guru`
--
ALTER TABLE `hafizramadhan_guru`
  ADD PRIMARY KEY (`id`),
  ADD KEY `name` (`name`),
  ADD KEY `gender` (`gender`),
  ADD KEY `address` (`address`);

--
-- Indeks untuk tabel `hafizramadhan_kelas`
--
ALTER TABLE `hafizramadhan_kelas`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `hafizramadhan_penilaian_mahasiswa`
--
ALTER TABLE `hafizramadhan_penilaian_mahasiswa`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `hafizramadhan_siswa`
--
ALTER TABLE `hafizramadhan_siswa`
  ADD PRIMARY KEY (`id`),
  ADD KEY `name` (`name`),
  ADD KEY `gender` (`gender`),
  ADD KEY `address` (`address`);

--
-- Indeks untuk tabel `hafizramadhan_user`
--
ALTER TABLE `hafizramadhan_user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `hafizramadhan_guru`
--
ALTER TABLE `hafizramadhan_guru`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `hafizramadhan_kelas`
--
ALTER TABLE `hafizramadhan_kelas`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `hafizramadhan_penilaian_mahasiswa`
--
ALTER TABLE `hafizramadhan_penilaian_mahasiswa`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT untuk tabel `hafizramadhan_siswa`
--
ALTER TABLE `hafizramadhan_siswa`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `hafizramadhan_user`
--
ALTER TABLE `hafizramadhan_user`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
