-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 20, 2024 at 05:59 PM
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
-- Table structure for table `tbmedicamento`
--

CREATE TABLE `tbmedicamento` (
  `id_med` int(225) NOT NULL,
  `cant` double(225,2) NOT NULL,
  `nombre_med` varchar(225) NOT NULL,
  `tomar` date DEFAULT NULL,
  `pac_run_pac` int(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbmedicamento`
--

INSERT INTO `tbmedicamento` (`id_med`, `cant`, `nombre_med`, `tomar`, `pac_run_pac`) VALUES
(1, 1, 'medicamento1', '0000-00-00', 1),
(2, 1, 'medicamento2', '0000-00-00', 1),
(3, 1, 'medicamento3', '0000-00-00', 1),
(4, 1, 'medicamento4', '0000-00-00', 1),
(5, 1, 'medicamento5', '0000-00-00', 2),
(6, 1, 'medicamento6', '0000-00-00', 2),
(7, 1, 'medicamento7', '0000-00-00', 2),
(8, 1, 'medicamento8', '0000-00-00', 2),
(9, 1, 'medicamento9', '0000-00-00', 3),
(10, 1, 'medicamento10', '0000-00-00', 3),
(11, 1, 'medicamento11', '0000-00-00', 3),
(12, 1, 'medicamento12', '0000-00-00', 3),
(13, 1, 'medicamento13', '0000-00-00', 4),
(14, 1, 'medicamento14', '0000-00-00', 4),
(15, 1, 'medicamento15', '0000-00-00', 4),
(16, 1, 'medicamento16', '0000-00-00', 4),
(17, 1, 'medicamento17', '0000-00-00', 5),
(18, 1, 'medicamento18', '0000-00-00', 5),
(19, 1, 'medicamento19', '0000-00-00', 5),
(20, 1, 'medicamento20', '0000-00-00', 5),
(21, 1, 'medicamento21', '0000-00-00', 6),
(22, 1, 'medicamento22', '0000-00-00', 6),
(23, 1, 'medicamento23', '0000-00-00', 6),
(24, 1, 'medicamento24', '0000-00-00', 6),
(25, 1, 'medicamento25', '0000-00-00', 7),
(26, 1, 'medicamento26', '0000-00-00', 7),
(27, 1, 'medicamento27', '0000-00-00', 7),
(28, 1, 'medicamento28', '0000-00-00', 7),
(29, 1, 'medicamento29', '0000-00-00', 8),
(30, 1, 'medicamento30', '0000-00-00', 8),
(31, 1, 'medicamento31', '0000-00-00', 8),
(32, 1, 'medicamento32', '0000-00-00', 8),
(33, 1, 'medicamento33', '0000-00-00', 9),
(34, 1, 'medicamento34', '0000-00-00', 9),
(35, 1, 'medicamento35', '0000-00-00', 9),
(36, 1, 'medicamento36', '0000-00-00', 9),
(37, 1, 'medicamento37', '0000-00-00', 10),
(38, 1, 'medicamento38', '0000-00-00', 10),
(39, 1, 'medicamento39', '0000-00-00', 10),
(40, 1, 'medicamento40', '0000-00-00', 10),
(41, 1, 'medicamento41', '0000-00-00', 11),
(42, 1, 'medicamento42', '0000-00-00', 11),
(43, 1, 'medicamento43', '0000-00-00', 11),
(44, 1, 'medicamento44', '0000-00-00', 11),
(45, 1, 'medicamento45', '0000-00-00', 12),
(46, 1, 'medicamento46', '0000-00-00', 12),
(47, 1, 'medicamento47', '0000-00-00', 12),
(48, 1, 'medicamento48', '0000-00-00', 12),
(49, 1, 'medicamento49', '0000-00-00', 13),
(50, 1, 'medicamento50', '0000-00-00', 13),
(51, 1, 'medicamento51', '0000-00-00', 13),
(52, 1, 'medicamento52', '0000-00-00', 13),
(53, 1, 'medicamento53', '0000-00-00', 14),
(54, 1, 'medicamento54', '0000-00-00', 14),
(55, 1, 'medicamento55', '0000-00-00', 14),
(56, 1, 'medicamento56', '0000-00-00', 14),
(57, 1, 'medicamento57', '0000-00-00', 15),
(58, 1, 'medicamento58', '0000-00-00', 15),
(59, 1, 'medicamento59', '0000-00-00', 15),
(60, 1, 'medicamento60', '0000-00-00', 15),
(61, 1, 'medicamento61', '0000-00-00', 16),
(62, 1, 'medicamento62', '0000-00-00', 16),
(63, 1, 'medicamento63', '0000-00-00', 16),
(64, 1, 'medicamento64', '0000-00-00', 16),
(65, 1, 'medicamento65', '0000-00-00', 17),
(66, 1, 'medicamento66', '0000-00-00', 17),
(67, 1, 'medicamento67', '0000-00-00', 17),
(68, 1, 'medicamento68', '0000-00-00', 17),
(69, 1, 'medicamento69', '0000-00-00', 18),
(70, 1, 'medicamento70', '0000-00-00', 18),
(71, 1, 'medicamento71', '0000-00-00', 18),
(72, 1, 'medicamento72', '0000-00-00', 18),
(73, 1, 'medicamento73', '0000-00-00', 19),
(74, 1, 'medicamento74', '0000-00-00', 19),
(75, 1, 'medicamento75', '0000-00-00', 19),
(76, 1, 'medicamento76', '0000-00-00', 19),
(77, 1, 'medicamento77', '0000-00-00', 20),
(78, 1, 'medicamento78', '0000-00-00', 20),
(79, 1, 'medicamento79', '0000-00-00', 20),
(80, 1, 'medicamento80', '0000-00-00', 20),
(81, 1, 'medicamento81', '0000-00-00', 21),
(82, 1, 'medicamento82', '0000-00-00', 21),
(83, 1, 'medicamento83', '0000-00-00', 21),
(84, 1, 'medicamento84', '0000-00-00', 21),
(85, 1, 'medicamento85', '0000-00-00', 22),
(86, 1, 'medicamento86', '0000-00-00', 22),
(87, 1, 'medicamento87', '0000-00-00', 22),
(88, 1, 'medicamento88', '0000-00-00', 22),
(89, 1, 'medicamento89', '0000-00-00', 23),
(90, 1, 'medicamento90', '0000-00-00', 23),
(91, 1, 'medicamento91', '0000-00-00', 23),
(92, 1, 'medicamento92', '0000-00-00', 23),
(93, 1, 'medicamento93', '0000-00-00', 24),
(94, 1, 'medicamento94', '0000-00-00', 24),
(95, 1, 'medicamento95', '0000-00-00', 24),
(96, 1, 'medicamento96', '0000-00-00', 24),
(97, 1, 'medicamento97', '0000-00-00', 25),
(98, 1, 'medicamento98', '0000-00-00', 25),
(99, 1, 'medicamento99', '0000-00-00', 25),
(100, 1, 'medicamento100', '0000-00-00', 25),
(101, 1, 'medicamento101', '0000-00-00', 26),
(102, 1, 'medicamento102', '0000-00-00', 26),
(103, 1, 'medicamento103', '0000-00-00', 26),
(104, 1, 'medicamento104', '0000-00-00', 26),
(105, 1, 'medicamento105', '0000-00-00', 27),
(106, 1, 'medicamento106', '0000-00-00', 27),
(107, 1, 'medicamento107', '0000-00-00', 27),
(108, 1, 'medicamento108', '0000-00-00', 27),
(109, 1, 'medicamento109', '0000-00-00', 28),
(110, 1, 'medicamento110', '0000-00-00', 28),
(111, 1, 'medicamento111', '0000-00-00', 28),
(112, 1, 'medicamento112', '0000-00-00', 28),
(113, 1, 'medicamento113', '0000-00-00', 29),
(114, 1, 'medicamento114', '0000-00-00', 29),
(115, 1, 'medicamento115', '0000-00-00', 29),
(116, 1, 'medicamento116', '0000-00-00', 29),
(117, 1, 'medicamento117', '0000-00-00', 30),
(118, 1, 'medicamento118', '0000-00-00', 30),
(119, 1, 'medicamento119', '0000-00-00', 30),
(120, 1, 'medicamento120', '0000-00-00', 30),
(121, 1, 'medicamento121', '0000-00-00', 31),
(122, 1, 'medicamento122', '0000-00-00', 31),
(123, 1, 'medicamento123', '0000-00-00', 31),
(124, 1, 'medicamento124', '0000-00-00', 31),
(125, 1, 'medicamento125', '0000-00-00', 32),
(126, 1, 'medicamento126', '0000-00-00', 32),
(127, 1, 'medicamento127', '0000-00-00', 32),
(128, 1, 'medicamento128', '0000-00-00', 32),
(129, 1, 'medicamento129', '0000-00-00', 33),
(130, 1, 'medicamento130', '0000-00-00', 33),
(131, 1, 'medicamento131', '0000-00-00', 33),
(132, 1, 'medicamento132', '0000-00-00', 33),
(133, 1, 'medicamento133', '0000-00-00', 34),
(134, 1, 'medicamento134', '0000-00-00', 34),
(135, 1, 'medicamento135', '0000-00-00', 34),
(136, 1, 'medicamento136', '0000-00-00', 34),
(137, 1, 'medicamento137', '0000-00-00', 35),
(138, 1, 'medicamento138', '0000-00-00', 35),
(139, 1, 'medicamento139', '0000-00-00', 35),
(140, 1, 'medicamento140', '0000-00-00', 35),
(141, 1, 'medicamento141', '0000-00-00', 36),
(142, 1, 'medicamento142', '0000-00-00', 36),
(143, 1, 'medicamento143', '0000-00-00', 36),
(144, 1, 'medicamento144', '0000-00-00', 36),
(145, 1, 'medicamento145', '0000-00-00', 37),
(146, 1, 'medicamento146', '0000-00-00', 37),
(147, 1, 'medicamento147', '0000-00-00', 37),
(148, 1, 'medicamento148', '0000-00-00', 37),
(149, 1, 'medicamento149', '0000-00-00', 38),
(150, 1, 'medicamento150', '0000-00-00', 38),
(151, 1, 'medicamento151', '0000-00-00', 38),
(152, 1, 'medicamento152', '0000-00-00', 38),
(153, 1, 'medicamento153', '0000-00-00', 39),
(154, 1, 'medicamento154', '0000-00-00', 39),
(155, 1, 'medicamento155', '0000-00-00', 39),
(156, 1, 'medicamento156', '0000-00-00', 39),
(157, 1, 'medicamento157', '0000-00-00', 40),
(158, 1, 'medicamento158', '0000-00-00', 40),
(159, 1, 'medicamento159', '0000-00-00', 40),
(160, 1, 'medicamento160', '0000-00-00', 40),
(161, 1, 'medicamento161', '0000-00-00', 41),
(162, 1, 'medicamento162', '0000-00-00', 41),
(163, 1, 'medicamento163', '0000-00-00', 41),
(164, 1, 'medicamento164', '0000-00-00', 41),
(165, 1, 'medicamento165', '0000-00-00', 42),
(166, 1, 'medicamento166', '0000-00-00', 42),
(167, 1, 'medicamento167', '0000-00-00', 42),
(168, 1, 'medicamento168', '0000-00-00', 42),
(169, 1, 'medicamento169', '0000-00-00', 43),
(170, 1, 'medicamento170', '0000-00-00', 43),
(171, 1, 'medicamento171', '0000-00-00', 43),
(172, 1, 'medicamento172', '0000-00-00', 43),
(173, 1, 'medicamento173', '0000-00-00', 44),
(174, 1, 'medicamento174', '0000-00-00', 44),
(175, 1, 'medicamento175', '0000-00-00', 44),
(176, 1, 'medicamento176', '0000-00-00', 44),
(177, 1, 'medicamento177', '0000-00-00', 45),
(178, 1, 'medicamento178', '0000-00-00', 45),
(179, 1, 'medicamento179', '0000-00-00', 45),
(180, 1, 'medicamento180', '0000-00-00', 45),
(181, 1, 'medicamento181', '0000-00-00', 46),
(182, 1, 'medicamento182', '0000-00-00', 46),
(183, 1, 'medicamento183', '0000-00-00', 46),
(184, 1, 'medicamento184', '0000-00-00', 46),
(185, 1, 'medicamento185', '0000-00-00', 47),
(186, 1, 'medicamento186', '0000-00-00', 47),
(187, 1, 'medicamento187', '0000-00-00', 47),
(188, 1, 'medicamento188', '0000-00-00', 47),
(189, 1, 'medicamento189', '0000-00-00', 48),
(190, 1, 'medicamento190', '0000-00-00', 48),
(191, 1, 'medicamento191', '0000-00-00', 48),
(192, 1, 'medicamento192', '0000-00-00', 48),
(193, 1, 'medicamento193', '0000-00-00', 49),
(194, 1, 'medicamento194', '0000-00-00', 49),
(195, 1, 'medicamento195', '0000-00-00', 49),
(196, 1, 'medicamento196', '0000-00-00', 49),
(197, 1, 'medicamento197', '0000-00-00', 50),
(198, 1, 'medicamento198', '0000-00-00', 50),
(199, 1, 'medicamento199', '0000-00-00', 50),
(200, 1, 'medicamento200', '0000-00-00', 50),
(201, 1, 'medicamento201', '0000-00-00', 51),
(202, 1, 'medicamento202', '0000-00-00', 51),
(203, 1, 'medicamento203', '0000-00-00', 51),
(204, 1, 'medicamento204', '0000-00-00', 51),
(205, 1, 'medicamento205', '0000-00-00', 52),
(206, 1, 'medicamento206', '0000-00-00', 52),
(207, 1, 'medicamento207', '0000-00-00', 52),
(208, 1, 'medicamento208', '0000-00-00', 52),
(209, 1, 'medicamento209', '0000-00-00', 53),
(210, 1, 'medicamento210', '0000-00-00', 53),
(211, 1, 'medicamento211', '0000-00-00', 53),
(212, 1, 'medicamento212', '0000-00-00', 53),
(213, 1, 'medicamento213', '0000-00-00', 54),
(214, 1, 'medicamento214', '0000-00-00', 54),
(215, 1, 'medicamento215', '0000-00-00', 54),
(216, 1, 'medicamento216', '0000-00-00', 54),
(217, 1, 'medicamento217', '0000-00-00', 55),
(218, 1, 'medicamento218', '0000-00-00', 55),
(219, 1, 'medicamento219', '0000-00-00', 55),
(220, 1, 'medicamento220', '0000-00-00', 55),
(221, 1, 'medicamento221', '0000-00-00', 56),
(222, 1, 'medicamento222', '0000-00-00', 56),
(223, 1, 'medicamento223', '0000-00-00', 56),
(224, 1, 'medicamento224', '0000-00-00', 56),
(225, 1, 'medicamento225', '0000-00-00', 57),
(226, 1, 'medicamento226', '0000-00-00', 57),
(227, 1, 'medicamento227', '0000-00-00', 57),
(228, 1, 'medicamento228', '0000-00-00', 57),
(229, 1, 'medicamento229', '0000-00-00', 58),
(230, 1, 'medicamento230', '0000-00-00', 58),
(231, 1, 'medicamento231', '0000-00-00', 58),
(232, 1, 'medicamento232', '0000-00-00', 58),
(233, 1, 'medicamento233', '0000-00-00', 59),
(234, 1, 'medicamento234', '0000-00-00', 59),
(235, 1, 'medicamento235', '0000-00-00', 59),
(236, 1, 'medicamento236', '0000-00-00', 59),
(237, 1, 'medicamento237', '0000-00-00', 60),
(238, 1, 'medicamento238', '0000-00-00', 60),
(239, 1, 'medicamento239', '0000-00-00', 60),
(240, 1, 'medicamento240', '0000-00-00', 60),
(241, 1, 'medicamento241', '0000-00-00', 61),
(242, 1, 'medicamento242', '0000-00-00', 61),
(243, 1, 'medicamento243', '0000-00-00', 61),
(244, 1, 'medicamento244', '0000-00-00', 61),
(245, 1, 'medicamento245', '0000-00-00', 62),
(246, 1, 'medicamento246', '0000-00-00', 62),
(247, 1, 'medicamento247', '0000-00-00', 62),
(248, 1, 'medicamento248', '0000-00-00', 62),
(249, 1, 'medicamento249', '0000-00-00', 63),
(250, 1, 'medicamento250', '0000-00-00', 63),
(251, 1, 'medicamento251', '0000-00-00', 63),
(252, 1, 'medicamento252', '0000-00-00', 63),
(253, 1, 'medicamento253', '0000-00-00', 64),
(254, 1, 'medicamento254', '0000-00-00', 64),
(255, 1, 'medicamento255', '0000-00-00', 64),
(256, 1, 'medicamento256', '0000-00-00', 64);

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
(1, 'paciente1', 'diagnostico1', 1),
(2, 'paciente2', 'diagnostico2', 1),
(3, 'paciente3', 'diagnostico3', 1),
(4, 'paciente4', 'diagnostico4', 1),
(5, 'paciente5', 'diagnostico5', 2),
(6, 'paciente6', 'diagnostico6', 2),
(7, 'paciente7', 'diagnostico7', 2),
(8, 'paciente8', 'diagnostico8', 2),
(9, 'paciente9', 'diagnostico9', 3),
(10, 'paciente10', 'diagnostico10', 3),
(11, 'paciente11', 'diagnostico11', 3),
(12, 'paciente12', 'diagnostico12', 3),
(13, 'paciente13', 'diagnostico13', 4),
(14, 'paciente14', 'diagnostico14', 4),
(15, 'paciente15', 'diagnostico15', 4),
(16, 'paciente16', 'diagnostico16', 4),
(17, 'paciente17', 'diagnostico17', 5),
(18, 'paciente18', 'diagnostico18', 5),
(19, 'paciente19', 'diagnostico19', 5),
(20, 'paciente20', 'diagnostico20', 5),
(21, 'paciente21', 'diagnostico21', 6),
(22, 'paciente22', 'diagnostico22', 6),
(23, 'paciente23', 'diagnostico23', 6),
(24, 'paciente24', 'diagnostico24', 6),
(25, 'paciente25', 'diagnostico25', 7),
(26, 'paciente26', 'diagnostico26', 7),
(27, 'paciente27', 'diagnostico27', 7),
(28, 'paciente28', 'diagnostico28', 7),
(29, 'paciente29', 'diagnostico29', 8),
(30, 'paciente30', 'diagnostico30', 8),
(31, 'paciente31', 'diagnostico31', 8),
(32, 'paciente32', 'diagnostico32', 8),
(33, 'paciente33', 'diagnostico33', 9),
(34, 'paciente34', 'diagnostico34', 9),
(35, 'paciente35', 'diagnostico35', 9),
(36, 'paciente36', 'diagnostico36', 9),
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
(64, 'paciente64', 'diagnostico64', 16);

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
(1, 100, 'procedimiento1', 'descripcion1', 0, '0000-00-00', 1),
(2, 100, 'procedimiento2', 'descripcion2', 0, '0000-00-00', 1),
(3, 100, 'procedimiento3', 'descripcion3', 0, '0000-00-00', 1),
(4, 100, 'procedimiento4', 'descripcion4', 0, '0000-00-00', 1),
(5, 100, 'procedimiento5', 'descripcion5', 0, '0000-00-00', 2),
(6, 100, 'procedimiento6', 'descripcion6', 0, '0000-00-00', 2),
(7, 100, 'procedimiento7', 'descripcion7', 0, '0000-00-00', 2),
(8, 100, 'procedimiento8', 'descripcion8', 0, '0000-00-00', 2),
(9, 100, 'procedimiento9', 'descripcion9', 0, '0000-00-00', 3),
(10, 100, 'procedimiento10', 'descripcion10', 0, '0000-00-00', 3),
(11, 100, 'procedimiento11', 'descripcion11', 0, '0000-00-00', 3),
(12, 100, 'procedimiento12', 'descripcion12', 0, '0000-00-00', 3),
(13, 100, 'procedimiento13', 'descripcion13', 0, '0000-00-00', 4),
(14, 100, 'procedimiento14', 'descripcion14', 0, '0000-00-00', 4),
(15, 100, 'procedimiento15', 'descripcion15', 0, '0000-00-00', 4),
(16, 100, 'procedimiento16', 'descripcion16', 0, '0000-00-00', 4),
(17, 100, 'procedimiento17', 'descripcion17', 0, '0000-00-00', 5),
(18, 100, 'procedimiento18', 'descripcion18', 0, '0000-00-00', 5),
(19, 100, 'procedimiento19', 'descripcion19', 0, '0000-00-00', 5),
(20, 100, 'procedimiento20', 'descripcion20', 0, '0000-00-00', 5),
(21, 100, 'procedimiento21', 'descripcion21', 0, '0000-00-00', 6),
(22, 100, 'procedimiento22', 'descripcion22', 0, '0000-00-00', 6),
(23, 100, 'procedimiento23', 'descripcion23', 0, '0000-00-00', 6),
(24, 100, 'procedimiento24', 'descripcion24', 0, '0000-00-00', 6),
(25, 100, 'procedimiento25', 'descripcion25', 0, '0000-00-00', 7),
(26, 100, 'procedimiento26', 'descripcion26', 0, '0000-00-00', 7),
(27, 100, 'procedimiento27', 'descripcion27', 0, '0000-00-00', 7),
(28, 100, 'procedimiento28', 'descripcion28', 0, '0000-00-00', 7),
(29, 100, 'procedimiento29', 'descripcion29', 0, '0000-00-00', 8),
(30, 100, 'procedimiento30', 'descripcion30', 0, '0000-00-00', 8),
(31, 100, 'procedimiento31', 'descripcion31', 0, '0000-00-00', 8),
(32, 100, 'procedimiento32', 'descripcion32', 0, '0000-00-00', 8),
(33, 100, 'procedimiento33', 'descripcion33', 0, '0000-00-00', 9),
(34, 100, 'procedimiento34', 'descripcion34', 0, '0000-00-00', 9),
(35, 100, 'procedimiento35', 'descripcion35', 0, '0000-00-00', 9),
(36, 100, 'procedimiento36', 'descripcion36', 0, '0000-00-00', 9),
(37, 100, 'procedimiento37', 'descripcion37', 0, '0000-00-00', 10),
(38, 100, 'procedimiento38', 'descripcion38', 0, '0000-00-00', 10),
(39, 100, 'procedimiento39', 'descripcion39', 0, '0000-00-00', 10),
(40, 100, 'procedimiento40', 'descripcion40', 0, '0000-00-00', 10),
(41, 100, 'procedimiento41', 'descripcion41', 0, '0000-00-00', 11),
(42, 100, 'procedimiento42', 'descripcion42', 0, '0000-00-00', 11),
(43, 100, 'procedimiento43', 'descripcion43', 0, '0000-00-00', 11),
(44, 100, 'procedimiento44', 'descripcion44', 0, '0000-00-00', 11),
(45, 100, 'procedimiento45', 'descripcion45', 0, '0000-00-00', 12),
(46, 100, 'procedimiento46', 'descripcion46', 0, '0000-00-00', 12),
(47, 100, 'procedimiento47', 'descripcion47', 0, '0000-00-00', 12),
(48, 100, 'procedimiento48', 'descripcion48', 0, '0000-00-00', 12),
(49, 100, 'procedimiento49', 'descripcion49', 0, '0000-00-00', 13),
(50, 100, 'procedimiento50', 'descripcion50', 0, '0000-00-00', 13),
(51, 100, 'procedimiento51', 'descripcion51', 0, '0000-00-00', 13),
(52, 100, 'procedimiento52', 'descripcion52', 0, '0000-00-00', 13),
(53, 100, 'procedimiento53', 'descripcion53', 0, '0000-00-00', 14),
(54, 100, 'procedimiento54', 'descripcion54', 0, '0000-00-00', 14),
(55, 100, 'procedimiento55', 'descripcion55', 0, '0000-00-00', 14),
(56, 100, 'procedimiento56', 'descripcion56', 0, '0000-00-00', 14),
(57, 100, 'procedimiento57', 'descripcion57', 0, '0000-00-00', 15),
(58, 100, 'procedimiento58', 'descripcion58', 0, '0000-00-00', 15),
(59, 100, 'procedimiento59', 'descripcion59', 0, '0000-00-00', 15),
(60, 100, 'procedimiento60', 'descripcion60', 0, '0000-00-00', 15),
(61, 100, 'procedimiento61', 'descripcion61', 0, '0000-00-00', 16),
(62, 100, 'procedimiento62', 'descripcion62', 0, '0000-00-00', 16),
(63, 100, 'procedimiento63', 'descripcion63', 0, '0000-00-00', 16),
(64, 100, 'procedimiento64', 'descripcion64', 0, '0000-00-00', 16),
(65, 100, 'procedimiento65', 'descripcion65', 0, '0000-00-00', 17),
(66, 100, 'procedimiento66', 'descripcion66', 0, '0000-00-00', 17),
(67, 100, 'procedimiento67', 'descripcion67', 0, '0000-00-00', 17),
(68, 100, 'procedimiento68', 'descripcion68', 0, '0000-00-00', 17),
(69, 100, 'procedimiento69', 'descripcion69', 0, '0000-00-00', 18),
(70, 100, 'procedimiento70', 'descripcion70', 0, '0000-00-00', 18),
(71, 100, 'procedimiento71', 'descripcion71', 0, '0000-00-00', 18),
(72, 100, 'procedimiento72', 'descripcion72', 0, '0000-00-00', 18),
(73, 100, 'procedimiento73', 'descripcion73', 0, '0000-00-00', 19),
(74, 100, 'procedimiento74', 'descripcion74', 0, '0000-00-00', 19),
(75, 100, 'procedimiento75', 'descripcion75', 0, '0000-00-00', 19),
(76, 100, 'procedimiento76', 'descripcion76', 0, '0000-00-00', 19),
(77, 100, 'procedimiento77', 'descripcion77', 0, '0000-00-00', 20),
(78, 100, 'procedimiento78', 'descripcion78', 0, '0000-00-00', 20),
(79, 100, 'procedimiento79', 'descripcion79', 0, '0000-00-00', 20),
(80, 100, 'procedimiento80', 'descripcion80', 0, '0000-00-00', 20),
(81, 100, 'procedimiento81', 'descripcion81', 0, '0000-00-00', 21),
(82, 100, 'procedimiento82', 'descripcion82', 0, '0000-00-00', 21),
(83, 100, 'procedimiento83', 'descripcion83', 0, '0000-00-00', 21),
(84, 100, 'procedimiento84', 'descripcion84', 0, '0000-00-00', 21),
(85, 100, 'procedimiento85', 'descripcion85', 0, '0000-00-00', 22),
(86, 100, 'procedimiento86', 'descripcion86', 0, '0000-00-00', 22),
(87, 100, 'procedimiento87', 'descripcion87', 0, '0000-00-00', 22),
(88, 100, 'procedimiento88', 'descripcion88', 0, '0000-00-00', 22),
(89, 100, 'procedimiento89', 'descripcion89', 0, '0000-00-00', 23),
(90, 100, 'procedimiento90', 'descripcion90', 0, '0000-00-00', 23),
(91, 100, 'procedimiento91', 'descripcion91', 0, '0000-00-00', 23),
(92, 100, 'procedimiento92', 'descripcion92', 0, '0000-00-00', 23),
(93, 100, 'procedimiento93', 'descripcion93', 0, '0000-00-00', 24),
(94, 100, 'procedimiento94', 'descripcion94', 0, '0000-00-00', 24),
(95, 100, 'procedimiento95', 'descripcion95', 0, '0000-00-00', 24),
(96, 100, 'procedimiento96', 'descripcion96', 0, '0000-00-00', 24),
(97, 100, 'procedimiento97', 'descripcion97', 0, '0000-00-00', 25),
(98, 100, 'procedimiento98', 'descripcion98', 0, '0000-00-00', 25),
(99, 100, 'procedimiento99', 'descripcion99', 0, '0000-00-00', 25),
(100, 100, 'procedimiento100', 'descripcion100', 0, '0000-00-00', 25),
(101, 100, 'procedimiento101', 'descripcion101', 0, '0000-00-00', 26),
(102, 100, 'procedimiento102', 'descripcion102', 0, '0000-00-00', 26),
(103, 100, 'procedimiento103', 'descripcion103', 0, '0000-00-00', 26),
(104, 100, 'procedimiento104', 'descripcion104', 0, '0000-00-00', 26),
(105, 100, 'procedimiento105', 'descripcion105', 0, '0000-00-00', 27),
(106, 100, 'procedimiento106', 'descripcion106', 0, '0000-00-00', 27),
(107, 100, 'procedimiento107', 'descripcion107', 0, '0000-00-00', 27),
(108, 100, 'procedimiento108', 'descripcion108', 0, '0000-00-00', 27),
(109, 100, 'procedimiento109', 'descripcion109', 0, '0000-00-00', 28),
(110, 100, 'procedimiento110', 'descripcion110', 0, '0000-00-00', 28),
(111, 100, 'procedimiento111', 'descripcion111', 0, '0000-00-00', 28),
(112, 100, 'procedimiento112', 'descripcion112', 0, '0000-00-00', 28),
(113, 100, 'procedimiento113', 'descripcion113', 0, '0000-00-00', 29),
(114, 100, 'procedimiento114', 'descripcion114', 0, '0000-00-00', 29),
(115, 100, 'procedimiento115', 'descripcion115', 0, '0000-00-00', 29),
(116, 100, 'procedimiento116', 'descripcion116', 0, '0000-00-00', 29),
(117, 100, 'procedimiento117', 'descripcion117', 0, '0000-00-00', 30),
(118, 100, 'procedimiento118', 'descripcion118', 0, '0000-00-00', 30),
(119, 100, 'procedimiento119', 'descripcion119', 0, '0000-00-00', 30),
(120, 100, 'procedimiento120', 'descripcion120', 0, '0000-00-00', 30),
(121, 100, 'procedimiento121', 'descripcion121', 0, '0000-00-00', 31),
(122, 100, 'procedimiento122', 'descripcion122', 0, '0000-00-00', 31),
(123, 100, 'procedimiento123', 'descripcion123', 0, '0000-00-00', 31),
(124, 100, 'procedimiento124', 'descripcion124', 0, '0000-00-00', 31),
(125, 100, 'procedimiento125', 'descripcion125', 0, '0000-00-00', 32),
(126, 100, 'procedimiento126', 'descripcion126', 0, '0000-00-00', 32),
(127, 100, 'procedimiento127', 'descripcion127', 0, '0000-00-00', 32),
(128, 100, 'procedimiento128', 'descripcion128', 0, '0000-00-00', 32),
(129, 100, 'procedimiento129', 'descripcion129', 0, '0000-00-00', 33),
(130, 100, 'procedimiento130', 'descripcion130', 0, '0000-00-00', 33),
(131, 100, 'procedimiento131', 'descripcion131', 0, '0000-00-00', 33),
(132, 100, 'procedimiento132', 'descripcion132', 0, '0000-00-00', 33),
(133, 100, 'procedimiento133', 'descripcion133', 0, '0000-00-00', 34),
(134, 100, 'procedimiento134', 'descripcion134', 0, '0000-00-00', 34),
(135, 100, 'procedimiento135', 'descripcion135', 0, '0000-00-00', 34),
(136, 100, 'procedimiento136', 'descripcion136', 0, '0000-00-00', 34),
(137, 100, 'procedimiento137', 'descripcion137', 0, '0000-00-00', 35),
(138, 100, 'procedimiento138', 'descripcion138', 0, '0000-00-00', 35),
(139, 100, 'procedimiento139', 'descripcion139', 0, '0000-00-00', 35),
(140, 100, 'procedimiento140', 'descripcion140', 0, '0000-00-00', 35),
(141, 100, 'procedimiento141', 'descripcion141', 0, '0000-00-00', 36),
(142, 100, 'procedimiento142', 'descripcion142', 0, '0000-00-00', 36),
(143, 100, 'procedimiento143', 'descripcion143', 0, '0000-00-00', 36),
(144, 100, 'procedimiento144', 'descripcion144', 0, '0000-00-00', 36),
(145, 100, 'procedimiento145', 'descripcion145', 0, '0000-00-00', 37),
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
(1, 'tecnico1', 'pass1', 1),
(2, 'tecnico2', 'pass2', 1),
(3, 'tecnico3', 'pass3', 1),
(4, 'tecnico4', 'pass4', 1),
(5, 'tecnico5', 'pass5', 2),
(6, 'tecnico6', 'pass6', 2),
(7, 'tecnico7', 'pass7', 2),
(8, 'tecnico8', 'pass8', 2),
(9, 'tecnico9', 'pass9', 3),
(10, 'tecnico10', 'pass10', 3),
(11, 'tecnico11', 'pass11', 3),
(12, 'tecnico12', 'pass12', 3),
(13, 'tecnico13', 'pass13', 4),
(14, 'tecnico14', 'pass14', 4),
(15, 'tecnico15', 'pass15', 4),
(16, 'tecnico16', 'pass16', 4);

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
