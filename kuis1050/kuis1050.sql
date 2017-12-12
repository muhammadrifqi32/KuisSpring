-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 15.45
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis1050`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `cv_1050`
--

CREATE TABLE `cv_1050` (
  `id` bigint(20) NOT NULL,
  `classes` varchar(255) DEFAULT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1050`
--

CREATE TABLE `nilai_1050` (
  `id` bigint(20) NOT NULL,
  `score` double NOT NULL,
  `subject_name` varchar(150) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `cv_1050_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1050`
--
ALTER TABLE `cv_1050`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_hdsq7onyf5u56ao359nyf62i2` (`name`);

--
-- Indexes for table `nilai_1050`
--
ALTER TABLE `nilai_1050`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK48l0wk469qseivaqt4dtfd9vf` (`cv_1050_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1050`
--
ALTER TABLE `cv_1050`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `nilai_1050`
--
ALTER TABLE `nilai_1050`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `nilai_1050`
--
ALTER TABLE `nilai_1050`
  ADD CONSTRAINT `FK48l0wk469qseivaqt4dtfd9vf` FOREIGN KEY (`cv_1050_id`) REFERENCES `cv_1050` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
