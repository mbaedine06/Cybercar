{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww18500\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 -- phpMyAdmin SQL Dump\
-- version 4.9.3\
-- https://www.phpmyadmin.net/\
--\
-- Host: localhost:8889\
-- Generation Time: May 25, 2022 at 03:40 PM\
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
-- --------------------------------------------------------\
\
--\
-- Table structure for table `employ\'e9es`\
--\
\
CREATE TABLE `employ\'e9es` (\
  `id` int(3) NOT NULL,\
  `pr\'e9nom` varchar(50) NOT NULL,\
  `nom` varchar(50) NOT NULL,\
  `nomDeJeuneFille` varchar(50) DEFAULT NULL,\
  `situationConjugale` varchar(50) NOT NULL,\
  `noEnfant` int(3) DEFAULT NULL,\
  `ant\'e9c\'e9dentM\'e9dical` varchar(50) NOT NULL,\
  `fonction` varchar(50) NOT NULL,\
  `dateEmbauche` date NOT NULL,\
  `noCong\'e9` int(4) NOT NULL,\
  `dateFinContrat` date NOT NULL,\
  `adresse` varchar(50) NOT NULL,\
  `noTel` varchar(50) NOT NULL,\
  `emailPersonnel` varchar(50) NOT NULL,\
  `salaire` double(8,2) NOT NULL,\
  `commission` double(8,2) NOT NULL,\
  `assuranceM\'e9dicale` varchar(50) NOT NULL,\
  `bonus` double(8,2) NOT NULL\
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='table pour gerer les employ\'e9es';\
\
--\
-- Dumping data for table `employ\'e9es`\
--\
\
INSERT INTO `employ\'e9es` (`id`, `pr\'e9nom`, `nom`, `nomDeJeuneFille`, `situationConjugale`, `noEnfant`, `ant\'e9c\'e9dentM\'e9dical`, `fonction`, `dateEmbauche`, `noCong\'e9`, `dateFinContrat`, `adresse`, `noTel`, `emailPersonnel`, `salaire`, `commission`, `assuranceM\'e9dicale`, `bonus`) VALUES\
(1, 'cdsc', 'cdscds', 'cscs', 'cdscs', 2, 'vdd', 'sddfsd', '2022-04-13', 1, '2022-04-05', 'zdze', 'ezez', 'zfef', 1233.00, 12.00, 'dsqdq', 12.00),\
(2, '', '', '', '', 1, '', '', '2002-10-30', 0, '2002-10-30', '', '', '', 1212.00, 1212.00, '', 1212.00),\
(3, 'DINE', 'MBAE', '', 'Concubinage', 10, 'Aucun', 'Amdinistrateur r\'e9seaux', '2002-10-30', 0, '2002-10-30', '193, Avenue ollier ', '+23012345678', 'HIHIHIHIH@gmail.com', 1212.00, 1212.00, 'MGEN', 1212.00),\
(4, 'DINE', 'MBAE', '', 'C\'e9libataire', 0, 'Asthme', 'Technicien ', '2021-01-02', 5, '2022-12-02', '2 Chemin des anges', '+262639647635', 'mbaedine0306@gmail.com', 9.00, 1212.00, 'MBGEN', 18.00);\
\
-- --------------------------------------------------------\
\
--\
-- Table structure for table `vente`\
--\
\
CREATE TABLE `vente` (\
  `id` int(11) NOT NULL,\
  `nom` varchar(100) DEFAULT NULL,\
  `prenom` varchar(100) DEFAULT NULL,\
  `email` varchar(255) DEFAULT NULL,\
  `ville` varchar(100) DEFAULT NULL,\
  `telephone` varchar(255) DEFAULT NULL,\
  `code_postal` varchar(5) DEFAULT NULL,\
  `r\'e9ference_voiture` varchar(10) DEFAULT NULL,\
  `date_vente` date DEFAULT NULL,\
  `prix` varchar(10) DEFAULT NULL,\
  `ajouter_voiture` varchar(20) DEFAULT NULL\
) ENGINE=InnoDB DEFAULT CHARSET=utf8;\
\
-- --------------------------------------------------------\
\
--\
-- Table structure for table `voiture`\
--\
\
CREATE TABLE `voiture` (\
  `dVoiture` int(10) NOT NULL,\
  `Marque` varchar(15) NOT NULL,\
  `Modele` varchar(15) NOT NULL,\
  `DateFabrication` date NOT NULL,\
  `Couleur` varchar(10) NOT NULL\
) ENGINE=InnoDB DEFAULT CHARSET=utf8;\
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
-- Indexes for table `commande`\
--\
ALTER TABLE `commande`\
  ADD PRIMARY KEY (`Num\'e9ro_commande`);\
\
--\
-- Indexes for table `employ\'e9es`\
--\
ALTER TABLE `employ\'e9es`\
  ADD PRIMARY KEY (`id`);\
\
--\
-- Indexes for table `vente`\
--\
ALTER TABLE `vente`\
  ADD PRIMARY KEY (`id`);\
\
--\
-- Indexes for table `voiture`\
--\
ALTER TABLE `voiture`\
  ADD PRIMARY KEY (`dVoiture`);\
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
\
--\
-- AUTO_INCREMENT for table `commande`\
--\
ALTER TABLE `commande`\
  MODIFY `Num\'e9ro_commande` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;\
\
--\
-- AUTO_INCREMENT for table `employ\'e9es`\
--\
ALTER TABLE `employ\'e9es`\
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;\
\
--\
-- AUTO_INCREMENT for table `voiture`\
--\
ALTER TABLE `voiture`\
  MODIFY `dVoiture` int(10) NOT NULL AUTO_INCREMENT;\
}