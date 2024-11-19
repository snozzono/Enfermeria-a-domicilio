-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 19, 2024 at 04:28 AM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bdtrabajo`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbadministrador`
--

CREATE TABLE `tbadministrador` (
  `id_admin` varchar(225) NOT NULL,
  `usuario` varchar(225) NOT NULL,
  `passwrd` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbadministrador`
--

INSERT INTO `tbadministrador` (`id_admin`, `usuario`, `passwrd`) VALUES
('A001', 'pepito', 'grandepepito');

-- --------------------------------------------------------

--
-- Table structure for table `tbmedicamento`
--

CREATE TABLE `tbmedicamento` (
  `id_med` int(225) NOT NULL,
  `precio` int(225) NOT NULL,
  `cant` int(225) NOT NULL,
  `nombre_med` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbmedicamento`
--

INSERT INTO `tbmedicamento` (`id_med`, `precio`, `cant`, `nombre_med`) VALUES
(1001, 0, 1500, '100'),
(1002, 0, 2000, '50'),
(1003, 0, 3500, '80'),
(1004, 0, 1200, '200');

-- --------------------------------------------------------

--
-- Table structure for table `tbpaciente`
--

CREATE TABLE `tbpaciente` (
  `run_pac` int(225) NOT NULL,
  `nombre_p` varchar(225) NOT NULL,
  `diagn` varchar(225) NOT NULL,
  `med_id_med` int(225) NOT NULL,
  `proc_id_med` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tbprocedimiento`
--

CREATE TABLE `tbprocedimiento` (
  `id_pr` int(225) NOT NULL,
  `precio` int(225) NOT NULL,
  `nombre` varchar(225) NOT NULL,
  `descr` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbprocedimiento`
--

INSERT INTO `tbprocedimiento` (`id_pr`, `precio`, `nombre`, `descr`) VALUES
(1001, 5000, 'Toma de presión arterial', 'Medición de la presión arterial del paciente.'),
(1002, 15000, 'Aplicación de vacuna', 'Aplicación de vacunas de rutina como antigripal o tétanos.'),
(1003, 7000, 'Curación de heridas', 'Limpieza y curación de heridas superficiales.'),
(1004, 8000, 'Toma de muestras', 'Toma de muestras de sangre o exudados para análisis.');

-- --------------------------------------------------------

--
-- Table structure for table `tbtecnico`
--

CREATE TABLE `tbtecnico` (
  `run_tec` int(225) NOT NULL,
  `usuario` varchar(225) NOT NULL,
  `passwrd` varchar(225) NOT NULL,
  `pac_run_pac` int(8) NOT NULL,
  `admin_id_admin` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbadministrador`
--
ALTER TABLE `tbadministrador`
  ADD PRIMARY KEY (`id_admin`),
  ADD UNIQUE KEY `usuario` (`usuario`);

--
-- Indexes for table `tbmedicamento`
--
ALTER TABLE `tbmedicamento`
  ADD PRIMARY KEY (`id_med`);

--
-- Indexes for table `tbpaciente`
--
ALTER TABLE `tbpaciente`
  ADD PRIMARY KEY (`run_pac`),
  ADD KEY `fk_med_id_med` (`med_id_med`),
  ADD KEY `fk_proc_id_med` (`proc_id_med`);

--
-- Indexes for table `tbprocedimiento`
--
ALTER TABLE `tbprocedimiento`
  ADD PRIMARY KEY (`id_pr`);

--
-- Indexes for table `tbtecnico`
--
ALTER TABLE `tbtecnico`
  ADD PRIMARY KEY (`run_tec`),
  ADD KEY `fk_admin_id_admin` (`admin_id_admin`),
  ADD KEY `fk_tec_run_pac` (`pac_run_pac`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbpaciente`
--
ALTER TABLE `tbpaciente`
  ADD CONSTRAINT `fk_med_id_med` FOREIGN KEY (`med_id_med`) REFERENCES `tbmedicamento` (`id_med`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_proc_id_med` FOREIGN KEY (`proc_id_med`) REFERENCES `tbprocedimiento` (`id_pr`);

--
-- Constraints for table `tbtecnico`
--
ALTER TABLE `tbtecnico`
  ADD CONSTRAINT `fk_admin_id_admin` FOREIGN KEY (`admin_id_admin`) REFERENCES `tbadministrador` (`id_admin`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_tec_run_pac` FOREIGN KEY (`pac_run_pac`) REFERENCES `tbpaciente` (`run_pac`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
