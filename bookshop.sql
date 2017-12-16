/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : bookshop

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-12-16 16:39:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(10) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '123', '123');

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `Book_id` int(10) NOT NULL,
  `Bookname` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `publisher` varchar(255) DEFAULT NULL,
  `price` int(10) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `description` varchar(255) CHARACTER SET big5 DEFAULT NULL,
  PRIMARY KEY (`Book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', 'wqewqeqw', 'dsad', 'asd', '20', 'book1.jpg', '大大');
INSERT INTO `book` VALUES ('2', 'dsadsae', 'ewqewq', 'wqe', '4', 'book2.jpg', 'cccc');
INSERT INTO `book` VALUES ('12', '21e', 'e2', 'e1', '40', 'book3.jpg', '洒');
INSERT INTO `book` VALUES ('21', 'e1', 'e1e', 'e1ee', '50', 'book4.jpg', '收的');
INSERT INTO `book` VALUES ('223', 'bccce', 'ddsa', 'dsa', '90', 'book2.jpg', 'dsadwer');

-- ----------------------------
-- Table structure for bookcar
-- ----------------------------
DROP TABLE IF EXISTS `bookcar`;
CREATE TABLE `bookcar` (
  `user_id` int(12) DEFAULT NULL,
  `bookcar_id` int(11) NOT NULL,
  `img` varchar(255) DEFAULT NULL,
  `count` int(12) DEFAULT NULL,
  `price` int(12) DEFAULT NULL,
  PRIMARY KEY (`bookcar_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bookcar
-- ----------------------------
INSERT INTO `bookcar` VALUES ('1', '5', 'book1.jpg', '1', '20');
INSERT INTO `bookcar` VALUES ('1', '6', 'book2.jpg', '1', '30');
INSERT INTO `bookcar` VALUES ('1', '7', 'book3.jpg', '2', '40');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(10) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `user_id` int(12) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('5', '123', '213', '123', '123', '1', null);
INSERT INTO `orders` VALUES ('6', '123', '213', '123', '123', '1', 'no');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(10) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '123', '321', '123', '213', '123');
INSERT INTO `users` VALUES ('2', '11', '11', '111', '111', '1111');
INSERT INTO `users` VALUES ('3', '123', '123', '123', '123', '123');
