{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 -- phpMyAdmin SQL Dump\
-- version 4.9.3\
-- https://www.phpmyadmin.net/\
--\
-- Host: localhost:8889\
-- Generation Time: May 25, 2022 at 03:49 PM\
-- Server version: 5.7.26\
-- PHP Version: 7.4.2\
\
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";\
SET time_zone = "+00:00";\
\
--\
-- Database: `Cybercar`\
--\
\
-- --------------------------------------------------------\
\
--\
-- Table structure for table `clients`\
--\
\
CREATE TABLE `clients` (\
  `id` int(11) NOT NULL,\
  `nom` varchar(30) NOT NULL,\
  `pr\'e9nom` varchar(30) DEFAULT NULL,\
  `noTel` varchar(20) DEFAULT NULL,\
  `adresse` text,\
  `email` varchar(50) DEFAULT NULL\
) ENGINE=InnoDB DEFAULT CHARSET=utf8;\
\
--\
-- Dumping data for table `clients`\
--\
\
INSERT INTO `clients` (`id`, `nom`, `pr\'e9nom`, `noTel`, `adresse`, `email`) VALUES\
(28, 'July', 'Laurenne', '12 rue soleiller', '0304040402', 'Gustave@gmail.com'),\
(29, 'Hello', 'Brest', '23 maupa', '123456789', 'mbae@gmail.com');\
\
--\
-- Indexes for dumped tables\
--\
\
--\
-- Indexes for table `clients`\
--\
ALTER TABLE `clients`\
  ADD PRIMARY KEY (`id`);\
\
--\
-- AUTO_INCREMENT for dumped tables\
--\
\
--\
-- AUTO_INCREMENT for table `clients`\
--\
ALTER TABLE `clients`\
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;\
}