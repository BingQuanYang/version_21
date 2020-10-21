/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : orangelala

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2020-10-21 11:41:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `describe` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '甜品', '每一道甜品都有一个故事');
INSERT INTO `category` VALUES ('2', '坚果', '酥酥脆脆，回味无穷');
INSERT INTO `category` VALUES ('3', '水果', null);

-- ----------------------------
-- Table structure for change
-- ----------------------------
DROP TABLE IF EXISTS `change`;
CREATE TABLE `change` (
  `id` int(11) NOT NULL,
  `p_id` int(11) DEFAULT NULL,
  `img_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of change
-- ----------------------------
INSERT INTO `change` VALUES ('1', '1', '../images/tw1.jpg');
INSERT INTO `change` VALUES ('2', '1', '../images/tw2.jpg');
INSERT INTO `change` VALUES ('3', '1', '../images/tw3.jpg');
INSERT INTO `change` VALUES ('4', '1', '../images/tw4.jpg');
INSERT INTO `change` VALUES ('5', '1', '../images/tw5.jpg');
INSERT INTO `change` VALUES ('6', '1', '../images/tw6.jpg');
INSERT INTO `change` VALUES ('7', '1', '../images/tw7.jpg');

-- ----------------------------
-- Table structure for classification
-- ----------------------------
DROP TABLE IF EXISTS `classification`;
CREATE TABLE `classification` (
  `c_id` varchar(255) NOT NULL,
  `classification` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classification
-- ----------------------------
INSERT INTO `classification` VALUES ('10001', '点心/蛋糕', 'cake.png');
INSERT INTO `classification` VALUES ('10002', '饼干膨化', 'cookies.png');
INSERT INTO `classification` VALUES ('10003', '熟食/肉类', 'meat.png');
INSERT INTO `classification` VALUES ('10004', '素食/卤味', 'bamboo.png');
INSERT INTO `classification` VALUES ('10005', '坚果/炒货', 'nut.png');
INSERT INTO `classification` VALUES ('10006', '糖果/蜜饯', 'candy.png');
INSERT INTO `classification` VALUES ('10007', '巧克力', 'chocolate.png');
INSERT INTO `classification` VALUES ('10008', '海味/河鲜', 'fish.png');
INSERT INTO `classification` VALUES ('10009', '花茶/果茶', 'tea.png');
INSERT INTO `classification` VALUES ('10010', '品牌/礼包', 'package.png');
INSERT INTO `classification` VALUES ('10011', '男装/女装', 'cookies.png');
INSERT INTO `classification` VALUES ('10012', '男鞋/女鞋', 'meat.png');
INSERT INTO `classification` VALUES ('10013', '手机', 'bamboo.png');
INSERT INTO `classification` VALUES ('10014', '电脑/电脑配件', 'nut.png');
INSERT INTO `classification` VALUES ('10015', '家庭用品', 'candy.png');
INSERT INTO `classification` VALUES ('10016', '床上用品', 'chocolate.png');

-- ----------------------------
-- Table structure for details
-- ----------------------------
DROP TABLE IF EXISTS `details`;
CREATE TABLE `details` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `p_id` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `producing_area` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `area` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `burden_sheet` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `product_specifications` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `shelf_life` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ps_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `pl_number` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `storages` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `eat_method` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `image` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_delete` varchar(255) COLLATE utf8_unicode_ci DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of details
-- ----------------------------
INSERT INTO `details` VALUES ('1', '1', '烘烤类', '巴基斯坦', '湖北省武汉市', '进口松子、食用盐', '210g', '180天', 'GB/T 22165', 'QS4201', '请置于常温，干燥的地方', '开袋去壳食用', 'songzi.jpg', '1');
INSERT INTO `details` VALUES ('2', '3', '烘烤类', '巴基斯坦', '湖北省武汉市', '进口松子、食用盐', '210g', '180天', 'GB/T 22165', 'QS4201', '请置于常温，干燥的地方', '开袋去壳食用', 'songzi.jpg', '1');
INSERT INTO `details` VALUES ('3', '4', '烘烤类', '巴基斯坦', '湖北省武汉市', '进口松子、食用盐', '210g', '180天', 'GB/T 22165', 'QS4201', '请置于常温，干燥的地方', '开袋去壳食用', 'songzi.jpg', '1');

-- ----------------------------
-- Table structure for flavor
-- ----------------------------
DROP TABLE IF EXISTS `flavor`;
CREATE TABLE `flavor` (
  `id` varchar(255) NOT NULL,
  `flavor_name` varchar(255) DEFAULT NULL,
  `p_id` varchar(255) DEFAULT NULL,
  `is_available` int(255) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of flavor
-- ----------------------------

-- ----------------------------
-- Table structure for headlines
-- ----------------------------
DROP TABLE IF EXISTS `headlines`;
CREATE TABLE `headlines` (
  `h_id` varchar(255) DEFAULT NULL,
  `headlines` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of headlines
-- ----------------------------
INSERT INTO `headlines` VALUES ('1', '[特惠] 洋河年末大促，低至两件五折');
INSERT INTO `headlines` VALUES ('2', '[公告] 商城与广州市签署战略合作协议');
INSERT INTO `headlines` VALUES ('3', '[特惠] 衣服全场大促销，买三送一');
INSERT INTO `headlines` VALUES ('4', '[特惠] 家电狂欢千亿礼券 买1送1！');
INSERT INTO `headlines` VALUES ('5', '[公告] 华北、华中部分地区配送延迟');
INSERT INTO `headlines` VALUES ('6', '[公告] 与广州千峰签订协议，学员都送一件衣服');
INSERT INTO `headlines` VALUES ('7', '[公告] 今天的消费由张公子买单');
INSERT INTO `headlines` VALUES ('8', '[特惠] 女生节商城爆品1分秒');
INSERT INTO `headlines` VALUES ('9', '[公告] 商城快破产了，大促销了喂');

-- ----------------------------
-- Table structure for img
-- ----------------------------
DROP TABLE IF EXISTS `img`;
CREATE TABLE `img` (
  `id` int(11) DEFAULT NULL,
  `p_id` varchar(11) COLLATE utf8_unicode_ci DEFAULT NULL,
  `image` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_del` int(255) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of img
-- ----------------------------
INSERT INTO `img` VALUES ('1', '1', '../images/tw1.jpg', '0');
INSERT INTO `img` VALUES ('2', '1', '../images/tw2.jpg', '0');
INSERT INTO `img` VALUES ('3', '1', '../images/tw3.jpg', '0');
INSERT INTO `img` VALUES ('4', '1', '../images/tw4.jpg', '0');
INSERT INTO `img` VALUES ('5', '1', '../images/tw5.jpg', '0');
INSERT INTO `img` VALUES ('6', '1', '../images/tw6.jpg', '0');
INSERT INTO `img` VALUES ('7', '1', '../images/tw7.jpg', '0');

-- ----------------------------
-- Table structure for information
-- ----------------------------
DROP TABLE IF EXISTS `information`;
CREATE TABLE `information` (
  `id` varchar(255) NOT NULL,
  `image` varchar(255) DEFAULT NULL,
  `p_id` int(11) DEFAULT NULL,
  `shop_discount` varchar(255) DEFAULT NULL,
  `promotiom_price` double(10,0) DEFAULT NULL,
  `original_price` double(10,0) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `c_id` varchar(255) DEFAULT NULL,
  `freight` varchar(255) DEFAULT NULL,
  `monthly_sales` varchar(255) DEFAULT NULL,
  `cumulative_sales` varchar(255) DEFAULT NULL,
  `cumulative_evaluation` varchar(255) DEFAULT NULL,
  `stock` varchar(255) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of information
-- ----------------------------
INSERT INTO `information` VALUES ('1', '01.jpg', '1', '良品铺子 手剥松子218g 坚果炒货 巴西松子', '56', '98', '浙江省温州市瑞安区', null, '10', '1050', '6015', '640', '1000');
INSERT INTO `information` VALUES ('10', 'tianpin04.jpg', '1', '美味甜品', '9', '15', null, '1', null, null, null, null, '');
INSERT INTO `information` VALUES ('11', 'tianpin05.jpg', '1', '草莓蛋糕', '6', '15', null, '1', null, null, null, null, '');
INSERT INTO `information` VALUES ('12', 'makalong.jpg', '1', '马卡龙', '10', '15', null, '1', null, null, null, null, '');
INSERT INTO `information` VALUES ('13', 'tianpin06.jpg', '1', 'fjjfjfj', '9', '9', null, '2', null, null, null, null, '');
INSERT INTO `information` VALUES ('2', '03.jpg', '1', '良品铺子 手剥松子218g 坚果炒货 巴西松子', '56', '98', '浙江省温州市瑞安区', null, '10', '1050', '6015', '640', '1000');
INSERT INTO `information` VALUES ('3', 'sale2.jpg', '1', '清风 原木纯品', '9', '9', null, null, null, null, null, null, null);
INSERT INTO `information` VALUES ('4', 'sale3.jpg', '1', 'NIGHT DIVE', '9', '9', null, null, null, null, null, null, null);
INSERT INTO `information` VALUES ('5', 'sale1.jpg', '1', '红色 葡萄干', '9', '9', null, null, null, null, null, null, null);
INSERT INTO `information` VALUES ('6', 'sale4.png', '1', '夏威夷果', '9', '9', null, null, null, null, null, null, null);
INSERT INTO `information` VALUES ('7', 'tianpin01.jpg', '1', '可爱蛋糕', '11', '15', null, '1', null, null, null, null, '');
INSERT INTO `information` VALUES ('8', 'tianpin02.jpg', '1', '京博甜甜圈', '12', '15', null, '1', null, null, null, null, '');
INSERT INTO `information` VALUES ('9', 'tianpin03.jpg', '1', '雪人蛋糕', '8', '15', null, '1', null, null, null, null, '');

-- ----------------------------
-- Table structure for seckill
-- ----------------------------
DROP TABLE IF EXISTS `seckill`;
CREATE TABLE `seckill` (
  `id` varchar(255) NOT NULL,
  `p_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seckill
-- ----------------------------
INSERT INTO `seckill` VALUES ('1', '3');
INSERT INTO `seckill` VALUES ('2', '4');
INSERT INTO `seckill` VALUES ('3', '5');
INSERT INTO `seckill` VALUES ('4', '6');

-- ----------------------------
-- Table structure for shopping_cart
-- ----------------------------
DROP TABLE IF EXISTS `shopping_cart`;
CREATE TABLE `shopping_cart` (
  `id` varchar(255) NOT NULL,
  `p_id` varchar(255) DEFAULT NULL,
  `unit_price` varchar(10) DEFAULT NULL,
  `number` varchar(11) DEFAULT NULL,
  `u_id` int(11) DEFAULT NULL,
  `is_available` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shopping_cart
-- ----------------------------
INSERT INTO `shopping_cart` VALUES ('1', '3', '9.00', '2', '1', '1');
INSERT INTO `shopping_cart` VALUES ('2', '4', '9.00', '3', '1', '1');
INSERT INTO `shopping_cart` VALUES ('3', '5', '9.00', '1', '2', '1');
INSERT INTO `shopping_cart` VALUES ('6', '6', '9.9', '2', '2', '0');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` varchar(255) NOT NULL,
  `nick_name` varchar(64) DEFAULT NULL,
  `username` varchar(64) DEFAULT NULL,
  `sex` varchar(6) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `telephone_number` varchar(11) DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `login_password` varchar(64) DEFAULT NULL,
  `id_number` varchar(18) DEFAULT NULL,
  `is_available` int(11) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zzh', '渣渣辉', '男', '2020-10-01', '19877989772', '2606211206@qq.com', '123456', '', '1');
