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

 Date: 14/11/2019 18:37:15
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
INSERT INTO `goodsinfo` VALUES (1241849, '维达(Vinda) 卷纸 蓝色经典4层140g卫生纸巾*27卷（整箱销售）', '53.9', 'https//item.jd.com/1241849.html');
INSERT INTO `goodsinfo` VALUES (1883300, '雅培(Abbott)经典恩美力幼儿配方奶粉3段950克（原雅培亲体金装喜康力）', '127', 'https//item.jd.com/1883300.html');
INSERT INTO `goodsinfo` VALUES (2828950, '维达(Vinda) 抽纸 超韧3层130抽软抽*24包纸巾(小规格) 整箱销售（新旧产品随机发货）', '59.9', 'https//item.jd.com/2828950.html');
INSERT INTO `goodsinfo` VALUES (3581605, '蓝月亮洗衣液10.32斤套装：薰衣草2kg*2+预涂手洗500g*2+旅行装80g*2', '81.8', 'https//item.jd.com/3581605.html');
INSERT INTO `goodsinfo` VALUES (4575664, '可柔可顺 清怡樱花衣物护理剂 柔顺剂套装 液体黄金软纺留香30天（2kg×2+50g×4)与洗衣液搭配使用', '32.8', 'https//item.jd.com/4575664.html');
INSERT INTO `goodsinfo` VALUES (6027746, '小米10000毫安 新移动电源2 /充电宝 双向快充 超薄小巧便携 银色（新版）', '69', 'https//item.jd.com/6027746.html');
INSERT INTO `goodsinfo` VALUES (33259216478, '小米（MI） 小米手环4nfc4代彩屏心率健康睡眠监测智能支付手环男女防水运动手表3计步器来电提醒 小米手环4', '159', 'https//item.jd.com/33259216478.html');
INSERT INTO `goodsinfo` VALUES (50660746603, '贝因美童享系列奶粉儿童配方奶粉（3~6周岁）4段奶粉400g*4盒装1600克 1盒（四联包）', '210', 'https//item.jd.com/50660746603.html');
INSERT INTO `goodsinfo` VALUES (56659136511, '海信（Hisense）H55E3A-Y 55英寸4K超高清超薄 HDR 智能语音遥控 液晶海信电视机', '1989', 'https//item.jd.com/56659136511.html');
INSERT INTO `goodsinfo` VALUES (100000499657, '三只松鼠每日坚果大礼包 孕妇零食节日礼物送女友混合干果礼盒榛子腰果巴旦木葡萄干核桃仁开心果 750g/30袋', '129', 'https//item.jd.com/100000499657.html');
INSERT INTO `goodsinfo` VALUES (100001364160, '荣耀V20 游戏手机 麒麟980芯片 魅眼全视屏 4800万深感相机 6GB+128GB 魅海蓝 移动联通电信4G全面屏手机', '1699', 'https//item.jd.com/100001364160.html');
INSERT INTO `goodsinfo` VALUES (100002019841, 'Redmi Note7 4800万双摄千元机 满血骁龙660 4000mAh超长续航 6GB+64GB 梦幻蓝 游戏智能手机 小米 红米', '899', 'https//item.jd.com/100002019841.html');
INSERT INTO `goodsinfo` VALUES (100002346150, '乐高(LEGO)积木 机械组Technic雪佛兰 Corvette ZR1 跑车9岁+ 42093 玩具 男孩女孩生日礼物 1月上新', '339', 'https//item.jd.com/100002346150.html');
INSERT INTO `goodsinfo` VALUES (100002544828, '荣耀V20 游戏手机 麒麟980芯片 魅眼全视屏 4800万深感相机 6GB+128GB 幻夜黑 移动联通电信4G', '1699', 'https//item.jd.com/100002544828.html');
INSERT INTO `goodsinfo` VALUES (100002852986, 'Redmi Note7 4800万双摄千元机 满血骁龙660 18个月超长质保 4000mAh超长续航 6GB+64GB 暮光金 游戏智能手机 小米 红米', '899', 'https//item.jd.com/100002852986.html');
INSERT INTO `goodsinfo` VALUES (100002852988, 'Redmi Note7 4800万双摄千元机 满血骁龙660 18个月超长质保 4000mAh超长续航 6GB+64GB 亮黑色 游戏智能手机 小米 红米', '899', 'https//item.jd.com/100002852988.html');
INSERT INTO `goodsinfo` VALUES (100003060627, '【超级爆品】荣耀20i 3200万AI自拍 超广角三摄 全网通版6GB+64GB 渐变蓝 移动联通电信4G全面屏手机', '1099', 'https//item.jd.com/100003060627.html');
INSERT INTO `goodsinfo` VALUES (100003188028, '乐高(LEGO)积木 超级赛车2018道奇挑战者SRT Demon和1970道奇战马R/T赛车7岁+ 75893  儿童玩具 男孩女孩', '379', 'https//item.jd.com/100003188028.html');
INSERT INTO `goodsinfo` VALUES (100003884767, '小米CC9e 索尼4800万旗舰相机 3200万美颜自拍 4030mAh 屏幕指纹 白色恋人 6GB+64GB 游戏智能拍照手机', '999', 'https//item.jd.com/100003884767.html');
INSERT INTO `goodsinfo` VALUES (100003913959, 'vivo Z5x 6GB+64GB 幻彩粉 极点屏手机 5000mAh大电池 三摄拍照手机 移动联通电信全网通4G手机', '998', 'https//item.jd.com/100003913959.html');
INSERT INTO `goodsinfo` VALUES (100005787062, 'vivo Z5x 6GB+64GB 极光色 极点屏手机  5000mAh大电池 三摄拍照手机 移动联通电信全网通4G手机', '998', 'https//item.jd.com/100005787062.html');
INSERT INTO `goodsinfo` VALUES (100005787064, 'vivo Z5x 6GB+64GB 极夜黑 极点屏手机  5000mAh大电池 三摄拍照手机 移动联通电信全网通4G手机', '998', 'https//item.jd.com/100005787064.html');
INSERT INTO `goodsinfo` VALUES (100006583672, '小米CC9e 索尼4800万旗舰相机 3200万美颜自拍 4030mAh 屏幕指纹 暗夜王子 6GB+64GB 游戏智能拍照手机', '999', 'https//item.jd.com/100006583672.html');
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
INSERT INTO `ordergoods` VALUES (105662442657, 50660746603, 3);
INSERT INTO `ordergoods` VALUES (105717213931, 1883300, 8);
INSERT INTO `ordergoods` VALUES (105876312995, 100009327646, 3);
INSERT INTO `ordergoods` VALUES (106016953902, 100008492910, 2);
INSERT INTO `ordergoods` VALUES (106026549668, 6027746, 28);
INSERT INTO `ordergoods` VALUES (106026862982, 6027746, 13);
INSERT INTO `ordergoods` VALUES (106028662757, 6027746, 13);
INSERT INTO `ordergoods` VALUES (106047099339, 33259216478, 5);
INSERT INTO `ordergoods` VALUES (106050028743, 100002852986, 1);
INSERT INTO `ordergoods` VALUES (106050028743, 100006841310, 1);
INSERT INTO `ordergoods` VALUES (106050187567, 100002852986, 1);
INSERT INTO `ordergoods` VALUES (106050187567, 100006841310, 1);
INSERT INTO `ordergoods` VALUES (106050224807, 100002852986, 1);
INSERT INTO `ordergoods` VALUES (106050224807, 100006841310, 1);
INSERT INTO `ordergoods` VALUES (106050862501, 100002019841, 1);
INSERT INTO `ordergoods` VALUES (106050862501, 100002852988, 1);
INSERT INTO `ordergoods` VALUES (106121308523, 1241849, 2);
INSERT INTO `ordergoods` VALUES (106125113412, 2828950, 2);
INSERT INTO `ordergoods` VALUES (106132831177, 100005787064, 1);
INSERT INTO `ordergoods` VALUES (106133684783, 100005787062, 1);
INSERT INTO `ordergoods` VALUES (106133740462, 100005787062, 1);
INSERT INTO `ordergoods` VALUES (106134308807, 100005787064, 1);
INSERT INTO `ordergoods` VALUES (106148484463, 100001364160, 1);
INSERT INTO `ordergoods` VALUES (106189777289, 4575664, 1);
INSERT INTO `ordergoods` VALUES (106645433497, 6027746, 28);
INSERT INTO `ordergoods` VALUES (106647094355, 100000499657, 1);
INSERT INTO `ordergoods` VALUES (106653780029, 6027746, 28);
INSERT INTO `ordergoods` VALUES (106660889147, 100002346150, 1);
INSERT INTO `ordergoods` VALUES (106660889147, 100003188028, 1);
INSERT INTO `ordergoods` VALUES (106662694939, 100002852986, 1);
INSERT INTO `ordergoods` VALUES (106662694939, 100006841310, 1);
INSERT INTO `ordergoods` VALUES (106673580562, 100002019841, 1);
INSERT INTO `ordergoods` VALUES (106673580562, 100002852988, 1);
INSERT INTO `ordergoods` VALUES (106675546583, 100002019841, 1);
INSERT INTO `ordergoods` VALUES (106675546583, 100002852988, 1);
INSERT INTO `ordergoods` VALUES (106675890517, 100002019841, 1);
INSERT INTO `ordergoods` VALUES (106675890517, 100002852988, 1);
INSERT INTO `ordergoods` VALUES (106717851826, 100006583672, 1);
INSERT INTO `ordergoods` VALUES (106720308820, 100003884767, 1);
INSERT INTO `ordergoods` VALUES (106735512281, 56659136511, 1);
INSERT INTO `ordergoods` VALUES (106739481008, 56659136511, 1);
INSERT INTO `ordergoods` VALUES (106739534108, 100003060627, 10);
INSERT INTO `ordergoods` VALUES (106739979954, 100003884767, 1);
INSERT INTO `ordergoods` VALUES (106741186492, 56659136511, 1);
INSERT INTO `ordergoods` VALUES (106755807929, 100005787062, 1);
INSERT INTO `ordergoods` VALUES (106760218608, 100005787064, 1);
INSERT INTO `ordergoods` VALUES (106760393461, 3581605, 4);
INSERT INTO `ordergoods` VALUES (106762952860, 100003913959, 1);
INSERT INTO `ordergoods` VALUES (106763691069, 100005787064, 1);
INSERT INTO `ordergoods` VALUES (106785092435, 100001364160, 5);
INSERT INTO `ordergoods` VALUES (106785092435, 100002544828, 5);
INSERT INTO `ordergoods` VALUES (106794970618, 100001364160, 5);
INSERT INTO `ordergoods` VALUES (106794970618, 100002544828, 5);
INSERT INTO `ordergoods` VALUES (106873227728, 100006841310, 1);
INSERT INTO `ordergoods` VALUES (106876652253, 100002852986, 1);

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
  `platform` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orderinfo
-- ----------------------------
INSERT INTO `orderinfo` VALUES (105662442657, 'JD0004987739280', 'www.jdwl.com', '京东快递', '2019-11-01 23:13:10', 409.99, '江苏无锡市惠山区洛社镇杨市新华书店二楼优丫漫绘本馆', '刘欢', '138****9375', 'https://details.jd.com/normal/item.action?orderid=105662442657&PassKey=2202C7380EEEF83F472744E360182CF7', '完成', '京东老姐的号', 0, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (105717213931, '105717213931', 'www.jdwl.com', '京东快递', '2019-11-03 00:36:22', 816, '福建福州市闽清县金沙镇金州街小卖部', '欧阳乐', '130****7258', 'https://details.jd.com/normal/item.action?orderid=105717213931&PassKey=ED4A0C563F42B1B6076DAF8CCFF0485F', '完成', '京东老爸的号', 0, 0, '货到付款', '京东');
INSERT INTO `orderinfo` VALUES (105876312995, '105876312995', 'www.jdwl.com', '京东快递', '2019-11-07 12:24:17', 0, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=105876312995&PassKey=8EC9D70C0B6C770EF021D5DDBB361197', '完成', '自己的大号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106016953902, '106016953902', 'www.jdwl.com', '京东快递', '2019-11-11 00:02:44', 3176, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106016953902&PassKey=43EDA45C54A73994B6CA7CEA96194FA1', '完成', '自己的大号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106026549668, 'JD0005504905420', 'www.jdwl.com', '京东快递', '2019-11-11 00:15:27', 1732, '浙江杭州市下城区拱墅区东新关小区11幢1单元A247室', '白鹿原', '130****7259', 'https://details.jd.com/normal/item.action?orderid=106026549668&PassKey=C4FD44853950F84D837989E4E63D265B', '完成', '京东自己的小号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106026862982, 'JD0005519429187', 'www.jdwl.com', '京东快递', '2019-11-11 00:17:38', 795, '浙江杭州市上城区拱墅区东新关小区11幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106026862982&PassKey=F4FCA1FAF01A7DED2E0E10297932589D', '完成', '京东老姐的号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106028662757, 'JD0005519642318', 'www.jdwl.com', '京东快递', '2019-11-11 00:20:32', 794.23, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106028662757&PassKey=6A468319C32B3D6FDAD22FEAE0DB7287', '完成', '自己的大号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106047099339, 'YT4209495061923', 'www.yto.net.cn', '圆通快递', '2019-11-11 01:35:54', 695, '浙江杭州市下城区拱墅区大关南七苑18幢305室A247', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106047099339&PassKey=66F882488A00781D298534D2D44BAF06', '等待收货', '自己的大号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106050028743, '106050028743', 'www.jdwl.com', '京东快递', '2019-11-11 01:45:27', 1698, '浙江杭州市上城区拱墅区东新关小区11幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106050028743&PassKey=4D7EE5155AEBBF3232404F8A0A571BF0', '完成', '京东老姐的号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106050187567, '', '', '', '2019-11-11 01:47:13', 1698, '浙江杭州市下城区拱墅区东新关小区18幢1单元A247号', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106050187567&PassKey=A2DA3F6BE2E70EE6A6A036AA46B145E6', '付款成功', '京东老爸的号', 0, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106050224807, '', '', '', '2019-11-11 01:46:48', 1697.2, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106050224807&PassKey=D6C96842F4F5BC3547770EB4A14B9CBC', '付款成功', '自己的大号', 0, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106050862501, '106050862501', 'www.jdwl.com', '京东快递', '2019-11-11 01:39:37', 1698, '浙江杭州市下城区拱墅区东新关小区18幢1单元A247号', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106050862501&PassKey=DC678A15FE9C2179EA6BF0E7BE470388', '完成', '京东老爸的号', 1, 0, '货到付款', '京东');
INSERT INTO `orderinfo` VALUES (106121308523, 'JD0005787747984', 'www.jdwl.com', '京东快递', '2019-11-11 18:00:40', 60.85, '浙江温州市乐清市北白象镇白石镇下阮村双狮桥35号卖菜处', '张成云', '135****3996', 'https://details.jd.com/normal/item.action?orderid=106121308523&PassKey=99CAC0DA25A6A6A9DBC79A2DCD9D797B', '商品出库', '京东老姐的号', 0, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106125113412, '', '', '', '2019-11-11 18:02:39', 39.85, '浙江温州市乐清市北白象镇白石镇下阮村双狮桥35号卖菜处', '张成云', '135****3996', 'https://details.jd.com/normal/item.action?orderid=106125113412&PassKey=C8AA331DFA29C3117FF783B1076D678A', '付款成功', '京东自己的小号', 0, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106132831177, '106132831177', 'www.jdwl.com', '京东快递', '2019-11-11 20:12:10', 898, '浙江杭州市上城区拱墅区东新关小区11幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106132831177&PassKey=5CB1BF60F26013A5B98F4AEA53EF9B1A', '完成', '京东老姐的号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106133684783, '106133684783', 'www.jdwl.com', '京东快递', '2019-11-11 20:08:43', 898, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106133684783&PassKey=22B0F9C355C307CA62B196C560854498', '完成', '自己的大号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106133740462, '106133740462', 'www.jdwl.com', '京东快递', '2019-11-11 20:07:56', 897.98, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106133740462&PassKey=FD624A229147BBA5844804DC549444E0', '完成', '自己的大号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106134308807, '106134308807', 'www.jdwl.com', '京东快递', '2019-11-11 20:13:55', 898, '浙江杭州市上城区拱墅区东新关小区11幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106134308807&PassKey=431F63C4275FFDA44B5FFB77AF87FFE5', '完成', '京东老姐的号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106148484463, '106148484463', 'www.jdwl.com', '京东快递', '2019-11-11 22:11:59', 1049, '福建福州市鼓楼区城区五四路137号信和广场4层17173 MEDIA GROUP', '刘乐', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106148484463&PassKey=BB7B37962E1F07562A5283F48F9578C0', '商品出库', '自己的大号', 0, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106189777289, '106189777289', 'www.jdwl.com', '京东快递', '2019-11-12 13:42:56', 32.8, '江苏无锡市惠山区洛社镇杨市新华书店二楼优丫漫绘本馆', '刘欢', '138****9375', 'https://details.jd.com/normal/item.action?orderid=106189777289&PassKey=5A941AABB6BBE5A65F7493BD5E213AD6', '商品出库', '京东老姐的号', 0, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106645433497, 'JD0005523253774', 'www.jdwl.com', '京东快递', '2019-11-11 00:14:08', 1732, '浙江杭州市下城区拱墅区东新关小区18幢1单元A247号', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106645433497&PassKey=C462ECC52FF6240CC58792BB63AA4A40', '完成', '京东老爸的号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106647094355, 'JD0005504304959', 'www.jdwl.com', '京东快递', '2019-11-11 00:09:42', 64, '福建福州市鼓楼区城区屏东路57号屏东中学教师宿舍', '刘乐', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106647094355&PassKey=66E001149A04606831F215DD10252659', '完成', '京东自己的小号', 0, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106653780029, 'JD0005508215575', 'www.jdwl.com', '京东快递', '2019-11-11 00:16:06', 1729, '浙江杭州市上城区拱墅区东新关小区11幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106653780029&PassKey=635808926FFFF557ED748D2712917C02', '完成', '京东老姐的号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106660889147, '106660889147', 'www.jdwl.com', '京东快递', '2019-11-11 01:32:39', 438, '江苏无锡市惠山区洛社镇杨市园大街新华书店二楼优丫漫绘本馆，刘欢欢收', '刘欢欢', '138****6375', 'https://details.jd.com/normal/item.action?orderid=106660889147&PassKey=FBFF0A9E63CAF789191745D119B377B2', '等待收货', '京东老爸的号', 0, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106662694939, '', '', '', '2019-11-11 01:48:42', 1698, '浙江杭州市下城区拱墅区东新关小区11幢1单元A247室', '白鹿原', '130****7259', 'https://details.jd.com/normal/item.action?orderid=106662694939&PassKey=3A0F93846A906920972C81CB27A59C82', '付款成功', '京东自己的小号', 0, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106673580562, '106673580562', 'www.jdwl.com', '京东快递', '2019-11-11 01:41:48', 1698, '浙江杭州市下城区拱墅区东新关小区11幢1单元A247室', '白鹿原', '130****7259', 'https://details.jd.com/normal/item.action?orderid=106673580562&PassKey=2262CB669D706F43F0E894022A02CEF7', '完成', '京东自己的小号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106675546583, '106675546583', 'www.jdwl.com', '京东快递', '2019-11-11 01:39:23', 1698, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106675546583&PassKey=7D00213A9A0E81F10355D8088B163E91', '完成', '自己的大号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106675890517, '106675890517', 'www.jdwl.com', '京东快递', '2019-11-11 01:42:37', 1698, '浙江杭州市上城区拱墅区东新关小区11幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106675890517&PassKey=44216CF00C5BE0F6A07325E123F4B5B4', '完成', '京东老姐的号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106717851826, '106717851826', 'www.jdwl.com', '京东快递', '2019-11-11 12:32:17', 899, '浙江杭州市下城区拱墅区东新关小区11幢1单元A247室', '白鹿原', '130****7259', 'https://details.jd.com/normal/item.action?orderid=106717851826&PassKey=060D58220E4A4B03CCFFA67EF33A4A09', '完成', '京东自己的小号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106720308820, '106720308820', 'www.jdwl.com', '京东快递', '2019-11-11 12:28:46', 899, '浙江杭州市下城区拱墅区东新关小区18幢1单元A247号', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106720308820&PassKey=5154D410C681063991756E66304D1396', '完成', '京东老爸的号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106735512281, '', '', '', '2019-11-11 15:58:56', 1307, '安徽蚌埠市五河县城区安徽省蚌埠市五河县G104（环城北路）城北氧气乙炔服务站', '刘乐', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106735512281&PassKey=D84AFB4BDD71D107308455DB5E215CA2', '正在出库', '京东自己的小号', 0, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106739481008, '', '', '', '2019-11-11 16:00:42', 1307, '安徽蚌埠市五河县城区沱湖路与青年路交叉口西150米吉祥门业', '刘乐', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106739481008&PassKey=3DB81C0EADD90EC2B03F73BF6FE22500', '正在出库', '自己的大号', 0, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106739534108, '106739534108', NULL, '杭州石桥营业部', '2019-11-11 15:33:03', 8990, '浙江杭州市下城区拱墅区东新关小区18幢1单元A247号', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106739534108&PassKey=AA4164472B01B864DEB6FBA645431CB5', '完成', '京东老爸的号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106739979954, '106739979954', 'www.jdwl.com', '京东快递', '2019-11-11 16:17:53', 894, '浙江杭州市上城区拱墅区东新关小区11幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106739979954&PassKey=8880B27D6680C7BC3AEC0E614A3A6199', '完成', '京东老姐的号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106741186492, '', '', '', '2019-11-11 15:53:32', 1327, '安徽蚌埠市五河县申集镇安徽省蚌埠市五河县中兴路与环城北路交叉口南50米城北幼儿园', '刘乐', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106741186492&PassKey=D573FA0DB2FDBE8DE3AEB5A69FDAE15C', '正在出库', '京东老爸的号', 0, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106755807929, '106755807929', 'www.jdwl.com', '京东快递', '2019-11-11 20:08:17', 898, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106755807929&PassKey=7B60C3D8E9C496B6DA1D63D2042FD54D', '完成', '自己的大号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106760218608, '106760218608', 'www.jdwl.com', '京东快递', '2019-11-11 20:13:29', 898, '浙江杭州市上城区拱墅区东新关小区11幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106760218608&PassKey=7696E38EB146BBFFEE64D32095C6C068', '完成', '京东老姐的号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106760393461, '106760393461', 'www.jdwl.com', '京东快递', '2019-11-11 20:05:12', 99.96, '浙江温州市乐清市柳市镇白石镇下阮村双狮桥35号卖菜处', '张成云', '135****3996', 'https://details.jd.com/normal/item.action?orderid=106760393461&PassKey=13EFA25458C9242FA6E20390A24D3F74', '完成', '自己的大号', 0, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106762952860, '106762952860', 'www.jdwl.com', '京东快递', '2019-11-11 20:15:28', 898, '浙江杭州市下城区拱墅区东新关小区11幢1单元A247室', '白鹿原', '130****7259', 'https://details.jd.com/normal/item.action?orderid=106762952860&PassKey=71171D2917D48E8CF7A22780A50FC23F', '完成', '京东自己的小号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106763691069, '106763691069', 'www.jdwl.com', '京东快递', '2019-11-11 20:12:54', 898, '浙江杭州市下城区拱墅区东新关小区18幢1单元A247号', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106763691069&PassKey=D9C3F8A9B3D4CA9DE5CD1CE09700CFCE', '完成', '京东老爸的号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106785092435, '106785092435', 'www.jdwl.com', '京东快递', '2019-11-11 23:12:53', 15990, '浙江杭州市下城区拱墅区东新关小区11幢1单元A247室', '白鹿原', '130****7259', 'https://details.jd.com/normal/item.action?orderid=106785092435&PassKey=972C53E6C35FE9AD93D92B90691C3BC1', '完成', '京东自己的小号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106794970618, '106794970618', 'www.jdwl.com', '京东快递', '2019-11-11 23:34:33', 15990, '浙江杭州市下城区拱墅区东新关小区18幢1单元A247号', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106794970618&PassKey=9414FF21044842ADB8890FB8FE388F50', '完成', '京东老爸的号', 1, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106873227728, '', '', '', '2019-11-11 01:46:48', 849, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106873227728&PassKey=B184C474513A8A7E83FCA58E786D7B7D', '付款成功', '京东自己的大号', 0, 0, '在线支付', '京东');
INSERT INTO `orderinfo` VALUES (106876652253, '106876652253', 'www.jdwl.com', '京东快递', '2019-11-11 01:46:48', 848.2, '浙江杭州市下城区拱墅区东新关小区1幢1单元A247室', '白鹿原', '130****7258', 'https://details.jd.com/normal/item.action?orderid=106876652253&PassKey=4DBA05B179AF7BB71693CF89831F5086', '等待收货', '京东自己的大号', 1, 0, '在线支付', '京东');

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
