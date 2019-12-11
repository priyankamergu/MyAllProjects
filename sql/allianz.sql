-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2019 at 05:35 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `allianz`
--

-- --------------------------------------------------------

--
-- Table structure for table `contactbook`
--

CREATE TABLE `contactbook` (
  `First_Name` varchar(30) NOT NULL,
  `Last_Name` varchar(30) NOT NULL,
  `Email_ID` varchar(30) NOT NULL,
  `Phone_No` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `contactbook`
--

INSERT INTO `contactbook` (`First_Name`, `Last_Name`, `Email_ID`, `Phone_No`) VALUES
('Neha', 'Pulli', 'pulli@gmail.com', '445566334');

-- --------------------------------------------------------

--
-- Table structure for table `fileupload`
--

CREATE TABLE `fileupload` (
  `Name` varchar(20) NOT NULL,
  `fileupload` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Username`, `Password`) VALUES
('admin', 'admin@123'),
('admin1', 'admin#123');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `ID` int(20) NOT NULL,
  `First_Name` varchar(30) NOT NULL,
  `Last_Name` varchar(30) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Mobile_No` varchar(15) NOT NULL,
  `Dept` varchar(30) NOT NULL,
  `UserName` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`ID`, `First_Name`, `Last_Name`, `Address`, `Mobile_No`, `Dept`, `UserName`, `Password`) VALUES
(3, 'priyanka', 'mergu', 'solapur', '8887778', 'CSE', 'priya', 'priya123'),
(5, 'komal', 'sid', 'mumbai', '8899889', 'ENTC', 'komal', 'komal123'),
(6, 'shalini', 'tanksal', 'pune', '77777777', 'CS', 'shalini', 'shalini123'),
(8, 'swati', 'billa', 'bhiwandi', '88777888', 'Mech', 'swati', 'swati123'),
(9, 'akhil', 'palnati', 'pune', '8888999999', 'Civill', 'akhil', 'akhil123'),
(10, 'sneha', 'kon', 'pune', '99998888', 'CSE', 'sneha', 'sneha123');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `Roll_No` int(11) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Marks` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`Roll_No`, `Name`, `Marks`) VALUES
(3, 'Komal', 77.7),
(5, 'priya', 88);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `registration`
--
ALTER TABLE `registration`
  MODIFY `ID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
