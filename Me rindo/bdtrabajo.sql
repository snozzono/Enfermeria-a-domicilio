-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 26, 2024 at 05:05 PM
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
  `id_admin` int(11) NOT NULL,
  `usuario` varchar(225) NOT NULL,
  `passwrd` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbadministrador`
--

INSERT INTO `tbadministrador` (`id_admin`, `usuario`, `passwrd`) VALUES
(1, 'Carlos', '4837'),
(2, 'María', '2910'),
(3, 'José', '7492'),
(4, 'Ana', '8264');

-- --------------------------------------------------------

--
-- Table structure for table `tbdecisiones`
--

CREATE TABLE `tbdecisiones` (
  `llamado` int(255) NOT NULL,
  `Administrador` int(255) NOT NULL,
  `Medicamento` int(255) NOT NULL,
  `Paciente` int(255) NOT NULL,
  `Procedimiento` int(255) NOT NULL,
  `Tecnico` int(255) NOT NULL,
  `Origen` int(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbdecisiones`
--

INSERT INTO `tbdecisiones` (`llamado`, `Administrador`, `Medicamento`, `Paciente`, `Procedimiento`, `Tecnico`, `Origen`) VALUES
(1, 3, 1, 37, 1, 10, 0);

-- --------------------------------------------------------

--
-- Table structure for table `tbmedicamento`
--

CREATE TABLE `tbmedicamento` (
  `id_med` int(225) NOT NULL,
  `cronico` tinyint(1) NOT NULL,
  `Ciclo` int(225) NOT NULL,
  `nombre_med` varchar(225) NOT NULL,
  `tomar` date DEFAULT NULL,
  `pac_run_pac` int(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbmedicamento`
--

INSERT INTO `tbmedicamento` (`id_med`, `cronico`, `Ciclo`, `nombre_med`, `tomar`, `pac_run_pac`) VALUES
(456789012, 1, 24, 'Amoxicilina', '2024-11-24', 13458927),
(567890123, 0, 3, 'Omeprazol', '2024-11-25', 13458927),
(678901234, 1, 12, 'Paracetamol', '2024-11-26', 15873942),
(789012345, 0, 6, 'Ibuprofeno', '2024-11-27', 15873942),
(890123456, 1, 24, 'Amoxicilina', '2024-11-28', 15873942),
(901234567, 0, 3, 'Omeprazol', '2024-11-29', 15873942),
(1234567890, 1, 12, 'paracetamol', '2024-11-22', 13458927),
(2147483647, 0, 6, 'Ibuprofeno', '2024-11-23', 13458927);

-- --------------------------------------------------------

--
-- Table structure for table `tbpaciente`
--

CREATE TABLE `tbpaciente` (
  `run_pac` int(225) NOT NULL,
  `nombre_p` varchar(225) NOT NULL,
  `diagn` varchar(225) NOT NULL,
  `tec_run_tec` int(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbpaciente`
--

INSERT INTO `tbpaciente` (`run_pac`, `nombre_p`, `diagn`, `tec_run_tec`) VALUES
(12345983, 'Ana', 'Epilepsia', 8956734),
(12983457, 'Eduardo', 'Diabetes', 9143827),
(13298475, 'Gabriela', 'Asma', 7823492),
(13458927, 'Javier', 'Hipertensión', 8956734),
(13984572, 'Ricardo', 'Migraña', 7623491),
(14392847, 'Sara', 'Colesterol Alto', 8291732),
(14392857, 'Rafael', 'Hipertensión', 7823492),
(14398275, 'Francisca', 'Depresión', 7632193),
(14927385, 'María', 'Hipotiroidismo', 8934728),
(15394872, 'Sofía', 'Estrés', 8934728),
(15398472, 'Marta', 'Gastritis', 7623491),
(15678234, 'Fernando', 'Hipotiroidismo', 8291732),
(15873942, 'Clara', 'Diabetes', 8956734),
(17283549, 'Tomás', 'Ansiedad', 9143827),
(17284913, 'Paula', 'Artritis', 7623491),
(17492835, 'Esteban', 'Gastritis', 7823492),
(18273945, 'Alonso', 'Hipotiroidismo', 7632193),
(18293754, 'Lucía', 'Migraña', 8934728),
(18372945, 'Patricia', 'Migraña', 9143827),
(18394725, 'Carmen', 'Insomnio', 8291732),
(18394726, 'Hugo', 'Insomnio', 7632193),
(18743592, 'Victoria', 'Hipertensión', 9143827),
(19283457, 'Daniela', 'Ansiedad', 7632193),
(19283745, 'Luis', 'Estrés', 8291732),
(19384752, 'Antonio', 'Colesterol Alto', 8934728),
(19487325, 'Sergio', 'Asma', 8956734),
(19824357, 'Andrea', 'Depresión', 7823492),
(19834752, 'Juan', 'Hipertensión', 7623491);

-- --------------------------------------------------------

--
-- Table structure for table `tbprocedimiento`
--

CREATE TABLE `tbprocedimiento` (
  `id_pr` int(225) NOT NULL,
  `precio` int(225) NOT NULL,
  `nombre` varchar(225) NOT NULL,
  `descr` varchar(225) NOT NULL,
  `pago` tinyint(1) NOT NULL,
  `fecha` date NOT NULL,
  `pac_run_pac` int(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbprocedimiento`
--

INSERT INTO `tbprocedimiento` (`id_pr`, `precio`, `nombre`, `descr`, `pago`, `fecha`, `pac_run_pac`) VALUES
(109876543, 8500, 'Inyección', 'Aplicación de vacuna', 0, '2024-11-29', 15873942),
(210987654, 18000, 'Extracción de puntos', 'Extracción de sutura', 1, '2024-11-28', 15873942),
(321098765, 12000, 'Toma de presión', 'Control de presión arterial', 0, '2024-11-27', 15873942),
(432109876, 20000, 'Curación', 'Curación de herida profunda', 1, '2024-11-26', 15873942),
(543210987, 10000, 'Inyección', 'Aplicación de inyección intramuscular', 0, '2024-11-25', 13458927),
(654321098, 25000, 'Extracción de puntos', 'Extracción de puntos de sutura', 1, '2024-11-24', 13458927),
(765432109, 7500, 'Toma de presión', 'Medición de presión arterial', 0, '2024-11-23', 13458927),
(876543210, 15000, 'Curación', 'Curación de herida leve', 1, '2024-11-22', 13458927);

-- --------------------------------------------------------

--
-- Table structure for table `tbtecnico`
--

CREATE TABLE `tbtecnico` (
  `run_tec` int(225) NOT NULL,
  `usuario` varchar(225) NOT NULL,
  `passwrd` varchar(225) NOT NULL,
  `admin_id_admin` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbtecnico`
--

INSERT INTO `tbtecnico` (`run_tec`, `usuario`, `passwrd`, `admin_id_admin`) VALUES
(7623491, 'Laura', '9832', 1),
(7632193, 'Andrés', '9283', 2),
(7823492, 'Luis', '7354', 2),
(8129473, 'Mario', '6375', 3),
(8192374, 'Valeria', '1427', 2),
(8192746, 'Daniela', '7105', 3),
(8291732, 'Pedro', '2746', 1),
(8291736, 'Francisca', '2648', 4),
(8391742, 'Esteban', '5903', 4),
(8734925, 'Fernanda', '1483', 4),
(8739247, 'Carolina', '8254', 3),
(8923475, 'Miguel', '2941', 3),
(8923476, 'Ricardo', '3128', 4),
(8934728, 'Sofía', '3857', 2),
(8956734, 'Diego', '4821', 1),
(9143827, 'Camila', '6198', 1);

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
  ADD PRIMARY KEY (`id_med`),
  ADD KEY `pk_runpac2` (`pac_run_pac`);

--
-- Indexes for table `tbpaciente`
--
ALTER TABLE `tbpaciente`
  ADD PRIMARY KEY (`run_pac`),
  ADD KEY `fk_tec_run_tec` (`tec_run_tec`);

--
-- Indexes for table `tbprocedimiento`
--
ALTER TABLE `tbprocedimiento`
  ADD PRIMARY KEY (`id_pr`),
  ADD KEY `pk_runpac` (`pac_run_pac`);

--
-- Indexes for table `tbtecnico`
--
ALTER TABLE `tbtecnico`
  ADD PRIMARY KEY (`run_tec`),
  ADD KEY `fk_tec_id_admin` (`admin_id_admin`) USING BTREE;

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbadministrador`
--
ALTER TABLE `tbadministrador`
  MODIFY `id_admin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbmedicamento`
--
ALTER TABLE `tbmedicamento`
  ADD CONSTRAINT `pk_runpac2` FOREIGN KEY (`pac_run_pac`) REFERENCES `tbpaciente` (`run_pac`);

--
-- Constraints for table `tbpaciente`
--
ALTER TABLE `tbpaciente`
  ADD CONSTRAINT `fk_tec_run_tec` FOREIGN KEY (`tec_run_tec`) REFERENCES `tbtecnico` (`run_tec`);

--
-- Constraints for table `tbprocedimiento`
--
ALTER TABLE `tbprocedimiento`
  ADD CONSTRAINT `pk_runpac` FOREIGN KEY (`pac_run_pac`) REFERENCES `tbpaciente` (`run_pac`);

--
-- Constraints for table `tbtecnico`
--
ALTER TABLE `tbtecnico`
  ADD CONSTRAINT `fk_admin_id_admin` FOREIGN KEY (`admin_id_admin`) REFERENCES `tbadministrador` (`id_admin`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
