-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2019 at 05:36 AM
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
-- Database: `onlineshopping`
--

-- --------------------------------------------------------

--
-- Table structure for table `add_to_cart`
--

CREATE TABLE `add_to_cart` (
  `Art_To_Cart_ID` int(10) NOT NULL,
  `Order_ID` int(10) NOT NULL,
  `productID` int(10) NOT NULL,
  `quantity` int(10) NOT NULL,
  `Total_price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `add_to_cart`
--

INSERT INTO `add_to_cart` (`Art_To_Cart_ID`, `Order_ID`, `productID`, `quantity`, `Total_price`) VALUES
(1, 11, 101, 1, 50),
(2, 11, 102, 4, 240),
(3, 12, 101, 2, 100),
(4, 12, 102, 2, 120),
(5, 13, 101, 2, 100),
(6, 13, 106, 3, 37.2),
(7, 14, 101, 2, 100),
(8, 14, 102, 2, 120),
(9, 15, 101, 2, 100),
(10, 15, 102, 2, 120),
(11, 16, 101, 2, 100),
(12, 16, 102, 2, 120),
(13, 17, 101, 2, 100),
(14, 17, 102, 2, 120),
(15, 18, 101, 2, 100),
(16, 18, 102, 2, 120),
(17, 19, 101, 2, 100),
(18, 19, 188, 2, 178),
(19, 20, 102, 2, 120),
(20, 20, 101, 2, 100),
(21, 21, 102, 2, 120),
(22, 21, 101, 2, 100),
(23, 22, 102, 1, 60),
(24, 22, 101, 1, 50),
(25, 22, 101, 1, 50),
(26, 23, 102, 1, 60),
(27, 23, 101, 1, 50),
(28, 23, 101, 1, 50),
(29, 23, 101, 1, 50),
(30, 24, 102, 1, 60),
(31, 24, 101, 1, 50),
(32, 24, 101, 1, 50),
(33, 24, 101, 1, 50),
(34, 24, 101, 1, 50),
(35, 25, 102, 1, 60),
(36, 25, 101, 1, 50),
(37, 25, 101, 1, 50),
(38, 25, 101, 1, 50),
(39, 25, 101, 1, 50),
(40, 25, 102, 1, 60),
(41, 26, 103, 3, 96),
(42, 26, 106, 2, 24.8);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `Category_ID` int(30) NOT NULL,
  `Category_Code` varchar(50) NOT NULL,
  `Category_Desc` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`Category_ID`, `Category_Code`, `Category_Desc`) VALUES
(50, 'MH999', 'Redmi'),
(55, 'MH9898', 'ViVo');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Customer_ID` int(11) NOT NULL,
  `Customer_Name` varchar(30) NOT NULL,
  `Customer_Mobile` int(20) NOT NULL,
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Customer_ID`, `Customer_Name`, `Customer_Mobile`, `Username`, `Password`) VALUES
(1, 'neha', 898989, 'neaa', 'neaa123'),
(2, 'neha', 898989, 'neaa', 'neaa123'),
(3, 'neha', 898989, 'neaa', 'neaa123'),
(4, 'Priyanka', 90809090, 'priya', 'priya123');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `Order_ID` int(10) NOT NULL,
  `Order_Date` date NOT NULL,
  `Status` varchar(50) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Total_Price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`Order_ID`, `Order_Date`, `Status`, `Username`, `Total_Price`) VALUES
(4, '2019-11-22', 'Ordered', 'neaa', 220),
(5, '2019-11-23', 'Ordered', 'neaa', 60),
(6, '2019-11-23', 'Ordered', 'neaa', 224),
(7, '2019-11-23', 'Ordered', 'neaa', 50),
(8, '2019-11-23', 'Ordered', 'neaa', 150),
(9, '2019-11-23', 'Ordered', 'neaa', 150),
(10, '2019-11-23', 'Ordered', 'neaa', 200),
(11, '2019-11-23', 'Ordered', 'neaa', 290),
(12, '2019-11-25', 'Ordered', 'neaa', 220),
(13, '2019-11-25', 'Ordered', 'neaa', 137.2),
(14, '2019-11-25', 'Ordered', 'neaa', 220),
(15, '2019-11-25', 'Ordered', 'priya', 220),
(16, '2019-11-25', 'Ordered', 'priya', 220),
(17, '2019-11-25', 'Ordered', 'priya', 220),
(18, '2019-11-25', 'Ordered', 'neaa', 220),
(19, '2019-11-25', 'Ordered', 'priya', 278),
(20, '2019-11-25', 'Ordered', 'priya', 220),
(21, '2019-11-25', 'Ordered', 'priya', 220),
(22, '2019-11-25', 'Ordered', 'priya', 160),
(23, '2019-11-25', 'Ordered', 'priya', 210),
(24, '2019-11-25', 'Ordered', 'priya', 260),
(25, '2019-11-25', 'Ordered', 'priya', 320),
(26, '2019-11-26', 'Ordered', 'priya', 120.8);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `productID` int(30) NOT NULL,
  `productCode` varchar(30) NOT NULL,
  `productDescription` varchar(60) NOT NULL,
  `productPrice` float NOT NULL,
  `productDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`productID`, `productCode`, `productDescription`, `productPrice`, `productDate`) VALUES
(101, 'colgate1', 'Colgate1 Tube', 50, '2019-01-11'),
(102, 'colgate2', 'Colgate2 Tube', 60, '2019-01-13'),
(103, 'asd', 'oimoim', 32, '1958-01-11'),
(106, 'ssfdsf444444', 'usdg', 12.4, '2009-01-11'),
(109, 'oo', 'pp', 90, '1209-01-10'),
(188, 'mm', 'll', 89, '2019-01-10');

-- --------------------------------------------------------

--
-- Table structure for table `product1`
--

CREATE TABLE `product1` (
  `id` int(11) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `manf_date` datetime DEFAULT NULL,
  `price` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product1`
--

INSERT INTO `product1` (`id`, `code`, `description`, `manf_date`, `price`) VALUES
(1, '2121', 'mobile', '2019-11-21 00:00:00', 200);

-- --------------------------------------------------------

--
-- Table structure for table `product_category`
--

CREATE TABLE `product_category` (
  `productID` int(30) NOT NULL,
  `Category_ID` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product_category`
--

INSERT INTO `product_category` (`productID`, `Category_ID`) VALUES
(101, 50),
(102, 50),
(188, 55),
(109, 55),
(101, 55);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `add_to_cart`
--
ALTER TABLE `add_to_cart`
  ADD PRIMARY KEY (`Art_To_Cart_ID`),
  ADD KEY `ordero` (`Order_ID`),
  ADD KEY `orderc` (`productID`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`Category_ID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Customer_ID`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`Order_ID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`productID`);

--
-- Indexes for table `product1`
--
ALTER TABLE `product1`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product_category`
--
ALTER TABLE `product_category`
  ADD KEY `merguproduct` (`productID`),
  ADD KEY `mergucategory` (`Category_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `add_to_cart`
--
ALTER TABLE `add_to_cart`
  MODIFY `Art_To_Cart_ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `Customer_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `Order_ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `add_to_cart`
--
ALTER TABLE `add_to_cart`
  ADD CONSTRAINT `orderc` FOREIGN KEY (`productID`) REFERENCES `product` (`productID`),
  ADD CONSTRAINT `ordero` FOREIGN KEY (`Order_ID`) REFERENCES `orders` (`Order_ID`);

--
-- Constraints for table `product_category`
--
ALTER TABLE `product_category`
  ADD CONSTRAINT `mergucategory` FOREIGN KEY (`Category_ID`) REFERENCES `category` (`Category_ID`),
  ADD CONSTRAINT `merguproduct` FOREIGN KEY (`productID`) REFERENCES `product` (`productID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
