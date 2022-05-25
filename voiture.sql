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
-- Generation Time: May 25, 2022 at 03:55 PM\
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
-- AUTO_INCREMENT for table `voiture`\
--\
ALTER TABLE `voiture`\
  MODIFY `dVoiture` int(10) NOT NULL AUTO_INCREMENT;\
}