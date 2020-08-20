/*
 Navicat Premium Data Transfer

 Source Server         : myRole
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : 192.168.48.14:3306
 Source Schema         : training_db_xhr

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 19/08/2020 17:56:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `roleid` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色编号',
  `rolename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色内容',
  PRIMARY KEY (`roleid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (8, '程序员');
INSERT INTO `role` VALUES (11, '管理员');
INSERT INTO `role` VALUES (12, 'hr');
INSERT INTO `role` VALUES (13, '架构师');
INSERT INTO `role` VALUES (14, 'boss');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `userid` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`userid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 37 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (30, '彩和', '123456');
INSERT INTO `user` VALUES (31, '华仔', '123456');
INSERT INTO `user` VALUES (33, '浩然', '123456');
INSERT INTO `user` VALUES (34, '荣建', '123456');
INSERT INTO `user` VALUES (35, '振波', '123456');
INSERT INTO `user` VALUES (36, '帅康', '123456');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户角色关联编号',
  `userid` int(11) NULL DEFAULT NULL COMMENT '用户编号',
  `roleid` int(11) NULL DEFAULT NULL COMMENT '角色编号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES (9, 31, 8);
INSERT INTO `user_role` VALUES (11, 31, 8);
INSERT INTO `user_role` VALUES (13, 30, 8);
INSERT INTO `user_role` VALUES (14, 33, 11);
INSERT INTO `user_role` VALUES (15, 35, 8);
INSERT INTO `user_role` VALUES (16, 36, 8);
INSERT INTO `user_role` VALUES (17, 33, 13);

SET FOREIGN_KEY_CHECKS = 1;
