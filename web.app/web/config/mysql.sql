delimiter $$

CREATE TABLE `communication` (
  `communication_id` int(11) NOT NULL,
  `from_user_id` int(11) DEFAULT NULL,
  `to_user_id` int(11) DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL,
  `time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `mission` (
  `mission_id` int(11) NOT NULL AUTO_INCREMENT,
  `mission_type_id` int(11) NOT NULL,
  `mission_name` varchar(100) NOT NULL,
  `mission_content` varchar(500) DEFAULT NULL,
  `sources` decimal(10,3) DEFAULT NULL,
  `experience` decimal(10,3) DEFAULT NULL,
  `mission_flag` int(11) DEFAULT NULL COMMENT '(1,new)(2,hot)(3,recommand)',
  `level_limited` decimal(10,3) DEFAULT NULL COMMENT 'for cycle mission',
  `mission_time` bigint(20) DEFAULT NULL COMMENT 'for cycle mission',
  `mission_distance` decimal(10,3) DEFAULT NULL COMMENT 'for cycle mission',
  `cycle_time` decimal(10,3) DEFAULT NULL COMMENT 'for cycle mission',
  `mission_from` varchar(100) DEFAULT NULL COMMENT 'for recommand mission',
  `mission_to` varchar(100) DEFAULT NULL COMMENT 'for recommand mission',
  `mission_place_package` int(11) DEFAULT NULL COMMENT 'for recommand mission',
  `mission_steps` bigint(20) DEFAULT NULL,
  `mission_speed` decimal(10,3) DEFAULT NULL,
  PRIMARY KEY (`mission_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='all mission detail'$$


delimiter $$

CREATE TABLE `mission_package` (
  `mission_package_id` int(11) NOT NULL,
  `mission_package_name` varchar(100) NOT NULL,
  `mission_package_description` varchar(500) DEFAULT NULL,
  `mission_id` int(11) NOT NULL,
  `mission_type_id` int(11) NOT NULL,
  `sequence` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='mission plan.'$$


delimiter $$

CREATE TABLE `mission_place_package` (
  `package_id` int(11) NOT NULL,
  `place_name` varchar(100) DEFAULT NULL,
  `place_point` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='mission place package.'$$


delimiter $$

CREATE TABLE `mission_type` (
  `mission_type_id` int(11) NOT NULL,
  `mission_name` varchar(45) NOT NULL,
  PRIMARY KEY (`mission_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='mission type'$$


delimiter $$

CREATE TABLE `products` (
  `product_id` int(11) NOT NULL,
  `product_name` varchar(45) DEFAULT NULL,
  `product_desc` varchar(450) DEFAULT NULL,
  `scores` decimal(10,3) DEFAULT NULL,
  `money` decimal(10,2) DEFAULT NULL,
  `trigger_type` int(11) DEFAULT NULL COMMENT '1 for or 2 for and',
  `level_limit` decimal(10,3) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '1 for onsale 2 for sellout',
  `discount` decimal(10,3) DEFAULT NULL,
  `image` text,
  `details` text,
  `base_acc` decimal(10,3) DEFAULT NULL,
  `crit` decimal(10,3) DEFAULT NULL,
  `inertia` decimal(10,3) DEFAULT NULL,
  `luck` decimal(10,3) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `running_invite` (
  `invite_id` int(11) NOT NULL,
  `invite_type` varchar(45) DEFAULT NULL COMMENT '1 for online 2 for offline',
  `invite_time` datetime DEFAULT NULL,
  `running_time` datetime DEFAULT NULL,
  `mission_id` int(11) DEFAULT NULL,
  `mission_type` int(11) DEFAULT NULL,
  `invite_title` varchar(100) DEFAULT NULL,
  `invite_content` varchar(200) DEFAULT NULL,
  `invite_user_id` int(11) DEFAULT NULL,
  `friend_user_id` int(11) DEFAULT NULL,
  `invite_status` int(11) DEFAULT NULL COMMENT '1 for pending 2 for ok 3 for done.',
  PRIMARY KEY (`invite_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_email` varchar(200) NOT NULL,
  `user_password` varchar(200) NOT NULL,
  `nick_name` varchar(100) NOT NULL,
  `sex` varchar(45) DEFAULT NULL,
  `user_picture` text,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='user login information.'$$


delimiter $$

CREATE TABLE `user_detail` (
  `user_id` int(11) NOT NULL,
  `level` decimal(10,3) NOT NULL DEFAULT '0.000',
  `scores` decimal(10,3) NOT NULL DEFAULT '0.000',
  `experience` decimal(10,3) NOT NULL DEFAULT '0.000',
  `base_acc` decimal(10,3) NOT NULL DEFAULT '0.000',
  `crit` decimal(10,3) NOT NULL DEFAULT '0.000',
  `inertia_acc` decimal(10,3) NOT NULL DEFAULT '0.000',
  `luck` decimal(10,3) NOT NULL DEFAULT '0.000'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='user detail information.'$$


delimiter $$

CREATE TABLE `user_friend` (
  `user_id` int(11) NOT NULL,
  `friend_id` int(11) NOT NULL,
  `friend_status` int(11) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='user friend'$$


delimiter $$

CREATE TABLE `user_location` (
  `user_id` int(11) NOT NULL,
  `last_location_content` varchar(200) DEFAULT NULL,
  `last_location_point` varchar(200) DEFAULT NULL,
  `last_active_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='user last time location'$$


delimiter $$

CREATE TABLE `user_products_history` (
  `user_id` int(11) NOT NULL,
  `products_id` int(11) DEFAULT NULL,
  `scores` decimal(10,3) DEFAULT NULL,
  `money` decimal(10,3) DEFAULT NULL,
  `buy_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$


delimiter $$

CREATE TABLE `user_running` (
  `user_id` int(11) NOT NULL,
  `mission_id` int(11) DEFAULT NULL,
  `mission_type_id` int(11) DEFAULT NULL,
  `mission_status` int(11) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='user running information(doing)'$$


delimiter $$

CREATE TABLE `user_running_history` (
  `user_id` int(11) NOT NULL,
  `mission_id` int(11) DEFAULT NULL,
  `mission_type_id` int(11) DEFAULT NULL,
  `mission_route` text,
  `mission_start_time` datetime DEFAULT NULL,
  `mission_end_time` datetime DEFAULT NULL,
  `mission_date` date DEFAULT NULL,
  `spend_carlorie` decimal(10,3) DEFAULT NULL,
  `duration` bigint(20) DEFAULT NULL,
  `avg_speed` decimal(10,3) DEFAULT NULL,
  `distance` decimal(10,3) DEFAULT NULL,
  `offer_users` varchar(200) DEFAULT NULL,
  `mission_grade` int(11) DEFAULT NULL,
  `sources` decimal(10,3) DEFAULT NULL,
  `experience` decimal(10,3) DEFAULT NULL,
  `comment` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='user running history.'$$


delimiter $$

CREATE TABLE `version_control` (
  `platform` varchar(50) NOT NULL,
  `version` int(11) NOT NULL,
  `sub_version` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$
