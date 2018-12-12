# testbootDemoV1
springboot+mybatis+mysql+lombook+druid+maven 简单跑通数据库及登录

# 创建数据库表sql
CREATE TABLE `sys_user` (
    `id` varchar(50) NOT NULL,
    `username` varchar(100) DEFAULT NULL COMMENT '用户名',
    `display_name` varchar(100) DEFAULT NULL COMMENT '显示名',
    `password` varchar(100) DEFAULT NULL COMMENT '密码',
    `salt` varchar(100) DEFAULT NULL COMMENT '盐',
    `org_user_id` varchar(50) DEFAULT NULL,
    `mobile` varchar(20) DEFAULT NULL COMMENT '手机号',
    `telephone` varchar(20) DEFAULT NULL COMMENT '办公电话',
    `mail` varchar(100) DEFAULT NULL COMMENT '邮箱',
    `status` tinyint(3) DEFAULT NULL COMMENT '状态',
    `head_path` varchar(200) DEFAULT NULL COMMENT '头像路径',
    `company` varchar(100) DEFAULT NULL COMMENT '公司名称',
    `department` varchar(100) DEFAULT NULL COMMENT '部门名称',
    `duty_name` varchar(50) DEFAULT NULL COMMENT '职位',
    `belong_depart_name` varchar(50) DEFAULT NULL COMMENT '部门区域',
    `type` tinyint(3) DEFAULT NULL COMMENT '人员类别 1：集团 2：第三方',
    `schedule_notice` tinyint(3) DEFAULT NULL COMMENT '日程安排通知方式 1：短信 0：不通知',
    `agency_notice` tinyint(3) DEFAULT NULL COMMENT '代办工作通知方式 1：短信 0：不通知',
    `read_notice` tinyint(3) DEFAULT NULL COMMENT '阅知工作通知方式  1：短信 0：不通知',
    `update_time` datetime DEFAULT NULL,
    `create_time` datetime DEFAULT NULL COMMENT '创建时间',
    `p_order` varchar(8) DEFAULT NULL COMMENT '人员级别',
    PRIMARY KEY (`id`),
    UNIQUE KEY `username` (`username`) USING BTREE
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';
