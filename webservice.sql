-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Ven 04 Décembre 2015 à 08:55
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `webservice`
--

-- --------------------------------------------------------

--
-- Structure de la table `bug`
--

CREATE TABLE IF NOT EXISTS `bug` (
  `sommaire` varchar(250) NOT NULL,
  `description` varchar(250) NOT NULL,
  `statut` int(5) NOT NULL,
  `userid` int(5) NOT NULL,
  `idprojet` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `bug`
--

INSERT INTO `bug` (`sommaire`, `description`, `statut`, `userid`, `idprojet`) VALUES
('Bug numéro 1', 'Description du bug 1', 1, 2, 1),
('Bug numéro 2', 'Description du bug 2', 2, 2, 2);

-- --------------------------------------------------------

--
-- Structure de la table `coment`
--

CREATE TABLE IF NOT EXISTS `coment` (
  `id` int(5) NOT NULL,
  `comment` varchar(250) NOT NULL,
  `idbug` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `project`
--

CREATE TABLE IF NOT EXISTS `project` (
  `id` int(5) NOT NULL,
  `libelle` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `project`
--

INSERT INTO `project` (`id`, `libelle`) VALUES
(1, 'Projet1'),
(2, 'Projet2');

-- --------------------------------------------------------

--
-- Structure de la table `role`
--

CREATE TABLE IF NOT EXISTS `role` (
  `id` int(5) NOT NULL,
  `libelle` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `role`
--

INSERT INTO `role` (`id`, `libelle`) VALUES
(1, 'admin'),
(2, 'user');

-- --------------------------------------------------------

--
-- Structure de la table `statut`
--

CREATE TABLE IF NOT EXISTS `statut` (
  `id` int(5) NOT NULL,
  `libelle` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `statut`
--

INSERT INTO `statut` (`id`, `libelle`) VALUES
(2, 'accepté'),
(3, 'en cours'),
(4, 'en revue'),
(5, 'résolu'),
(6, 'fermé'),
(1, 'créé');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `nom` varchar(50) NOT NULL,
  `prenom` varchar(50) NOT NULL,
  `mail` varchar(80) NOT NULL,
  `mdp` varchar(50) NOT NULL,
  `id` int(11) NOT NULL,
  PRIMARY KEY (`mail`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`nom`, `prenom`, `mail`, `mdp`, `id`) VALUES
('airiaud', 'florian', 'f.airiaud@bugtracker.com', '', 1),
('tonnelier', 'jocelyn', 'j.tonnelier@bugtracker.com', '', 2);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
