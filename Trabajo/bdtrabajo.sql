-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 20, 2024 at 09:28 AM
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
('A001', 'admin1', 'pass1'),
('A002', 'admin2', 'pass2'),
('A003', 'admin3', 'pass3'),
('A004', 'admin4', 'pass4');

-- --------------------------------------------------------

--
-- Table structure for table `tbmedicamento`
--

CREATE TABLE `tbmedicamento` (
  `id_med` int(225) NOT NULL,
  `precio` int(225) NOT NULL,
  `cant` int(225) NOT NULL,
  `nombre_med` varchar(225) NOT NULL,
  `pac_run_pac` int(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbmedicamento`
--

INSERT INTO `tbmedicamento` (`id_med`, `precio`, `cant`, `nombre_med`, `pac_run_pac`) VALUES
(1, 50, 1, 'medicamento1', 1),
(2, 50, 1, 'medicamento2', 1),
(3, 50, 1, 'medicamento3', 1),
(4, 50, 1, 'medicamento4', 1),
(5, 50, 1, 'medicamento5', 2),
(6, 50, 1, 'medicamento6', 2),
(7, 50, 1, 'medicamento7', 2),
(8, 50, 1, 'medicamento8', 2),
(9, 50, 1, 'medicamento9', 3),
(10, 50, 1, 'medicamento10', 3),
(11, 50, 1, 'medicamento11', 3),
(12, 50, 1, 'medicamento12', 3),
(13, 50, 1, 'medicamento13', 4),
(14, 50, 1, 'medicamento14', 4),
(15, 50, 1, 'medicamento15', 4),
(16, 50, 1, 'medicamento16', 4),
(17, 50, 1, 'medicamento17', 5),
(18, 50, 1, 'medicamento18', 5),
(19, 50, 1, 'medicamento19', 5),
(20, 50, 1, 'medicamento20', 5),
(21, 50, 1, 'medicamento21', 6),
(22, 50, 1, 'medicamento22', 6),
(23, 50, 1, 'medicamento23', 6),
(24, 50, 1, 'medicamento24', 6),
(25, 50, 1, 'medicamento25', 7),
(26, 50, 1, 'medicamento26', 7),
(27, 50, 1, 'medicamento27', 7),
(28, 50, 1, 'medicamento28', 7),
(29, 50, 1, 'medicamento29', 8),
(30, 50, 1, 'medicamento30', 8),
(31, 50, 1, 'medicamento31', 8),
(32, 50, 1, 'medicamento32', 8),
(33, 50, 1, 'medicamento33', 9),
(34, 50, 1, 'medicamento34', 9),
(35, 50, 1, 'medicamento35', 9),
(36, 50, 1, 'medicamento36', 9),
(37, 50, 1, 'medicamento37', 10),
(38, 50, 1, 'medicamento38', 10),
(39, 50, 1, 'medicamento39', 10),
(40, 50, 1, 'medicamento40', 10),
(41, 50, 1, 'medicamento41', 11),
(42, 50, 1, 'medicamento42', 11),
(43, 50, 1, 'medicamento43', 11),
(44, 50, 1, 'medicamento44', 11),
(45, 50, 1, 'medicamento45', 12),
(46, 50, 1, 'medicamento46', 12),
(47, 50, 1, 'medicamento47', 12),
(48, 50, 1, 'medicamento48', 12),
(49, 50, 1, 'medicamento49', 13),
(50, 50, 1, 'medicamento50', 13),
(51, 50, 1, 'medicamento51', 13),
(52, 50, 1, 'medicamento52', 13),
(53, 50, 1, 'medicamento53', 14),
(54, 50, 1, 'medicamento54', 14),
(55, 50, 1, 'medicamento55', 14),
(56, 50, 1, 'medicamento56', 14),
(57, 50, 1, 'medicamento57', 15),
(58, 50, 1, 'medicamento58', 15),
(59, 50, 1, 'medicamento59', 15),
(60, 50, 1, 'medicamento60', 15),
(61, 50, 1, 'medicamento61', 16),
(62, 50, 1, 'medicamento62', 16),
(63, 50, 1, 'medicamento63', 16),
(64, 50, 1, 'medicamento64', 16),
(65, 50, 1, 'medicamento65', 17),
(66, 50, 1, 'medicamento66', 17),
(67, 50, 1, 'medicamento67', 17),
(68, 50, 1, 'medicamento68', 17),
(69, 50, 1, 'medicamento69', 18),
(70, 50, 1, 'medicamento70', 18),
(71, 50, 1, 'medicamento71', 18),
(72, 50, 1, 'medicamento72', 18),
(73, 50, 1, 'medicamento73', 19),
(74, 50, 1, 'medicamento74', 19),
(75, 50, 1, 'medicamento75', 19),
(76, 50, 1, 'medicamento76', 19),
(77, 50, 1, 'medicamento77', 20),
(78, 50, 1, 'medicamento78', 20),
(79, 50, 1, 'medicamento79', 20),
(80, 50, 1, 'medicamento80', 20),
(81, 50, 1, 'medicamento81', 21),
(82, 50, 1, 'medicamento82', 21),
(83, 50, 1, 'medicamento83', 21),
(84, 50, 1, 'medicamento84', 21),
(85, 50, 1, 'medicamento85', 22),
(86, 50, 1, 'medicamento86', 22),
(87, 50, 1, 'medicamento87', 22),
(88, 50, 1, 'medicamento88', 22),
(89, 50, 1, 'medicamento89', 23),
(90, 50, 1, 'medicamento90', 23),
(91, 50, 1, 'medicamento91', 23),
(92, 50, 1, 'medicamento92', 23),
(93, 50, 1, 'medicamento93', 24),
(94, 50, 1, 'medicamento94', 24),
(95, 50, 1, 'medicamento95', 24),
(96, 50, 1, 'medicamento96', 24),
(97, 50, 1, 'medicamento97', 25),
(98, 50, 1, 'medicamento98', 25),
(99, 50, 1, 'medicamento99', 25),
(100, 50, 1, 'medicamento100', 25),
(101, 50, 1, 'medicamento101', 26),
(102, 50, 1, 'medicamento102', 26),
(103, 50, 1, 'medicamento103', 26),
(104, 50, 1, 'medicamento104', 26),
(105, 50, 1, 'medicamento105', 27),
(106, 50, 1, 'medicamento106', 27),
(107, 50, 1, 'medicamento107', 27),
(108, 50, 1, 'medicamento108', 27),
(109, 50, 1, 'medicamento109', 28),
(110, 50, 1, 'medicamento110', 28),
(111, 50, 1, 'medicamento111', 28),
(112, 50, 1, 'medicamento112', 28),
(113, 50, 1, 'medicamento113', 29),
(114, 50, 1, 'medicamento114', 29),
(115, 50, 1, 'medicamento115', 29),
(116, 50, 1, 'medicamento116', 29),
(117, 50, 1, 'medicamento117', 30),
(118, 50, 1, 'medicamento118', 30),
(119, 50, 1, 'medicamento119', 30),
(120, 50, 1, 'medicamento120', 30),
(121, 50, 1, 'medicamento121', 31),
(122, 50, 1, 'medicamento122', 31),
(123, 50, 1, 'medicamento123', 31),
(124, 50, 1, 'medicamento124', 31),
(125, 50, 1, 'medicamento125', 32),
(126, 50, 1, 'medicamento126', 32),
(127, 50, 1, 'medicamento127', 32),
(128, 50, 1, 'medicamento128', 32),
(129, 50, 1, 'medicamento129', 33),
(130, 50, 1, 'medicamento130', 33),
(131, 50, 1, 'medicamento131', 33),
(132, 50, 1, 'medicamento132', 33),
(133, 50, 1, 'medicamento133', 34),
(134, 50, 1, 'medicamento134', 34),
(135, 50, 1, 'medicamento135', 34),
(136, 50, 1, 'medicamento136', 34),
(137, 50, 1, 'medicamento137', 35),
(138, 50, 1, 'medicamento138', 35),
(139, 50, 1, 'medicamento139', 35),
(140, 50, 1, 'medicamento140', 35),
(141, 50, 1, 'medicamento141', 36),
(142, 50, 1, 'medicamento142', 36),
(143, 50, 1, 'medicamento143', 36),
(144, 50, 1, 'medicamento144', 36),
(145, 50, 1, 'medicamento145', 37),
(146, 50, 1, 'medicamento146', 37),
(147, 50, 1, 'medicamento147', 37),
(148, 50, 1, 'medicamento148', 37),
(149, 50, 1, 'medicamento149', 38),
(150, 50, 1, 'medicamento150', 38),
(151, 50, 1, 'medicamento151', 38),
(152, 50, 1, 'medicamento152', 38),
(153, 50, 1, 'medicamento153', 39),
(154, 50, 1, 'medicamento154', 39),
(155, 50, 1, 'medicamento155', 39),
(156, 50, 1, 'medicamento156', 39),
(157, 50, 1, 'medicamento157', 40),
(158, 50, 1, 'medicamento158', 40),
(159, 50, 1, 'medicamento159', 40),
(160, 50, 1, 'medicamento160', 40),
(161, 50, 1, 'medicamento161', 41),
(162, 50, 1, 'medicamento162', 41),
(163, 50, 1, 'medicamento163', 41),
(164, 50, 1, 'medicamento164', 41),
(165, 50, 1, 'medicamento165', 42),
(166, 50, 1, 'medicamento166', 42),
(167, 50, 1, 'medicamento167', 42),
(168, 50, 1, 'medicamento168', 42),
(169, 50, 1, 'medicamento169', 43),
(170, 50, 1, 'medicamento170', 43),
(171, 50, 1, 'medicamento171', 43),
(172, 50, 1, 'medicamento172', 43),
(173, 50, 1, 'medicamento173', 44),
(174, 50, 1, 'medicamento174', 44),
(175, 50, 1, 'medicamento175', 44),
(176, 50, 1, 'medicamento176', 44),
(177, 50, 1, 'medicamento177', 45),
(178, 50, 1, 'medicamento178', 45),
(179, 50, 1, 'medicamento179', 45),
(180, 50, 1, 'medicamento180', 45),
(181, 50, 1, 'medicamento181', 46),
(182, 50, 1, 'medicamento182', 46),
(183, 50, 1, 'medicamento183', 46),
(184, 50, 1, 'medicamento184', 46),
(185, 50, 1, 'medicamento185', 47),
(186, 50, 1, 'medicamento186', 47),
(187, 50, 1, 'medicamento187', 47),
(188, 50, 1, 'medicamento188', 47),
(189, 50, 1, 'medicamento189', 48),
(190, 50, 1, 'medicamento190', 48),
(191, 50, 1, 'medicamento191', 48),
(192, 50, 1, 'medicamento192', 48),
(193, 50, 1, 'medicamento193', 49),
(194, 50, 1, 'medicamento194', 49),
(195, 50, 1, 'medicamento195', 49),
(196, 50, 1, 'medicamento196', 49),
(197, 50, 1, 'medicamento197', 50),
(198, 50, 1, 'medicamento198', 50),
(199, 50, 1, 'medicamento199', 50),
(200, 50, 1, 'medicamento200', 50),
(201, 50, 1, 'medicamento201', 51),
(202, 50, 1, 'medicamento202', 51),
(203, 50, 1, 'medicamento203', 51),
(204, 50, 1, 'medicamento204', 51),
(205, 50, 1, 'medicamento205', 52),
(206, 50, 1, 'medicamento206', 52),
(207, 50, 1, 'medicamento207', 52),
(208, 50, 1, 'medicamento208', 52),
(209, 50, 1, 'medicamento209', 53),
(210, 50, 1, 'medicamento210', 53),
(211, 50, 1, 'medicamento211', 53),
(212, 50, 1, 'medicamento212', 53),
(213, 50, 1, 'medicamento213', 54),
(214, 50, 1, 'medicamento214', 54),
(215, 50, 1, 'medicamento215', 54),
(216, 50, 1, 'medicamento216', 54),
(217, 50, 1, 'medicamento217', 55),
(218, 50, 1, 'medicamento218', 55),
(219, 50, 1, 'medicamento219', 55),
(220, 50, 1, 'medicamento220', 55),
(221, 50, 1, 'medicamento221', 56),
(222, 50, 1, 'medicamento222', 56),
(223, 50, 1, 'medicamento223', 56),
(224, 50, 1, 'medicamento224', 56),
(225, 50, 1, 'medicamento225', 57),
(226, 50, 1, 'medicamento226', 57),
(227, 50, 1, 'medicamento227', 57),
(228, 50, 1, 'medicamento228', 57),
(229, 50, 1, 'medicamento229', 58),
(230, 50, 1, 'medicamento230', 58),
(231, 50, 1, 'medicamento231', 58),
(232, 50, 1, 'medicamento232', 58),
(233, 50, 1, 'medicamento233', 59),
(234, 50, 1, 'medicamento234', 59),
(235, 50, 1, 'medicamento235', 59),
(236, 50, 1, 'medicamento236', 59),
(237, 50, 1, 'medicamento237', 60),
(238, 50, 1, 'medicamento238', 60),
(239, 50, 1, 'medicamento239', 60),
(240, 50, 1, 'medicamento240', 60),
(241, 50, 1, 'medicamento241', 61),
(242, 50, 1, 'medicamento242', 61),
(243, 50, 1, 'medicamento243', 61),
(244, 50, 1, 'medicamento244', 61),
(245, 50, 1, 'medicamento245', 62),
(246, 50, 1, 'medicamento246', 62),
(247, 50, 1, 'medicamento247', 62),
(248, 50, 1, 'medicamento248', 62),
(249, 50, 1, 'medicamento249', 63),
(250, 50, 1, 'medicamento250', 63),
(251, 50, 1, 'medicamento251', 63),
(252, 50, 1, 'medicamento252', 63),
(253, 50, 1, 'medicamento253', 64),
(254, 50, 1, 'medicamento254', 64),
(255, 50, 1, 'medicamento255', 64),
(256, 50, 1, 'medicamento256', 64);

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
  `pac_run_pac` int(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbprocedimiento`
--

INSERT INTO `tbprocedimiento` (`id_pr`, `precio`, `nombre`, `descr`, `pac_run_pac`) VALUES
(1, 100, 'procedimiento1', 'descripcion1', 1),
(2, 100, 'procedimiento2', 'descripcion2', 1),
(3, 100, 'procedimiento3', 'descripcion3', 1),
(4, 100, 'procedimiento4', 'descripcion4', 1),
(5, 100, 'procedimiento5', 'descripcion5', 2),
(6, 100, 'procedimiento6', 'descripcion6', 2),
(7, 100, 'procedimiento7', 'descripcion7', 2),
(8, 100, 'procedimiento8', 'descripcion8', 2),
(9, 100, 'procedimiento9', 'descripcion9', 3),
(10, 100, 'procedimiento10', 'descripcion10', 3),
(11, 100, 'procedimiento11', 'descripcion11', 3),
(12, 100, 'procedimiento12', 'descripcion12', 3),
(13, 100, 'procedimiento13', 'descripcion13', 4),
(14, 100, 'procedimiento14', 'descripcion14', 4),
(15, 100, 'procedimiento15', 'descripcion15', 4),
(16, 100, 'procedimiento16', 'descripcion16', 4),
(17, 100, 'procedimiento17', 'descripcion17', 5),
(18, 100, 'procedimiento18', 'descripcion18', 5),
(19, 100, 'procedimiento19', 'descripcion19', 5),
(20, 100, 'procedimiento20', 'descripcion20', 5),
(21, 100, 'procedimiento21', 'descripcion21', 6),
(22, 100, 'procedimiento22', 'descripcion22', 6),
(23, 100, 'procedimiento23', 'descripcion23', 6),
(24, 100, 'procedimiento24', 'descripcion24', 6),
(25, 100, 'procedimiento25', 'descripcion25', 7),
(26, 100, 'procedimiento26', 'descripcion26', 7),
(27, 100, 'procedimiento27', 'descripcion27', 7),
(28, 100, 'procedimiento28', 'descripcion28', 7),
(29, 100, 'procedimiento29', 'descripcion29', 8),
(30, 100, 'procedimiento30', 'descripcion30', 8),
(31, 100, 'procedimiento31', 'descripcion31', 8),
(32, 100, 'procedimiento32', 'descripcion32', 8),
(33, 100, 'procedimiento33', 'descripcion33', 9),
(34, 100, 'procedimiento34', 'descripcion34', 9),
(35, 100, 'procedimiento35', 'descripcion35', 9),
(36, 100, 'procedimiento36', 'descripcion36', 9),
(37, 100, 'procedimiento37', 'descripcion37', 10),
(38, 100, 'procedimiento38', 'descripcion38', 10),
(39, 100, 'procedimiento39', 'descripcion39', 10),
(40, 100, 'procedimiento40', 'descripcion40', 10),
(41, 100, 'procedimiento41', 'descripcion41', 11),
(42, 100, 'procedimiento42', 'descripcion42', 11),
(43, 100, 'procedimiento43', 'descripcion43', 11),
(44, 100, 'procedimiento44', 'descripcion44', 11),
(45, 100, 'procedimiento45', 'descripcion45', 12),
(46, 100, 'procedimiento46', 'descripcion46', 12),
(47, 100, 'procedimiento47', 'descripcion47', 12),
(48, 100, 'procedimiento48', 'descripcion48', 12),
(49, 100, 'procedimiento49', 'descripcion49', 13),
(50, 100, 'procedimiento50', 'descripcion50', 13),
(51, 100, 'procedimiento51', 'descripcion51', 13),
(52, 100, 'procedimiento52', 'descripcion52', 13),
(53, 100, 'procedimiento53', 'descripcion53', 14),
(54, 100, 'procedimiento54', 'descripcion54', 14),
(55, 100, 'procedimiento55', 'descripcion55', 14),
(56, 100, 'procedimiento56', 'descripcion56', 14),
(57, 100, 'procedimiento57', 'descripcion57', 15),
(58, 100, 'procedimiento58', 'descripcion58', 15),
(59, 100, 'procedimiento59', 'descripcion59', 15),
(60, 100, 'procedimiento60', 'descripcion60', 15),
(61, 100, 'procedimiento61', 'descripcion61', 16),
(62, 100, 'procedimiento62', 'descripcion62', 16),
(63, 100, 'procedimiento63', 'descripcion63', 16),
(64, 100, 'procedimiento64', 'descripcion64', 16),
(65, 100, 'procedimiento65', 'descripcion65', 17),
(66, 100, 'procedimiento66', 'descripcion66', 17),
(67, 100, 'procedimiento67', 'descripcion67', 17),
(68, 100, 'procedimiento68', 'descripcion68', 17),
(69, 100, 'procedimiento69', 'descripcion69', 18),
(70, 100, 'procedimiento70', 'descripcion70', 18),
(71, 100, 'procedimiento71', 'descripcion71', 18),
(72, 100, 'procedimiento72', 'descripcion72', 18),
(73, 100, 'procedimiento73', 'descripcion73', 19),
(74, 100, 'procedimiento74', 'descripcion74', 19),
(75, 100, 'procedimiento75', 'descripcion75', 19),
(76, 100, 'procedimiento76', 'descripcion76', 19),
(77, 100, 'procedimiento77', 'descripcion77', 20),
(78, 100, 'procedimiento78', 'descripcion78', 20),
(79, 100, 'procedimiento79', 'descripcion79', 20),
(80, 100, 'procedimiento80', 'descripcion80', 20),
(81, 100, 'procedimiento81', 'descripcion81', 21),
(82, 100, 'procedimiento82', 'descripcion82', 21),
(83, 100, 'procedimiento83', 'descripcion83', 21),
(84, 100, 'procedimiento84', 'descripcion84', 21),
(85, 100, 'procedimiento85', 'descripcion85', 22),
(86, 100, 'procedimiento86', 'descripcion86', 22),
(87, 100, 'procedimiento87', 'descripcion87', 22),
(88, 100, 'procedimiento88', 'descripcion88', 22),
(89, 100, 'procedimiento89', 'descripcion89', 23),
(90, 100, 'procedimiento90', 'descripcion90', 23),
(91, 100, 'procedimiento91', 'descripcion91', 23),
(92, 100, 'procedimiento92', 'descripcion92', 23),
(93, 100, 'procedimiento93', 'descripcion93', 24),
(94, 100, 'procedimiento94', 'descripcion94', 24),
(95, 100, 'procedimiento95', 'descripcion95', 24),
(96, 100, 'procedimiento96', 'descripcion96', 24),
(97, 100, 'procedimiento97', 'descripcion97', 25),
(98, 100, 'procedimiento98', 'descripcion98', 25),
(99, 100, 'procedimiento99', 'descripcion99', 25),
(100, 100, 'procedimiento100', 'descripcion100', 25),
(101, 100, 'procedimiento101', 'descripcion101', 26),
(102, 100, 'procedimiento102', 'descripcion102', 26),
(103, 100, 'procedimiento103', 'descripcion103', 26),
(104, 100, 'procedimiento104', 'descripcion104', 26),
(105, 100, 'procedimiento105', 'descripcion105', 27),
(106, 100, 'procedimiento106', 'descripcion106', 27),
(107, 100, 'procedimiento107', 'descripcion107', 27),
(108, 100, 'procedimiento108', 'descripcion108', 27),
(109, 100, 'procedimiento109', 'descripcion109', 28),
(110, 100, 'procedimiento110', 'descripcion110', 28),
(111, 100, 'procedimiento111', 'descripcion111', 28),
(112, 100, 'procedimiento112', 'descripcion112', 28),
(113, 100, 'procedimiento113', 'descripcion113', 29),
(114, 100, 'procedimiento114', 'descripcion114', 29),
(115, 100, 'procedimiento115', 'descripcion115', 29),
(116, 100, 'procedimiento116', 'descripcion116', 29),
(117, 100, 'procedimiento117', 'descripcion117', 30),
(118, 100, 'procedimiento118', 'descripcion118', 30),
(119, 100, 'procedimiento119', 'descripcion119', 30),
(120, 100, 'procedimiento120', 'descripcion120', 30),
(121, 100, 'procedimiento121', 'descripcion121', 31),
(122, 100, 'procedimiento122', 'descripcion122', 31),
(123, 100, 'procedimiento123', 'descripcion123', 31),
(124, 100, 'procedimiento124', 'descripcion124', 31),
(125, 100, 'procedimiento125', 'descripcion125', 32),
(126, 100, 'procedimiento126', 'descripcion126', 32),
(127, 100, 'procedimiento127', 'descripcion127', 32),
(128, 100, 'procedimiento128', 'descripcion128', 32),
(129, 100, 'procedimiento129', 'descripcion129', 33),
(130, 100, 'procedimiento130', 'descripcion130', 33),
(131, 100, 'procedimiento131', 'descripcion131', 33),
(132, 100, 'procedimiento132', 'descripcion132', 33),
(133, 100, 'procedimiento133', 'descripcion133', 34),
(134, 100, 'procedimiento134', 'descripcion134', 34),
(135, 100, 'procedimiento135', 'descripcion135', 34),
(136, 100, 'procedimiento136', 'descripcion136', 34),
(137, 100, 'procedimiento137', 'descripcion137', 35),
(138, 100, 'procedimiento138', 'descripcion138', 35),
(139, 100, 'procedimiento139', 'descripcion139', 35),
(140, 100, 'procedimiento140', 'descripcion140', 35),
(141, 100, 'procedimiento141', 'descripcion141', 36),
(142, 100, 'procedimiento142', 'descripcion142', 36),
(143, 100, 'procedimiento143', 'descripcion143', 36),
(144, 100, 'procedimiento144', 'descripcion144', 36),
(145, 100, 'procedimiento145', 'descripcion145', 37),
(146, 100, 'procedimiento146', 'descripcion146', 37),
(147, 100, 'procedimiento147', 'descripcion147', 37),
(148, 100, 'procedimiento148', 'descripcion148', 37),
(149, 100, 'procedimiento149', 'descripcion149', 38),
(150, 100, 'procedimiento150', 'descripcion150', 38),
(151, 100, 'procedimiento151', 'descripcion151', 38),
(152, 100, 'procedimiento152', 'descripcion152', 38),
(153, 100, 'procedimiento153', 'descripcion153', 39),
(154, 100, 'procedimiento154', 'descripcion154', 39),
(155, 100, 'procedimiento155', 'descripcion155', 39),
(156, 100, 'procedimiento156', 'descripcion156', 39),
(157, 100, 'procedimiento157', 'descripcion157', 40),
(158, 100, 'procedimiento158', 'descripcion158', 40),
(159, 100, 'procedimiento159', 'descripcion159', 40),
(160, 100, 'procedimiento160', 'descripcion160', 40),
(161, 100, 'procedimiento161', 'descripcion161', 41),
(162, 100, 'procedimiento162', 'descripcion162', 41),
(163, 100, 'procedimiento163', 'descripcion163', 41),
(164, 100, 'procedimiento164', 'descripcion164', 41),
(165, 100, 'procedimiento165', 'descripcion165', 42),
(166, 100, 'procedimiento166', 'descripcion166', 42),
(167, 100, 'procedimiento167', 'descripcion167', 42),
(168, 100, 'procedimiento168', 'descripcion168', 42),
(169, 100, 'procedimiento169', 'descripcion169', 43),
(170, 100, 'procedimiento170', 'descripcion170', 43),
(171, 100, 'procedimiento171', 'descripcion171', 43),
(172, 100, 'procedimiento172', 'descripcion172', 43),
(173, 100, 'procedimiento173', 'descripcion173', 44),
(174, 100, 'procedimiento174', 'descripcion174', 44),
(175, 100, 'procedimiento175', 'descripcion175', 44),
(176, 100, 'procedimiento176', 'descripcion176', 44),
(177, 100, 'procedimiento177', 'descripcion177', 45),
(178, 100, 'procedimiento178', 'descripcion178', 45),
(179, 100, 'procedimiento179', 'descripcion179', 45),
(180, 100, 'procedimiento180', 'descripcion180', 45),
(181, 100, 'procedimiento181', 'descripcion181', 46),
(182, 100, 'procedimiento182', 'descripcion182', 46),
(183, 100, 'procedimiento183', 'descripcion183', 46),
(184, 100, 'procedimiento184', 'descripcion184', 46),
(185, 100, 'procedimiento185', 'descripcion185', 47),
(186, 100, 'procedimiento186', 'descripcion186', 47),
(187, 100, 'procedimiento187', 'descripcion187', 47),
(188, 100, 'procedimiento188', 'descripcion188', 47),
(189, 100, 'procedimiento189', 'descripcion189', 48),
(190, 100, 'procedimiento190', 'descripcion190', 48),
(191, 100, 'procedimiento191', 'descripcion191', 48),
(192, 100, 'procedimiento192', 'descripcion192', 48),
(193, 100, 'procedimiento193', 'descripcion193', 49),
(194, 100, 'procedimiento194', 'descripcion194', 49),
(195, 100, 'procedimiento195', 'descripcion195', 49),
(196, 100, 'procedimiento196', 'descripcion196', 49),
(197, 100, 'procedimiento197', 'descripcion197', 50),
(198, 100, 'procedimiento198', 'descripcion198', 50),
(199, 100, 'procedimiento199', 'descripcion199', 50),
(200, 100, 'procedimiento200', 'descripcion200', 50),
(201, 100, 'procedimiento201', 'descripcion201', 51),
(202, 100, 'procedimiento202', 'descripcion202', 51),
(203, 100, 'procedimiento203', 'descripcion203', 51),
(204, 100, 'procedimiento204', 'descripcion204', 51),
(205, 100, 'procedimiento205', 'descripcion205', 52),
(206, 100, 'procedimiento206', 'descripcion206', 52),
(207, 100, 'procedimiento207', 'descripcion207', 52),
(208, 100, 'procedimiento208', 'descripcion208', 52),
(209, 100, 'procedimiento209', 'descripcion209', 53),
(210, 100, 'procedimiento210', 'descripcion210', 53),
(211, 100, 'procedimiento211', 'descripcion211', 53),
(212, 100, 'procedimiento212', 'descripcion212', 53),
(213, 100, 'procedimiento213', 'descripcion213', 54),
(214, 100, 'procedimiento214', 'descripcion214', 54),
(215, 100, 'procedimiento215', 'descripcion215', 54),
(216, 100, 'procedimiento216', 'descripcion216', 54),
(217, 100, 'procedimiento217', 'descripcion217', 55),
(218, 100, 'procedimiento218', 'descripcion218', 55),
(219, 100, 'procedimiento219', 'descripcion219', 55),
(220, 100, 'procedimiento220', 'descripcion220', 55),
(221, 100, 'procedimiento221', 'descripcion221', 56),
(222, 100, 'procedimiento222', 'descripcion222', 56),
(223, 100, 'procedimiento223', 'descripcion223', 56),
(224, 100, 'procedimiento224', 'descripcion224', 56),
(225, 100, 'procedimiento225', 'descripcion225', 57),
(226, 100, 'procedimiento226', 'descripcion226', 57),
(227, 100, 'procedimiento227', 'descripcion227', 57),
(228, 100, 'procedimiento228', 'descripcion228', 57),
(229, 100, 'procedimiento229', 'descripcion229', 58),
(230, 100, 'procedimiento230', 'descripcion230', 58),
(231, 100, 'procedimiento231', 'descripcion231', 58),
(232, 100, 'procedimiento232', 'descripcion232', 58),
(233, 100, 'procedimiento233', 'descripcion233', 59),
(234, 100, 'procedimiento234', 'descripcion234', 59),
(235, 100, 'procedimiento235', 'descripcion235', 59),
(236, 100, 'procedimiento236', 'descripcion236', 59),
(237, 100, 'procedimiento237', 'descripcion237', 60),
(238, 100, 'procedimiento238', 'descripcion238', 60),
(239, 100, 'procedimiento239', 'descripcion239', 60),
(240, 100, 'procedimiento240', 'descripcion240', 60),
(241, 100, 'procedimiento241', 'descripcion241', 61),
(242, 100, 'procedimiento242', 'descripcion242', 61),
(243, 100, 'procedimiento243', 'descripcion243', 61),
(244, 100, 'procedimiento244', 'descripcion244', 61),
(245, 100, 'procedimiento245', 'descripcion245', 62),
(246, 100, 'procedimiento246', 'descripcion246', 62),
(247, 100, 'procedimiento247', 'descripcion247', 62),
(248, 100, 'procedimiento248', 'descripcion248', 62),
(249, 100, 'procedimiento249', 'descripcion249', 63),
(250, 100, 'procedimiento250', 'descripcion250', 63),
(251, 100, 'procedimiento251', 'descripcion251', 63),
(252, 100, 'procedimiento252', 'descripcion252', 63),
(253, 100, 'procedimiento253', 'descripcion253', 64),
(254, 100, 'procedimiento254', 'descripcion254', 64),
(255, 100, 'procedimiento255', 'descripcion255', 64),
(256, 100, 'procedimiento256', 'descripcion256', 64);

-- --------------------------------------------------------

--
-- Table structure for table `tbtecnico`
--

CREATE TABLE `tbtecnico` (
  `run_tec` int(225) NOT NULL,
  `usuario` varchar(225) NOT NULL,
  `passwrd` varchar(225) NOT NULL,
  `admin_id_admin` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbtecnico`
--

INSERT INTO `tbtecnico` (`run_tec`, `usuario`, `passwrd`, `admin_id_admin`) VALUES
(1, 'tecnico1', 'pass1', 'A001'),
(2, 'tecnico2', 'pass2', 'A001'),
(3, 'tecnico3', 'pass3', 'A001'),
(4, 'tecnico4', 'pass4', 'A001'),
(5, 'tecnico5', 'pass5', 'A002'),
(6, 'tecnico6', 'pass6', 'A002'),
(7, 'tecnico7', 'pass7', 'A002'),
(8, 'tecnico8', 'pass8', 'A002'),
(9, 'tecnico9', 'pass9', 'A003'),
(10, 'tecnico10', 'pass10', 'A003'),
(11, 'tecnico11', 'pass11', 'A003'),
(12, 'tecnico12', 'pass12', 'A003'),
(13, 'tecnico13', 'pass13', 'A004'),
(14, 'tecnico14', 'pass14', 'A004'),
(15, 'tecnico15', 'pass15', 'A004'),
(16, 'tecnico16', 'pass16', 'A004');

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
