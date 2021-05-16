-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2019 at 09:42 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` varchar(10) NOT NULL,
  `name` varchar(25) NOT NULL,
  `password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `name`, `password`) VALUES
('1', 'admin', 'admin'),
('', 'admin2', 'admin2');

-- --------------------------------------------------------

--
-- Table structure for table `trainschedule`
--

CREATE TABLE `trainschedule` (
  `Train_No` int(11) NOT NULL,
  `tName` varchar(30) NOT NULL,
  `Departure` varchar(25) NOT NULL,
  `dTime` varchar(10) NOT NULL,
  `Arrival` varchar(25) NOT NULL,
  `aTime` varchar(10) NOT NULL,
  `Ticket_price` varchar(10) NOT NULL,
  `Destination` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `trainschedule`
--

INSERT INTO `trainschedule` (`Train_No`, `tName`, `Departure`, `dTime`, `Arrival`, `aTime`, `Ticket_price`, `Destination`) VALUES
(1, 'Subarna Express', 'Chittagong', '06:40am', 'Dhaka', '01:00pm', '250Tk.', 'Chittagong-Dhaka'),
(2, 'Subarna Express', 'Dhaka', '03:00pm', 'Chittagong', '09:45am', '250Tk.', 'Dhaka-Chittagong'),
(3, 'Ekota Express', 'Dhaka', '10:00am', 'Dinajpur', '07:40pm', '400Tk.', 'Dhaka-Dinajpur'),
(4, 'Ekota Express', 'Dinajpur', '09:20pm', 'Dhaka', '07:15am', '400Tk.', 'Dinajpur-Dhaka'),
(5, 'Parabat Express', 'Dhaka', '06:40am', 'Sylhet', '01:35pm', '300Tk.', 'Dhaka-Sylhet'),
(6, 'Parabat Express', 'Sylhet', '02:30pm', 'Dhaka', '03:00am', '300Tk.', 'Sylhet-Dhaka'),
(7, 'Upukol Express', 'Dhaka', '06:20am', 'Noakhali', '12:40pm', '320Tk.', 'Dhaka-Noakhali'),
(8, 'Upukol Express', 'Noakhali', '04:20pm', 'Dhaka', '02:35am', '320Tk.', 'Noakhali-Dhaka'),
(9, 'Kishoreganj Express', 'Dhaka', '10:15am', 'Kishoreganj', '01:45pm', '175Tk.', 'Dhaka-Kishoreganj '),
(10, 'Kishoreganj Express', 'Kishoreganj', '04:30pm', 'Dhaka', '08:00pm', '175Tk.', 'Kishoreganj-Dhaka');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(25) NOT NULL,
  `username` varchar(30) NOT NULL,
  `email` varchar(35) NOT NULL,
  `password` varchar(16) NOT NULL,
  `dob` varchar(10) NOT NULL,
  `gender` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `username`, `email`, `password`, `dob`, `gender`) VALUES
(30, 'Wahid', 'Neon', 'neon@gmail.com', '1234', '24-03-1997', 'Male'),
(31, 'hulk', 'hulk', 'hulk@gmail.com', 'hulk', '10.20.1910', ' Male'),
(32, 'iron man', 'iron man', 'iron@gmail.com', 'ironman', '12.24.1930', ' Male'),
(33, 'falcon', 'falcon', 'falcon@gmail.com', 'falcon', '11.28.1940', 'Male'),
(34, 'cap', 'cap', 'cap@gmail.com', 'cap', '11.14.1890', ' Male'),
(35, 'strange', 'strange', 'strange@gmail.com', 'strange', '09.21.1958', ' Male'),
(36, 'wonder woman', 'wonder woman', 'wonder@gmail.com', 'wonder', '01.26.1960', 'Female'),
(37, 'catwoman', 'catwoman', 'catwoman@gmail.com', 'catwoman', '10.31.1965', ' Female');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `trainschedule`
--
ALTER TABLE `trainschedule`
  ADD PRIMARY KEY (`Train_No`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `trainschedule`
--
ALTER TABLE `trainschedule`
  MODIFY `Train_No` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
