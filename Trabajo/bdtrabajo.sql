-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 26, 2024 at 05:53 AM
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
(1, 'admin1', 'pass1'),
(2, 'admin2', 'pass2'),
(3, 'admin3', 'pass3'),
(4, 'admin4', 'pass4');

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
  `cant` int(225) NOT NULL,
  `Ciclo` int(225) NOT NULL,
  `nombre_med` varchar(225) NOT NULL,
  `tomar` date DEFAULT NULL,
  `pac_run_pac` int(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbmedicamento`
--

INSERT INTO `tbmedicamento` (`id_med`, `cant`, `Ciclo`, `nombre_med`, `tomar`, `pac_run_pac`) VALUES
(145, 1, 0, 'medicamento145', '0000-00-00', 37),
(146, 1, 0, 'medicamento146', '0000-00-00', 37),
(147, 1, 0, 'medicamento147', '0000-00-00', 37),
(148, 1, 0, 'medicamento148', '0000-00-00', 37),
(149, 1, 0, 'medicamento149', '0000-00-00', 38),
(150, 1, 0, 'medicamento150', '0000-00-00', 38),
(151, 1, 0, 'medicamento151', '0000-00-00', 38),
(152, 1, 0, 'medicamento152', '0000-00-00', 38),
(153, 1, 0, 'medicamento153', '0000-00-00', 39),
(154, 1, 0, 'medicamento154', '0000-00-00', 39),
(155, 1, 0, 'medicamento155', '0000-00-00', 39),
(156, 1, 0, 'medicamento156', '0000-00-00', 39),
(157, 1, 0, 'medicamento157', '0000-00-00', 40),
(158, 1, 0, 'medicamento158', '0000-00-00', 40),
(159, 1, 0, 'medicamento159', '0000-00-00', 40),
(160, 1, 0, 'medicamento160', '0000-00-00', 40),
(161, 1, 0, 'medicamento161', '0000-00-00', 41),
(162, 1, 0, 'medicamento162', '0000-00-00', 41),
(163, 1, 0, 'medicamento163', '0000-00-00', 41),
(164, 1, 0, 'medicamento164', '0000-00-00', 41),
(165, 1, 0, 'medicamento165', '0000-00-00', 42),
(166, 1, 0, 'medicamento166', '0000-00-00', 42),
(167, 1, 0, 'medicamento167', '0000-00-00', 42),
(168, 1, 0, 'medicamento168', '0000-00-00', 42),
(169, 1, 0, 'medicamento169', '0000-00-00', 43),
(170, 1, 0, 'medicamento170', '0000-00-00', 43),
(171, 1, 0, 'medicamento171', '0000-00-00', 43),
(172, 1, 0, 'medicamento172', '0000-00-00', 43),
(173, 1, 0, 'medicamento173', '0000-00-00', 44),
(174, 1, 0, 'medicamento174', '0000-00-00', 44),
(175, 1, 0, 'medicamento175', '0000-00-00', 44),
(176, 1, 0, 'medicamento176', '0000-00-00', 44),
(177, 1, 0, 'medicamento177', '0000-00-00', 45),
(178, 1, 0, 'medicamento178', '0000-00-00', 45),
(179, 1, 0, 'medicamento179', '0000-00-00', 45),
(180, 1, 0, 'medicamento180', '0000-00-00', 45),
(181, 1, 0, 'medicamento181', '0000-00-00', 46),
(182, 1, 0, 'medicamento182', '0000-00-00', 46),
(183, 1, 0, 'medicamento183', '0000-00-00', 46),
(184, 1, 0, 'medicamento184', '0000-00-00', 46),
(185, 1, 0, 'medicamento185', '0000-00-00', 47),
(186, 1, 0, 'medicamento186', '0000-00-00', 47),
(187, 1, 0, 'medicamento187', '0000-00-00', 47),
(188, 1, 0, 'medicamento188', '0000-00-00', 47),
(189, 1, 0, 'medicamento189', '0000-00-00', 48),
(190, 1, 0, 'medicamento190', '0000-00-00', 48),
(191, 1, 0, 'medicamento191', '0000-00-00', 48),
(192, 1, 0, 'medicamento192', '0000-00-00', 48),
(193, 1, 0, 'medicamento193', '0000-00-00', 49),
(194, 1, 0, 'medicamento194', '0000-00-00', 49),
(195, 1, 0, 'medicamento195', '0000-00-00', 49),
(196, 1, 0, 'medicamento196', '0000-00-00', 49),
(197, 1, 0, 'medicamento197', '0000-00-00', 50),
(198, 1, 0, 'medicamento198', '0000-00-00', 50),
(199, 1, 0, 'medicamento199', '0000-00-00', 50),
(200, 1, 0, 'medicamento200', '0000-00-00', 50),
(201, 1, 0, 'medicamento201', '0000-00-00', 51),
(202, 1, 0, 'medicamento202', '0000-00-00', 51),
(203, 1, 0, 'medicamento203', '0000-00-00', 51),
(204, 1, 0, 'medicamento204', '0000-00-00', 51),
(205, 1, 0, 'medicamento205', '0000-00-00', 52),
(206, 1, 0, 'medicamento206', '0000-00-00', 52),
(207, 1, 0, 'medicamento207', '0000-00-00', 52),
(208, 1, 0, 'medicamento208', '0000-00-00', 52),
(209, 1, 0, 'medicamento209', '0000-00-00', 53),
(210, 1, 0, 'medicamento210', '0000-00-00', 53),
(211, 1, 0, 'medicamento211', '0000-00-00', 53),
(212, 1, 0, 'medicamento212', '0000-00-00', 53),
(213, 1, 0, 'medicamento213', '0000-00-00', 54),
(214, 1, 0, 'medicamento214', '0000-00-00', 54),
(215, 1, 0, 'medicamento215', '0000-00-00', 54),
(216, 1, 0, 'medicamento216', '0000-00-00', 54),
(217, 1, 0, 'medicamento217', '0000-00-00', 55),
(218, 1, 0, 'medicamento218', '0000-00-00', 55),
(219, 1, 0, 'medicamento219', '0000-00-00', 55),
(220, 1, 0, 'medicamento220', '0000-00-00', 55),
(221, 1, 0, 'medicamento221', '0000-00-00', 56),
(222, 1, 0, 'medicamento222', '0000-00-00', 56),
(223, 1, 0, 'medicamento223', '0000-00-00', 56),
(224, 1, 0, 'medicamento224', '0000-00-00', 56),
(225, 1, 0, 'medicamento225', '0000-00-00', 57),
(226, 1, 0, 'medicamento226', '0000-00-00', 57),
(227, 1, 0, 'medicamento227', '0000-00-00', 57),
(228, 1, 0, 'medicamento228', '0000-00-00', 57),
(229, 1, 0, 'medicamento229', '0000-00-00', 58),
(230, 1, 0, 'medicamento230', '0000-00-00', 58),
(231, 1, 0, 'medicamento231', '0000-00-00', 58),
(232, 1, 0, 'medicamento232', '0000-00-00', 58),
(233, 1, 0, 'medicamento233', '0000-00-00', 59),
(234, 1, 0, 'medicamento234', '0000-00-00', 59),
(235, 1, 0, 'medicamento235', '0000-00-00', 59),
(236, 1, 0, 'medicamento236', '0000-00-00', 59),
(237, 1, 0, 'medicamento237', '0000-00-00', 60),
(238, 1, 0, 'medicamento238', '0000-00-00', 60),
(239, 1, 0, 'medicamento239', '0000-00-00', 60),
(240, 1, 0, 'medicamento240', '0000-00-00', 60),
(241, 1, 0, 'medicamento241', '0000-00-00', 61),
(242, 1, 0, 'medicamento242', '0000-00-00', 61),
(243, 1, 0, 'medicamento243', '0000-00-00', 61),
(244, 1, 0, 'medicamento244', '0000-00-00', 61),
(245, 1, 0, 'medicamento245', '0000-00-00', 62),
(246, 1, 0, 'medicamento246', '0000-00-00', 62),
(247, 1, 0, 'medicamento247', '0000-00-00', 62),
(248, 1, 0, 'medicamento248', '0000-00-00', 62),
(249, 1, 0, 'medicamento249', '0000-00-00', 63),
(250, 1, 0, 'medicamento250', '0000-00-00', 63),
(251, 1, 0, 'medicamento251', '0000-00-00', 63),
(252, 1, 0, 'medicamento252', '0000-00-00', 63),
(253, 1, 0, 'medicamento253', '0000-00-00', 64),
(254, 1, 0, 'medicamento254', '0000-00-00', 64),
(255, 1, 0, 'medicamento255', '0000-00-00', 64),
(256, 1, 0, 'medicamento256', '0000-00-00', 64);

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
(37, 'paciente37', 'diagnostico37', 10),
(38, 'paciente38', 'diagnostico38', 10),
(39, 'paciente39', 'diagnostico39', 10),
(40, 'paciente40', 'diagnostico40', 10),
(41, 'paciente41', 'diagnostico41', 11),
(42, 'paciente42', 'diagnostico42', 11),
(43, 'paciente43', 'diagnostico43', 11),
(44, 'paciente44', 'diagnostico44', 11),
(45, 'paciente45', 'diagnostico45', 12),
(46, 'paciente46', 'diagnostico46', 12),
(47, 'paciente47', 'diagnostico47', 12),
(48, 'paciente48', 'diagnostico48', 12),
(49, 'paciente49', 'diagnostico49', 13),
(50, 'paciente50', 'diagnostico50', 13),
(51, 'paciente51', 'diagnostico51', 13),
(52, 'paciente52', 'diagnostico52', 13),
(53, 'paciente53', 'diagnostico53', 14),
(54, 'paciente54', 'diagnostico54', 14),
(55, 'paciente55', 'diagnostico55', 14),
(56, 'paciente56', 'diagnostico56', 14),
(57, 'paciente57', 'diagnostico57', 15),
(58, 'paciente58', 'diagnostico58', 15),
(59, 'paciente59', 'diagnostico59', 15),
(60, 'paciente60', 'diagnostico60', 15),
(61, 'paciente61', 'diagnostico61', 16),
(62, 'paciente62', 'diagnostico62', 16),
(63, 'paciente63', 'diagnostico63', 16),
(64, 'paciente64', 'diagnostico64', 16),
(123123, 'qwe', 'qweqwe', 20883971),
(343434, 'wewe', 'wewewewe', 20883971),
(208839713, 'pepe', 'sexo', 10);

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
(146, 100, 'procedimiento146', 'descripcion146', 0, '0000-00-00', 37),
(147, 100, 'procedimiento147', 'descripcion147', 0, '0000-00-00', 37),
(148, 100, 'procedimiento148', 'descripcion148', 0, '0000-00-00', 37),
(149, 100, 'procedimiento149', 'descripcion149', 0, '0000-00-00', 38),
(150, 100, 'procedimiento150', 'descripcion150', 0, '0000-00-00', 38),
(151, 100, 'procedimiento151', 'descripcion151', 0, '0000-00-00', 38),
(152, 100, 'procedimiento152', 'descripcion152', 0, '0000-00-00', 38),
(153, 100, 'procedimiento153', 'descripcion153', 0, '0000-00-00', 39),
(154, 100, 'procedimiento154', 'descripcion154', 0, '0000-00-00', 39),
(155, 100, 'procedimiento155', 'descripcion155', 0, '0000-00-00', 39),
(156, 100, 'procedimiento156', 'descripcion156', 0, '0000-00-00', 39),
(157, 100, 'procedimiento157', 'descripcion157', 0, '0000-00-00', 40),
(158, 100, 'procedimiento158', 'descripcion158', 0, '0000-00-00', 40),
(159, 100, 'procedimiento159', 'descripcion159', 0, '0000-00-00', 40),
(160, 100, 'procedimiento160', 'descripcion160', 0, '0000-00-00', 40),
(161, 100, 'procedimiento161', 'descripcion161', 0, '0000-00-00', 41),
(162, 100, 'procedimiento162', 'descripcion162', 0, '0000-00-00', 41),
(163, 100, 'procedimiento163', 'descripcion163', 0, '0000-00-00', 41),
(164, 100, 'procedimiento164', 'descripcion164', 0, '0000-00-00', 41),
(165, 100, 'procedimiento165', 'descripcion165', 0, '0000-00-00', 42),
(166, 100, 'procedimiento166', 'descripcion166', 0, '0000-00-00', 42),
(167, 100, 'procedimiento167', 'descripcion167', 0, '0000-00-00', 42),
(168, 100, 'procedimiento168', 'descripcion168', 0, '0000-00-00', 42),
(169, 100, 'procedimiento169', 'descripcion169', 0, '0000-00-00', 43),
(170, 100, 'procedimiento170', 'descripcion170', 0, '0000-00-00', 43),
(171, 100, 'procedimiento171', 'descripcion171', 0, '0000-00-00', 43),
(172, 100, 'procedimiento172', 'descripcion172', 0, '0000-00-00', 43),
(173, 100, 'procedimiento173', 'descripcion173', 0, '0000-00-00', 44),
(174, 100, 'procedimiento174', 'descripcion174', 0, '0000-00-00', 44),
(175, 100, 'procedimiento175', 'descripcion175', 0, '0000-00-00', 44),
(176, 100, 'procedimiento176', 'descripcion176', 0, '0000-00-00', 44),
(177, 100, 'procedimiento177', 'descripcion177', 0, '0000-00-00', 45),
(178, 100, 'procedimiento178', 'descripcion178', 0, '0000-00-00', 45),
(179, 100, 'procedimiento179', 'descripcion179', 0, '0000-00-00', 45),
(180, 100, 'procedimiento180', 'descripcion180', 0, '0000-00-00', 45),
(181, 100, 'procedimiento181', 'descripcion181', 0, '0000-00-00', 46),
(182, 100, 'procedimiento182', 'descripcion182', 0, '0000-00-00', 46),
(183, 100, 'procedimiento183', 'descripcion183', 0, '0000-00-00', 46),
(184, 100, 'procedimiento184', 'descripcion184', 0, '0000-00-00', 46),
(185, 100, 'procedimiento185', 'descripcion185', 0, '0000-00-00', 47),
(186, 100, 'procedimiento186', 'descripcion186', 0, '0000-00-00', 47),
(187, 100, 'procedimiento187', 'descripcion187', 0, '0000-00-00', 47),
(188, 100, 'procedimiento188', 'descripcion188', 0, '0000-00-00', 47),
(189, 100, 'procedimiento189', 'descripcion189', 0, '0000-00-00', 48),
(190, 100, 'procedimiento190', 'descripcion190', 0, '0000-00-00', 48),
(191, 100, 'procedimiento191', 'descripcion191', 0, '0000-00-00', 48),
(192, 100, 'procedimiento192', 'descripcion192', 0, '0000-00-00', 48),
(193, 100, 'procedimiento193', 'descripcion193', 0, '0000-00-00', 49),
(194, 100, 'procedimiento194', 'descripcion194', 0, '0000-00-00', 49),
(195, 100, 'procedimiento195', 'descripcion195', 0, '0000-00-00', 49),
(196, 100, 'procedimiento196', 'descripcion196', 0, '0000-00-00', 49),
(197, 100, 'procedimiento197', 'descripcion197', 0, '0000-00-00', 50),
(198, 100, 'procedimiento198', 'descripcion198', 0, '0000-00-00', 50),
(199, 100, 'procedimiento199', 'descripcion199', 0, '0000-00-00', 50),
(200, 100, 'procedimiento200', 'descripcion200', 0, '0000-00-00', 50),
(201, 100, 'procedimiento201', 'descripcion201', 0, '0000-00-00', 51),
(202, 100, 'procedimiento202', 'descripcion202', 0, '0000-00-00', 51),
(203, 100, 'procedimiento203', 'descripcion203', 0, '0000-00-00', 51),
(204, 100, 'procedimiento204', 'descripcion204', 0, '0000-00-00', 51),
(205, 100, 'procedimiento205', 'descripcion205', 0, '0000-00-00', 52),
(206, 100, 'procedimiento206', 'descripcion206', 0, '0000-00-00', 52),
(207, 100, 'procedimiento207', 'descripcion207', 0, '0000-00-00', 52),
(208, 100, 'procedimiento208', 'descripcion208', 0, '0000-00-00', 52),
(209, 100, 'procedimiento209', 'descripcion209', 0, '0000-00-00', 53),
(210, 100, 'procedimiento210', 'descripcion210', 0, '0000-00-00', 53),
(211, 100, 'procedimiento211', 'descripcion211', 0, '0000-00-00', 53),
(212, 100, 'procedimiento212', 'descripcion212', 0, '0000-00-00', 53),
(213, 100, 'procedimiento213', 'descripcion213', 0, '0000-00-00', 54),
(214, 100, 'procedimiento214', 'descripcion214', 0, '0000-00-00', 54),
(215, 100, 'procedimiento215', 'descripcion215', 0, '0000-00-00', 54),
(216, 100, 'procedimiento216', 'descripcion216', 0, '0000-00-00', 54),
(217, 100, 'procedimiento217', 'descripcion217', 0, '0000-00-00', 55),
(218, 100, 'procedimiento218', 'descripcion218', 0, '0000-00-00', 55),
(219, 100, 'procedimiento219', 'descripcion219', 0, '0000-00-00', 55),
(220, 100, 'procedimiento220', 'descripcion220', 0, '0000-00-00', 55),
(221, 100, 'procedimiento221', 'descripcion221', 0, '0000-00-00', 56),
(222, 100, 'procedimiento222', 'descripcion222', 0, '0000-00-00', 56),
(223, 100, 'procedimiento223', 'descripcion223', 0, '0000-00-00', 56),
(224, 100, 'procedimiento224', 'descripcion224', 0, '0000-00-00', 56),
(225, 100, 'procedimiento225', 'descripcion225', 0, '0000-00-00', 57),
(226, 100, 'procedimiento226', 'descripcion226', 0, '0000-00-00', 57),
(227, 100, 'procedimiento227', 'descripcion227', 0, '0000-00-00', 57),
(228, 100, 'procedimiento228', 'descripcion228', 0, '0000-00-00', 57),
(229, 100, 'procedimiento229', 'descripcion229', 0, '0000-00-00', 58),
(230, 100, 'procedimiento230', 'descripcion230', 0, '0000-00-00', 58),
(231, 100, 'procedimiento231', 'descripcion231', 0, '0000-00-00', 58),
(232, 100, 'procedimiento232', 'descripcion232', 0, '0000-00-00', 58),
(233, 100, 'procedimiento233', 'descripcion233', 0, '0000-00-00', 59),
(234, 100, 'procedimiento234', 'descripcion234', 0, '0000-00-00', 59),
(235, 100, 'procedimiento235', 'descripcion235', 0, '0000-00-00', 59),
(236, 100, 'procedimiento236', 'descripcion236', 0, '0000-00-00', 59),
(237, 100, 'procedimiento237', 'descripcion237', 0, '0000-00-00', 60),
(238, 100, 'procedimiento238', 'descripcion238', 0, '0000-00-00', 60),
(239, 100, 'procedimiento239', 'descripcion239', 0, '0000-00-00', 60),
(240, 100, 'procedimiento240', 'descripcion240', 0, '0000-00-00', 60),
(241, 100, 'procedimiento241', 'descripcion241', 0, '0000-00-00', 61),
(242, 100, 'procedimiento242', 'descripcion242', 0, '0000-00-00', 61),
(243, 100, 'procedimiento243', 'descripcion243', 0, '0000-00-00', 61),
(244, 100, 'procedimiento244', 'descripcion244', 0, '0000-00-00', 61),
(245, 100, 'procedimiento245', 'descripcion245', 0, '0000-00-00', 62),
(246, 100, 'procedimiento246', 'descripcion246', 0, '0000-00-00', 62),
(247, 100, 'procedimiento247', 'descripcion247', 0, '0000-00-00', 62),
(248, 100, 'procedimiento248', 'descripcion248', 0, '0000-00-00', 62),
(249, 100, 'procedimiento249', 'descripcion249', 0, '0000-00-00', 63),
(250, 100, 'procedimiento250', 'descripcion250', 0, '0000-00-00', 63),
(251, 100, 'procedimiento251', 'descripcion251', 0, '0000-00-00', 63),
(252, 100, 'procedimiento252', 'descripcion252', 0, '0000-00-00', 63),
(253, 100, 'procedimiento253', 'descripcion253', 0, '0000-00-00', 64),
(254, 100, 'procedimiento254', 'descripcion254', 0, '0000-00-00', 64),
(255, 100, 'procedimiento255', 'descripcion255', 0, '0000-00-00', 64),
(256, 100, 'procedimiento256', 'descripcion256', 0, '0000-00-00', 64);

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
(10, 'tecnico10', 'pass10', 3),
(11, 'tecnico11', 'pass11', 3),
(12, 'tecnico12', 'pass12', 3),
(13, 'tecnico13', 'pass13', 4),
(14, 'tecnico14', 'pass14', 4),
(15, 'tecnico15', 'pass15', 4),
(16, 'tecnico16', 'pass16', 4),
(20883971, 'yo', 'men', 2),
(208839713, 'martin', '123', 3);

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
