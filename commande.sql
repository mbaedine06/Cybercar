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
-- Generation Time: May 25, 2022 at 03:52 PM\
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
-- Table structure for table `commande`\
--\
\
CREATE TABLE `commande` (\
  `Num\'e9ro_commande` int(11) NOT NULL,\
  `nom_complet` varchar(100) DEFAULT NULL,\
  `r\'e9f\'e9rence_commande` varchar(100) DEFAULT NULL,\
  `date_commande` date DEFAULT NULL,\
  `email` varchar(100) DEFAULT NULL,\
  `pays` varchar(100) DEFAULT NULL,\
  `adresse` varchar(255) DEFAULT NULL,\
  `code_postal` varchar(5) DEFAULT NULL,\
  `ville` varchar(100) DEFAULT NULL,\
  `model_v\'e9hicul` varchar(100) DEFAULT NULL,\
  `Validation` varchar(100) DEFAULT NULL\
) ENGINE=InnoDB DEFAULT CHARSET=utf8;\
\
--\
-- Dumping data for table `commande`\
--\
\
INSERT INTO `commande` (`Num\'e9ro_commande`, `nom_complet`, `r\'e9f\'e9rence_commande`, `date_commande`, `email`, `pays`, `adresse`, `code_postal`, `ville`, `model_v\'e9hicul`, `Validation`) VALUES\
(1, 'Julien', 'AA12R', '2022-11-06', 'Jule@gmail.com', 'FRANCE', '12 avenue ollier', '97660', 'Brest', 'DS', 'Disponible'),\
(2, 'Bachibousou12345*', '*$$?', '2022-10-11', 'titi@cybercar.com', 'Mars', '12 Amontpassant', 'ABCD', 'LUNE', 'Chevrolet', 'Disponible'),\
(3, 'abdoulkarim halifa', 'fegrg&&\'e9\\"', '2000-11-08', 'ccdvfvc@gmail.com', 'maurice', 'avenu ollier ', '97600', 'MAMOUDZOU', 'Lamborghini', 'Disponible');\
\
--\
-- Indexes for dumped tables\
--\
\
--\
-- Indexes for table `commande`\
--\
ALTER TABLE `commande`\
  ADD PRIMARY KEY (`Num\'e9ro_commande`);\
\
--\
-- AUTO_INCREMENT for dumped tables\
--\
\
--\
-- AUTO_INCREMENT for table `commande`\
--\
ALTER TABLE `commande`\
  MODIFY `Num\'e9ro_commande` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;\
}