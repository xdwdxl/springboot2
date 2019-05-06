/*
 Navicat Premium Data Transfer

 Source Server         : zy
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : dome

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 06/05/2019 16:04:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_entity
-- ----------------------------
DROP TABLE IF EXISTS `user_entity`;
CREATE TABLE `user_entity`  (
  `id` int(20) NOT NULL,
  `number` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `establish` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mechanism` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `role` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `team` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_entity
-- ----------------------------
INSERT INTO `user_entity` VALUES (1, '乳酸菌', '朱烨', '17792932289', '朱烨', '朱烨烨有限责任公司', '董事长', '一组');
INSERT INTO `user_entity` VALUES (2, '小样小乳酸', '朱烨烨', '17792932289', '朱烨', '朱烨烨有限责任公司', '董事长', '二组');
INSERT INTO `user_entity` VALUES (3, '想的我都笑了', '朱烨', '17792932289', '朱烨', '朱烨烨有限责任公司', '董事长', '二组');
INSERT INTO `user_entity` VALUES (4, '想你想的我笑了', '朱烨烨', '17792932289', '朱烨', '朱烨烨有限责任公司', '董事长', '三组');
INSERT INTO `user_entity` VALUES (5, '小样', '朱烨', '17792932289', '朱烨', '朱烨烨有限责任公司', '董事长', '三组');
INSERT INTO `user_entity` VALUES (6, '啊哈哈哈', '朱烨烨', '17792932289', '朱烨', '朱烨烨有限责任公司', '董事长', '一组');
INSERT INTO `user_entity` VALUES (7, 'xdwdxl', 'zhuye', '17792932289', 'zhuye', '朱烨有限责任公司', '董事长', NULL);
INSERT INTO `user_entity` VALUES (8, 'ddd', 'zhuye', '17792932289', 'ssss', 'ddd', 'ss', NULL);
INSERT INTO `user_entity` VALUES (9, 'ss', 'd', '1155', 'ff', 'ss', 'ff', NULL);
INSERT INTO `user_entity` VALUES (10, 'dd', 'ff', '1333', 'fff', 'dd', 'ss', NULL);
INSERT INTO `user_entity` VALUES (11, '222', 'ss', '444', 'cc', 'vv', 'xx', NULL);
INSERT INTO `user_entity` VALUES (12, 'ww', 'sd', '1333', 'ee', 'dd', 'ss', NULL);

SET FOREIGN_KEY_CHECKS = 1;
