-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2024 at 11:45 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `admin_info`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `SECQ` varchar(30) DEFAULT NULL,
  `ANSWER` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`SECQ`, `ANSWER`) VALUES
('What is your fathers name?', 'Admin'),
('What is your 1st pets name?', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `admin_data`
--

CREATE TABLE `admin_data` (
  `user_id` varchar(20) NOT NULL,
  `pass` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin_data`
--

INSERT INTO `admin_data` (`user_id`, `pass`) VALUES
('admin', 'admin'),
('justine', '123'),
('raven', '456'),
('qwer', '123');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `COURSECT` varchar(10) DEFAULT NULL,
  `STUDNAME` varchar(100) DEFAULT NULL,
  `SCHEDULE` varchar(20) DEFAULT NULL,
  `ROOMS` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`COURSECT`, `STUDNAME`, `SCHEDULE`, `ROOMS`) VALUES
('BSIT 2-2', 'Dela Cruz, Raven Nicole C.', 'Tuesday', ' '),
('BSIT 2-2', 'San Juan, Regie M.', 'Tuesday', ' '),
('BSIT 2-2', 'Baustista, Justine Lloyd G.', 'Tuesday', ' ');

-- --------------------------------------------------------

--
-- Table structure for table `justine`
--

CREATE TABLE `justine` (
  `SEC_Q` varchar(30) DEFAULT NULL,
  `ANSWER` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `justine`
--

INSERT INTO `justine` (`SEC_Q`, `ANSWER`) VALUES
('What is your fathers name?', 'Bautista'),
('What is your 1st pets name?', 'Coco');

-- --------------------------------------------------------

--
-- Table structure for table `qwer`
--

CREATE TABLE `qwer` (
  `SEC_Q` varchar(30) DEFAULT NULL,
  `ANSWER` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `qwer`
--

INSERT INTO `qwer` (`SEC_Q`, `ANSWER`) VALUES
('What is your fathers name?', 'Qwer'),
('What is your 1st pets name?', 'Qwer');

-- --------------------------------------------------------

--
-- Table structure for table `raven`
--

CREATE TABLE `raven` (
  `SEC_Q` varchar(30) DEFAULT NULL,
  `ANSWER` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `raven`
--

INSERT INTO `raven` (`SEC_Q`, `ANSWER`) VALUES
('What is your fathers name?', 'Raymond'),
('What is your 1st pets name?', 'Pango');

-- --------------------------------------------------------

--
-- Table structure for table `sectwo`
--

CREATE TABLE `sectwo` (
  `DAY` char(10) DEFAULT NULL,
  `TIME` varchar(20) DEFAULT NULL,
  `SUBJECT` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `sectwo`
--

INSERT INTO `sectwo` (`DAY`, `TIME`, `SUBJECT`) VALUES
('Tuesday', '09:00am - 12:00pm', '1.) Human Computer Interaction'),
('Tuesday', '12:00pm - 03:00pm', '2.) Modeling & Simulation'),
('Tuesday', '04:30pm - 08:30pm', '3.) Object Oriented Programming'),
('Wednesday', '04:00pm - 09:00pm', '1.) Network Administration'),
('Friday', '08:30am - 01:30pm', '1.) Integrative Programming & Technologies 1'),
('Saturday', '10:30am - 01:30pm', '1.) BSIT Free Elective 2 (E-Commerce)'),
('Saturday', '02:00pm - 04:00pm', '2.) Physical Activity Towards Health & Fitness 4'),
('Saturday', '04:00pm - 09:00pm', '3.) Information Management');

-- --------------------------------------------------------

--
-- Table structure for table `studinfo`
--

CREATE TABLE `studinfo` (
  `STUDNUM` varchar(15) DEFAULT NULL,
  `STUDNAME` varchar(100) DEFAULT NULL,
  `COURSECT` varchar(20) DEFAULT NULL,
  `ATTENDANCE` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `studinfo`
--

INSERT INTO `studinfo` (`STUDNUM`, `STUDNAME`, `COURSECT`, `ATTENDANCE`) VALUES
('2022-00434-SJ-1', 'Dela Cruz, Raven Nicole C.', 'BSIT 2-2', '0000-00-00'),
('2022-00107-SJ-0', 'Baustista, Justine Lloyd G.', 'BSIT 2-2', '0000-00-00'),
('2022-00136-SJ-0', 'San Juan, Regie M.', 'BSIT 2-2', '0000-00-00');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
