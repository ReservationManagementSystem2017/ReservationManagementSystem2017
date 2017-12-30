/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : reservation_mis

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2017-12-30 19:25:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_bill
-- ----------------------------
DROP TABLE IF EXISTS `t_bill`;
CREATE TABLE `t_bill` (
  `bid` int(11) NOT NULL,
  `bmoney` double DEFAULT NULL,
  `cid` int(11) DEFAULT NULL,
  `eid` int(11) DEFAULT NULL,
  `btime` varchar(50) DEFAULT NULL,
  `binvoice` tinyint(1) DEFAULT NULL,
  `bstate` int(11) DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_bill
-- ----------------------------
INSERT INTO `t_bill` VALUES ('4', '7.2', '1', '2', '2017-12-25 23:56:19', '0', '1');
INSERT INTO `t_bill` VALUES ('5', '90', '1', '2', '2017-12-25 23:56:31', '0', '1');
INSERT INTO `t_bill` VALUES ('6', '9', '1', '2', '2017-12-25 23:56:36', '0', '1');
INSERT INTO `t_bill` VALUES ('7', '210', '2', '2', '2017-12-25 23:56:41', '0', '1');
INSERT INTO `t_bill` VALUES ('8', '92.7', null, '1', '2017-12-27 20:20:00', '0', '1');
INSERT INTO `t_bill` VALUES ('9', '79.2', null, '1', '2017-12-27 20:20:18', '0', '1');
INSERT INTO `t_bill` VALUES ('10', '180', '1', '1', '2017-12-27 20:39:26', '0', '1');
INSERT INTO `t_bill` VALUES ('11', '4.5', null, '2', '2017-12-27 22:17:03', '0', '1');
INSERT INTO `t_bill` VALUES ('12', '68.4', null, '2', '2017-12-27 22:17:07', '0', '1');
INSERT INTO `t_bill` VALUES ('13', '91.8', '3', '1', '2017-12-27 22:27:41', '0', '1');
INSERT INTO `t_bill` VALUES ('14', '279', '1', '2', '2017-12-27 22:33:15', '0', '1');
INSERT INTO `t_bill` VALUES ('15', '18', null, '2', '2017-12-28 08:02:37', '0', '1');

-- ----------------------------
-- Table structure for t_cook_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_cook_menu`;
CREATE TABLE `t_cook_menu` (
  `Cmid` int(11) NOT NULL AUTO_INCREMENT,
  `eid` int(11) DEFAULT NULL,
  `mid` int(11) DEFAULT NULL,
  `cmstate` int(11) DEFAULT NULL,
  PRIMARY KEY (`Cmid`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_cook_menu
-- ----------------------------
INSERT INTO `t_cook_menu` VALUES ('1', '4', '11', '1');
INSERT INTO `t_cook_menu` VALUES ('3', '4', '12', '1');
INSERT INTO `t_cook_menu` VALUES ('4', '4', '13', '1');
INSERT INTO `t_cook_menu` VALUES ('5', '4', '1', '1');
INSERT INTO `t_cook_menu` VALUES ('6', '4', '2', '1');
INSERT INTO `t_cook_menu` VALUES ('7', '6', '3', '1');
INSERT INTO `t_cook_menu` VALUES ('8', '6', '4', '1');
INSERT INTO `t_cook_menu` VALUES ('9', '6', '5', '1');
INSERT INTO `t_cook_menu` VALUES ('10', '5', '6', '1');
INSERT INTO `t_cook_menu` VALUES ('11', '6', '7', '1');
INSERT INTO `t_cook_menu` VALUES ('12', '5', '7', '1');
INSERT INTO `t_cook_menu` VALUES ('13', '4', '3', '1');
INSERT INTO `t_cook_menu` VALUES ('14', '4', '4', '1');
INSERT INTO `t_cook_menu` VALUES ('15', '4', '5', '1');
INSERT INTO `t_cook_menu` VALUES ('16', '4', '6', '1');
INSERT INTO `t_cook_menu` VALUES ('17', '4', '7', '1');
INSERT INTO `t_cook_menu` VALUES ('18', '4', '8', '1');
INSERT INTO `t_cook_menu` VALUES ('19', '4', '14', '1');

-- ----------------------------
-- Table structure for t_customer
-- ----------------------------
DROP TABLE IF EXISTS `t_customer`;
CREATE TABLE `t_customer` (
  `Cid` int(11) NOT NULL AUTO_INCREMENT,
  `cname` char(20) DEFAULT NULL,
  `cscore` double DEFAULT NULL,
  `cphone` char(11) DEFAULT NULL,
  `cstate` int(11) DEFAULT NULL,
  PRIMARY KEY (`Cid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_customer
-- ----------------------------
INSERT INTO `t_customer` VALUES ('1', '陈老板', '88.86', '17854213200', '1');
INSERT INTO `t_customer` VALUES ('2', '刘老师', '21', '17854213201', '1');

-- ----------------------------
-- Table structure for t_discount
-- ----------------------------
DROP TABLE IF EXISTS `t_discount`;
CREATE TABLE `t_discount` (
  `Did` int(11) NOT NULL AUTO_INCREMENT,
  `Dtype` int(11) DEFAULT NULL,
  `discountrate` double DEFAULT NULL,
  `dmeetmoney` double DEFAULT NULL,
  `dreducemoney` double DEFAULT NULL,
  `dstate` int(11) DEFAULT NULL,
  PRIMARY KEY (`Did`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_discount
-- ----------------------------
INSERT INTO `t_discount` VALUES ('1', '1', '0.9', null, null, '1');
INSERT INTO `t_discount` VALUES ('2', '2', null, '300', '20', '0');
INSERT INTO `t_discount` VALUES ('3', '2', '0', '12121', '112121212', '0');
INSERT INTO `t_discount` VALUES ('4', '2', '0', '100', '10', '1');
INSERT INTO `t_discount` VALUES ('5', '2', '0', '100', '20', '1');

-- ----------------------------
-- Table structure for t_employee
-- ----------------------------
DROP TABLE IF EXISTS `t_employee`;
CREATE TABLE `t_employee` (
  `eid` int(11) NOT NULL AUTO_INCREMENT,
  `ename` varchar(20) DEFAULT NULL,
  `esex` char(2) DEFAULT NULL,
  `eage` int(11) DEFAULT NULL,
  `ewage` double DEFAULT NULL,
  `ephone` char(11) DEFAULT NULL,
  `etype` varchar(20) DEFAULT NULL,
  `estate` int(11) DEFAULT NULL,
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_employee
-- ----------------------------
INSERT INTO `t_employee` VALUES ('1', '张三', '男', '34', '4000', '17854212345', '经理', '1');
INSERT INTO `t_employee` VALUES ('2', '李四', '男', '35', '4000', '17854212346', '服务员', '1');
INSERT INTO `t_employee` VALUES ('3', '王五', '男', '35', '3000', '17854212347', '服务员', '1');
INSERT INTO `t_employee` VALUES ('4', '王大厨', '男', '35', '4000', '17854212348', '厨师', '1');
INSERT INTO `t_employee` VALUES ('5', '郑六', '女', '28', '3000', '17854212349', '厨师', '1');
INSERT INTO `t_employee` VALUES ('6', '伊人', '女', '24', '3000', '17854212350', '厨师', '1');
INSERT INTO `t_employee` VALUES ('7', '豆豆', '女', '24', '3000', '17854212351', '采购员', '1');

-- ----------------------------
-- Table structure for t_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu` (
  `Mid` int(11) NOT NULL AUTO_INCREMENT,
  `Mname` varchar(50) DEFAULT NULL,
  `Mtype` varchar(50) DEFAULT NULL,
  `Mprice` double DEFAULT NULL,
  `mcooktime` int(11) DEFAULT NULL,
  `Mstorage` int(11) DEFAULT NULL,
  `mcount` int(11) DEFAULT NULL,
  `mstate` int(11) DEFAULT NULL,
  PRIMARY KEY (`Mid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_menu
-- ----------------------------
INSERT INTO `t_menu` VALUES ('1', '醋溜土豆丝', '鲁菜', '8', '5', '87', '13', '1');
INSERT INTO `t_menu` VALUES ('2', '糖醋里脊', '鲁菜', '32', '10', '92', '8', '1');
INSERT INTO `t_menu` VALUES ('3', '麻婆豆腐', '川菜', '12', '5', '88', '12', '1');
INSERT INTO `t_menu` VALUES ('4', '麻辣香锅', '川菜', '24', '5', '98', '2', '1');
INSERT INTO `t_menu` VALUES ('5', '麻辣小龙虾', '川菜', '40', '15', '91', '9', '1');
INSERT INTO `t_menu` VALUES ('6', '葱爆羊肉', '清真', '40', '10', '96', '4', '1');
INSERT INTO `t_menu` VALUES ('7', '鸡蛋玉米羹', '汤', '12', '5', '90', '10', '1');
INSERT INTO `t_menu` VALUES ('8', '北京二锅头', '酒水', '10', '0', '99', '1', '1');
INSERT INTO `t_menu` VALUES ('10', '可口可乐', '酒水', '5', '0', '94', '6', '0');
INSERT INTO `t_menu` VALUES ('11', '可口可乐', '酒水', '5', '0', '91', '9', '1');
INSERT INTO `t_menu` VALUES ('12', '雪碧', '酒水', '5', '0', '98', '2', '1');
INSERT INTO `t_menu` VALUES ('13', '果粒橙', '酒水', '5', '0', '98', '2', '1');
INSERT INTO `t_menu` VALUES ('14', '椰子汁', '酒水', '5', '0', '97', '3', '1');

-- ----------------------------
-- Table structure for t_orderdishes
-- ----------------------------
DROP TABLE IF EXISTS `t_orderdishes`;
CREATE TABLE `t_orderdishes` (
  `odid` int(11) NOT NULL AUTO_INCREMENT,
  `oid` int(11) DEFAULT NULL,
  `mid` int(11) DEFAULT NULL,
  `odcount` int(11) DEFAULT NULL,
  `odtime` varchar(50) DEFAULT NULL,
  `odstate` int(11) DEFAULT NULL,
  PRIMARY KEY (`odid`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_orderdishes
-- ----------------------------
INSERT INTO `t_orderdishes` VALUES ('9', '4', '1', '1', '2017-12-25 23:42:50', '4');
INSERT INTO `t_orderdishes` VALUES ('10', '5', '1', '5', '2017-12-25 23:43:04', '4');
INSERT INTO `t_orderdishes` VALUES ('11', '5', '3', '5', '2017-12-25 23:43:04', '4');
INSERT INTO `t_orderdishes` VALUES ('12', '6', '11', '1', '2017-12-25 23:43:16', '4');
INSERT INTO `t_orderdishes` VALUES ('13', '6', '14', '1', '2017-12-25 23:43:16', '4');
INSERT INTO `t_orderdishes` VALUES ('14', '7', '6', '1', '2017-12-25 23:43:27', '4');
INSERT INTO `t_orderdishes` VALUES ('15', '7', '5', '5', '2017-12-25 23:43:27', '4');
INSERT INTO `t_orderdishes` VALUES ('16', '8', '7', '4', '2017-12-27 15:40:44', '4');
INSERT INTO `t_orderdishes` VALUES ('17', '8', '11', '1', '2017-12-27 15:40:44', '4');
INSERT INTO `t_orderdishes` VALUES ('18', '8', '12', '1', '2017-12-27 15:40:44', '4');
INSERT INTO `t_orderdishes` VALUES ('19', '8', '14', '1', '2017-12-27 15:40:44', '4');
INSERT INTO `t_orderdishes` VALUES ('20', '8', '5', '1', '2017-12-27 15:40:44', '4');
INSERT INTO `t_orderdishes` VALUES ('21', '9', '2', '2', '2017-12-27 19:41:04', '4');
INSERT INTO `t_orderdishes` VALUES ('22', '9', '7', '2', '2017-12-27 19:41:04', '4');
INSERT INTO `t_orderdishes` VALUES ('23', '10', '3', '1', '2017-12-27 20:25:44', '4');
INSERT INTO `t_orderdishes` VALUES ('24', '10', '5', '1', '2017-12-27 20:25:44', '4');
INSERT INTO `t_orderdishes` VALUES ('25', '10', '1', '1', '2017-12-27 20:25:44', '4');
INSERT INTO `t_orderdishes` VALUES ('26', '10', '2', '1', '2017-12-27 20:25:44', '4');
INSERT INTO `t_orderdishes` VALUES ('27', '10', '4', '1', '2017-12-27 20:25:44', '4');
INSERT INTO `t_orderdishes` VALUES ('28', '10', '6', '1', '2017-12-27 20:25:44', '4');
INSERT INTO `t_orderdishes` VALUES ('29', '10', '7', '2', '2017-12-27 20:25:44', '4');
INSERT INTO `t_orderdishes` VALUES ('30', '10', '8', '1', '2017-12-27 20:25:44', '4');
INSERT INTO `t_orderdishes` VALUES ('31', '10', '11', '1', '2017-12-27 20:25:44', '4');
INSERT INTO `t_orderdishes` VALUES ('32', '10', '12', '1', '2017-12-27 20:25:44', '4');
INSERT INTO `t_orderdishes` VALUES ('33', '10', '13', '1', '2017-12-27 20:25:44', '4');
INSERT INTO `t_orderdishes` VALUES ('34', '10', '14', '1', '2017-12-27 20:25:44', '4');
INSERT INTO `t_orderdishes` VALUES ('35', '11', '13', '1', '2017-12-27 20:43:07', '4');
INSERT INTO `t_orderdishes` VALUES ('36', '12', '6', '1', '2017-12-27 22:15:56', '4');
INSERT INTO `t_orderdishes` VALUES ('37', '12', '4', '1', '2017-12-27 22:15:56', '4');
INSERT INTO `t_orderdishes` VALUES ('38', '12', '7', '1', '2017-12-27 22:15:56', '4');
INSERT INTO `t_orderdishes` VALUES ('39', '13', '5', '1', '2017-12-27 22:26:58', '4');
INSERT INTO `t_orderdishes` VALUES ('40', '13', '6', '1', '2017-12-27 22:26:58', '4');
INSERT INTO `t_orderdishes` VALUES ('41', '13', '3', '1', '2017-12-27 22:26:58', '4');
INSERT INTO `t_orderdishes` VALUES ('42', '13', '11', '1', '2017-12-27 22:26:58', '4');
INSERT INTO `t_orderdishes` VALUES ('43', '13', '10', '1', '2017-12-27 22:26:58', '4');
INSERT INTO `t_orderdishes` VALUES ('44', '14', '2', '5', '2017-12-27 22:31:19', '4');
INSERT INTO `t_orderdishes` VALUES ('45', '14', '1', '5', '2017-12-27 22:31:19', '4');
INSERT INTO `t_orderdishes` VALUES ('46', '14', '3', '5', '2017-12-27 22:31:19', '4');
INSERT INTO `t_orderdishes` VALUES ('47', '14', '10', '5', '2017-12-27 22:31:19', '4');
INSERT INTO `t_orderdishes` VALUES ('48', '14', '11', '5', '2017-12-27 22:31:19', '4');
INSERT INTO `t_orderdishes` VALUES ('49', '15', '1', '1', '2017-12-28 08:01:22', '4');
INSERT INTO `t_orderdishes` VALUES ('50', '15', '7', '1', '2017-12-28 08:01:22', '4');
INSERT INTO `t_orderdishes` VALUES ('51', '16', '5', '1', '2017-12-28 08:50:09', '0');

-- ----------------------------
-- Table structure for t_orders
-- ----------------------------
DROP TABLE IF EXISTS `t_orders`;
CREATE TABLE `t_orders` (
  `Oid` int(11) NOT NULL AUTO_INCREMENT,
  `Opopulation` int(11) DEFAULT NULL,
  `otime` varchar(50) DEFAULT NULL,
  `eid` int(11) DEFAULT NULL,
  `tid` int(11) DEFAULT NULL,
  `rid` int(11) DEFAULT NULL,
  `ostate` int(11) DEFAULT NULL,
  PRIMARY KEY (`Oid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_orders
-- ----------------------------
INSERT INTO `t_orders` VALUES ('4', '2', '2017-12-25 23:42:50', '1', '1', '1', '0');
INSERT INTO `t_orders` VALUES ('5', '2', '2017-12-25 23:43:04', '1', '2', '1', '0');
INSERT INTO `t_orders` VALUES ('6', '3', '2017-12-25 23:43:16', '1', '3', '1', '0');
INSERT INTO `t_orders` VALUES ('7', '2', '2017-12-25 23:43:27', '1', '4', '1', '0');
INSERT INTO `t_orders` VALUES ('8', '2', '2017-12-27 15:40:44', '1', '5', '1', '0');
INSERT INTO `t_orders` VALUES ('9', '2', '2017-12-27 19:41:04', '1', '4', '1', '0');
INSERT INTO `t_orders` VALUES ('10', '2', '2017-12-27 20:25:44', '1', '2', '1', '0');
INSERT INTO `t_orders` VALUES ('11', '2', '2017-12-27 20:43:07', '1', '3', '1', '0');
INSERT INTO `t_orders` VALUES ('12', '2', '2017-12-27 22:15:56', '1', '6', '1', '0');
INSERT INTO `t_orders` VALUES ('13', '1', '2017-12-27 22:26:58', '1', '5', '1', '0');
INSERT INTO `t_orders` VALUES ('14', '2', '2017-12-27 22:31:19', '1', '15', '3', '0');
INSERT INTO `t_orders` VALUES ('15', '2', '2017-12-28 08:01:22', '1', '5', '1', '0');
INSERT INTO `t_orders` VALUES ('16', '2', '2017-12-28 08:50:09', '1', '3', '1', '1');

-- ----------------------------
-- Table structure for t_room
-- ----------------------------
DROP TABLE IF EXISTS `t_room`;
CREATE TABLE `t_room` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `rname` varchar(20) DEFAULT NULL,
  `rcounttable` int(11) DEFAULT NULL,
  `rcondition` int(11) DEFAULT NULL,
  `rstate` int(11) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_room
-- ----------------------------
INSERT INTO `t_room` VALUES ('1', '大厅', '20', '9', '1');
INSERT INTO `t_room` VALUES ('2', '聚贤阁', '5', '3', '1');
INSERT INTO `t_room` VALUES ('3', '牡丹亭', '5', '3', '1');
INSERT INTO `t_room` VALUES ('4', '凌云殿', '5', '2', '1');

-- ----------------------------
-- Table structure for t_tables
-- ----------------------------
DROP TABLE IF EXISTS `t_tables`;
CREATE TABLE `t_tables` (
  `Tid` int(11) NOT NULL AUTO_INCREMENT,
  `Rid` int(11) DEFAULT NULL,
  `Tseat` int(11) DEFAULT NULL,
  `tcondition` int(11) DEFAULT NULL,
  `tstate` int(11) DEFAULT NULL,
  PRIMARY KEY (`Tid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_tables
-- ----------------------------
INSERT INTO `t_tables` VALUES ('1', '1', '4', '1', '1');
INSERT INTO `t_tables` VALUES ('2', '1', '4', '1', '1');
INSERT INTO `t_tables` VALUES ('3', '1', '4', '0', '1');
INSERT INTO `t_tables` VALUES ('4', '1', '4', '1', '1');
INSERT INTO `t_tables` VALUES ('5', '1', '4', '1', '1');
INSERT INTO `t_tables` VALUES ('6', '1', '4', '1', '1');
INSERT INTO `t_tables` VALUES ('7', '1', '4', '1', '1');
INSERT INTO `t_tables` VALUES ('8', '1', '4', '1', '1');
INSERT INTO `t_tables` VALUES ('9', '1', '4', '1', '1');
INSERT INTO `t_tables` VALUES ('10', '2', '10', '1', '1');
INSERT INTO `t_tables` VALUES ('11', '2', '10', '1', '1');
INSERT INTO `t_tables` VALUES ('12', '2', '10', '1', '1');
INSERT INTO `t_tables` VALUES ('13', '3', '8', '1', '1');
INSERT INTO `t_tables` VALUES ('14', '3', '8', '1', '1');
INSERT INTO `t_tables` VALUES ('15', '3', '8', '1', '1');
INSERT INTO `t_tables` VALUES ('16', '4', '20', '1', '1');
INSERT INTO `t_tables` VALUES ('17', '4', '20', '1', '1');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(25) DEFAULT NULL,
  `password` varchar(18) DEFAULT NULL,
  `eid` int(11) DEFAULT NULL,
  `permission` varchar(255) DEFAULT NULL,
  `ustate` int(11) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'ceshizhanghao1', '123456', '1', '经理', '1');
INSERT INTO `t_user` VALUES ('2', 'ceshizhanghao2', '123456', '2', '服务员', '1');
INSERT INTO `t_user` VALUES ('3', 'ceshizhanghao4', '123456', '4', '厨师', '1');
INSERT INTO `t_user` VALUES ('4', 'ceshizhanghao7', '123456', '7', '采购员', '1');
INSERT INTO `t_user` VALUES ('5', 'ceshizhanghao3', '123456', '3', '服务员', '1');
INSERT INTO `t_user` VALUES ('6', 'ceshizhanghao5', '123456', '5', '厨师', '1');
INSERT INTO `t_user` VALUES ('7', 'ceshizhanghao6', '123456', '6', '厨师', '1');
