/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : jd

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 13/11/2019 19:41:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goodsinfo
-- ----------------------------
DROP TABLE IF EXISTS `goodsinfo`;
CREATE TABLE `goodsinfo`  (
  `id` bigint(15) NOT NULL,
  `name` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `price` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `goods_url` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goodsinfo
-- ----------------------------
INSERT INTO `goodsinfo` VALUES (3581605, '蓝月亮洗衣液10.32斤套装：薰衣草2kg*2+预涂手洗500g*2+旅行装80g*2', '81.8', 'https//item.jd.com/3581605.html');
INSERT INTO `goodsinfo` VALUES (6027746, '小米10000毫安 新移动电源2 /充电宝 双向快充 超薄小巧便携 银色（新版）', '69', 'https//item.jd.com/6027746.html');
INSERT INTO `goodsinfo` VALUES (33259216478, '小米（MI） 小米手环4nfc4代彩屏心率健康睡眠监测智能支付手环男女防水运动手表3计步器来电提醒 小米手环4', '159', 'https//item.jd.com/33259216478.html');
INSERT INTO `goodsinfo` VALUES (56659136511, '海信（Hisense）H55E3A-Y 55英寸4K超高清超薄 HDR 智能语音遥控 液晶海信电视机', '1989', 'https//item.jd.com/56659136511.html');
INSERT INTO `goodsinfo` VALUES (100001364160, '荣耀V20 游戏手机 麒麟980芯片 魅眼全视屏 4800万深感相机 6GB+128GB 魅海蓝 移动联通电信4G全面屏手机', '1699', 'https//item.jd.com/100001364160.html');
INSERT INTO `goodsinfo` VALUES (100002019841, 'Redmi Note7 4800万双摄千元机 满血骁龙660 4000mAh超长续航 6GB+64GB 梦幻蓝 游戏智能手机 小米 红米', '899', 'https//item.jd.com/100002019841.html');
INSERT INTO `goodsinfo` VALUES (100002852986, 'Redmi Note7 4800万双摄千元机 满血骁龙660 18个月超长质保 4000mAh超长续航 6GB+64GB 暮光金 游戏智能手机 小米 红米', '899', 'https//item.jd.com/100002852986.html');
INSERT INTO `goodsinfo` VALUES (100002852988, 'Redmi Note7 4800万双摄千元机 满血骁龙660 18个月超长质保 4000mAh超长续航 6GB+64GB 亮黑色 游戏智能手机 小米 红米', '899', 'https//item.jd.com/100002852988.html');
INSERT INTO `goodsinfo` VALUES (100005787062, 'vivo Z5x 6GB+64GB 极光色 极点屏手机  5000mAh大电池 三摄拍照手机 移动联通电信全网通4G手机', '998', 'https//item.jd.com/100005787062.html');
INSERT INTO `goodsinfo` VALUES (100006841310, 'Redmi Note7 4800万双摄千元机 满血骁龙660 18个月超长质保 4000mAh超长续航 6GB+64GB 镜花水月 游戏智能手机 小米 红米', '899', 'https//item.jd.com/100006841310.html');
INSERT INTO `goodsinfo` VALUES (100008492910, 'HUAWEI WATCH GT2 (46mm)砂砾棕 华为智能手表（两周续航+高清彩屏+蓝牙通话+麒麟芯片+心脏健康监测）', '1588', 'https//item.jd.com/100008492910.html');
INSERT INTO `goodsinfo` VALUES (100009327646, '三星 Galaxy A20s （SM-A2070）复古黑 4GB+64GB 后置三摄 超长续航 6.5英寸 绚丽V视屏手机', '0', 'https//item.jd.com/100009327646.html');

-- ----------------------------
-- Table structure for ordergoods
-- ----------------------------
DROP TABLE IF EXISTS `ordergoods`;
CREATE TABLE `ordergoods`  (
  `order_id` bigint(15) NOT NULL,
  `goods_id` bigint(15) NOT NULL,
  `num` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`, `goods_id`) USING BTREE,
  INDEX `goods_id`(`goods_id`) USING BTREE,
  CONSTRAINT `ordergoods_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `orderinfo` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `ordergoods_ibfk_2` FOREIGN KEY (`goods_id`) REFERENCES `goodsinfo` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of ordergoods
-- ----------------------------
INSERT INTO `ordergoods` VALUES (105876312995, 100009327646, 3);
INSERT INTO `ordergoods` VALUES (106016953902, 100008492910, 2);
INSERT INTO `ordergoods` VALUES (106028662757, 6027746, 13);
INSERT INTO `ordergoods` VALUES (106047099339, 33259216478, 5);
INSERT INTO `ordergoods` VALUES (106050224807, 100002852986, 1);
INSERT INTO `ordergoods` VALUES (106050224807, 100006841310, 1);
INSERT INTO `ordergoods` VALUES (106133684783, 100005787062, 1);
INSERT INTO `ordergoods` VALUES (106133740462, 100005787062, 1);
INSERT INTO `ordergoods` VALUES (106148484463, 100001364160, 1);
INSERT INTO `ordergoods` VALUES (106675546583, 100002019841, 1);
INSERT INTO `ordergoods` VALUES (106675546583, 100002852988, 1);
INSERT INTO `ordergoods` VALUES (106739481008, 56659136511, 1);
INSERT INTO `ordergoods` VALUES (106755807929, 100005787062, 1);
INSERT INTO `ordergoods` VALUES (106760393461, 3581605, 4);

-- ----------------------------
-- Table structure for orderinfo
-- ----------------------------
DROP TABLE IF EXISTS `orderinfo`;
CREATE TABLE `orderinfo`  (
  `id` bigint(15) NOT NULL,
  `carriage_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `carriage_url` mediumtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `carrier` mediumtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `date` datetime(0) NULL DEFAULT NULL,
  `price` float NULL DEFAULT NULL,
  `receiver_address` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `receiver_name` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `receiver_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_url` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `status` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `uid` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `registration` tinyint(1) NULL DEFAULT 0,
  `settlement_price` float NULL DEFAULT 0,
  `pay_way` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orderinfo
-- ----------------------------
INSERT INTO `orderinfo` VALUES (105876312995, '105876312995', 'www.jdwl.com', '京东快递', '2019-11-07 12:24:17', 0, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=105876312995&PassKey=8EC9D70C0B6C770EF021D5DDBB361197', '等待收货', '自己的大号', 1, 0, '在线支付');
INSERT INTO `orderinfo` VALUES (106016953902, '106016953902', 'www.jdwl.com', '京东快递', '2019-11-11 00:02:44', 3176, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106016953902&PassKey=43EDA45C54A73994B6CA7CEA96194FA1', '完成', '自己的大号', 1, 0, '在线支付');
INSERT INTO `orderinfo` VALUES (106028662757, 'JD0005519642318', 'www.jdwl.com', '京东快递', '2019-11-11 00:20:32', 794.23, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106028662757&PassKey=6A468319C32B3D6FDAD22FEAE0DB7287', '完成', '自己的大号', 1, 0, '在线支付');
INSERT INTO `orderinfo` VALUES (106047099339, 'YT4209495061923', 'www.yto.net.cn', '圆通快递', '2019-11-11 01:35:54', 695, '浙江杭州市下城区拱墅区大关南七苑18幢305室A247', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106047099339&PassKey=66F882488A00781D298534D2D44BAF06', '等待收货', '自己的大号', 1, 0, '在线支付');
INSERT INTO `orderinfo` VALUES (106050224807, '', '', '', '2019-11-11 01:46:48', 1697.2, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106050224807&PassKey=D6C96842F4F5BC3547770EB4A14B9CBC', '付款成功', '自己的大号', 0, 0, '在线支付');
INSERT INTO `orderinfo` VALUES (106133684783, '106133684783', 'www.jdwl.com', '京东快递', '2019-11-11 20:08:43', 898, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106133684783&PassKey=22B0F9C355C307CA62B196C560854498', '完成', '自己的大号', 1, 0, '在线支付');
INSERT INTO `orderinfo` VALUES (106133740462, '106133740462', 'www.jdwl.com', '京东快递', '2019-11-11 20:07:56', 897.98, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106133740462&PassKey=FD624A229147BBA5844804DC549444E0', '完成', '自己的大号', 1, 0, '在线支付');
INSERT INTO `orderinfo` VALUES (106148484463, '106148484463', 'www.jdwl.com', '京东快递', '2019-11-11 22:11:59', 1049, '福建福州市鼓楼区城区五四路137号信和广场4层17173 MEDIA GROUP', '刘乐', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106148484463&PassKey=BB7B37962E1F07562A5283F48F9578C0', '商品出库', '自己的大号', 0, 0, '在线支付');
INSERT INTO `orderinfo` VALUES (106675546583, '106675546583', 'www.jdwl.com', '京东快递', '2019-11-11 01:39:23', 1698, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106675546583&PassKey=7D00213A9A0E81F10355D8088B163E91', '完成', '自己的大号', 1, 0, '在线支付');
INSERT INTO `orderinfo` VALUES (106739481008, '', '', '', '2019-11-11 16:00:42', 1307, '安徽蚌埠市五河县城区沱湖路与青年路交叉口西150米吉祥门业', '刘乐', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106739481008&PassKey=3DB81C0EADD90EC2B03F73BF6FE22500', '正在出库', '自己的大号', 0, 0, '在线支付');
INSERT INTO `orderinfo` VALUES (106755807929, '106755807929', 'www.jdwl.com', '京东快递', '2019-11-11 20:08:17', 898, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106755807929&PassKey=7B60C3D8E9C496B6DA1D63D2042FD54D', '完成', '自己的大号', 1, 0, '在线支付');
INSERT INTO `orderinfo` VALUES (106760393461, '106760393461', 'www.jdwl.com', '京东快递', '2019-11-11 20:05:12', 99.96, '浙江温州市乐清市柳市镇白石镇下阮村双狮桥35号卖菜处', '张成云', '135****3996', 'https://details.jd.com/normal/item.action?orderid=106760393461&PassKey=13EFA25458C9242FA6E20390A24D3F74', '完成', '自己的大号', 0, 0, '在线支付');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL,
  `nickname` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `realname` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_level` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
